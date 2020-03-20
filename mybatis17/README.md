

缓存 

/mybatis17/src/main/java/study/yzl/com/mybatis1/Test.java  中第二次的查询  并没有执行sql -- 从日志可以看出  

mybatis默认情况下 只开启一级缓存 -- 同一个SqlSession对象
在参数和 sql 完全相同的情况下  使用同一个SqlSession对象 调用同一个mapper方法  往往只执行一次sql  
SqlSession第一次查询后  mybatis会将其放在缓存中， 以后再查询的时候 如果没有声明需要刷新 ，  
并且缓存没有超时的情况下  SqlSession 都只会取出当前缓存的数据 而不会再次发送sql到数据库




二级缓存  
实现二级缓存的时候 mybatis要求  返回的 pojo必须是要能序列化的 


在myBatis-config 中添加开启二级缓存的条件

<!-- 通知 MyBatis 框架开启二级缓存 -->
<settings>
  <setting name="cacheEnabled" value="true"/>
</settings>
DeptDao.xml

还需要在 Mapper 对应的xml中添加 cache 标签，表示对哪个mapper 开启缓存

<!-- 表示DEPT表查询结果保存到二级缓存(共享缓存) -->
<cache/>




在mapper.xml 中配置开启二级缓存   
<cache ></cache>  

配置了这个配置意味着：  
1、映射语句中的所有的select语句将被缓存  
2、映射语句中的所有的 insert update delete 将刷新缓存  
3、默认使用 LRU算法回收  
4、没设置flushInterval   将不会以时间间隔刷新  




cache 标签有多个属性，一起来看一些这些属性分别代表什么意义  

eviction: 缓存回收策略，有这几种回收策略  
LRU - 最近最少回收，移除最长时间不被使用的对象  
FIFO - 先进先出，按照缓存进入的顺序来移除它们  
SOFT - 软引用，移除基于垃圾回收器状态和软引用规则的对象  
WEAK - 弱引用，更积极的移除基于垃圾收集器和弱引用规则的对象  
默认是 LRU 最近最少回收策略  



flushinterval 缓存刷新间隔，缓存多长时间刷新一次，默认不清空，设置一个毫秒值  
readOnly: 是否只读；true 只读，MyBatis 认为所有从缓存中获取数据的操作都是只读操作，不会修改数据。  
          MyBatis 为了加快获取数据，直接就会将数据在缓存中的引用交给用户。不安全，速度快。读写(默认)：MyBatis 觉得数据可能会被修改    
size : 缓存存放多少个元素  
type: 指定自定义缓存的全类名(实现Cache 接口即可)  
blocking： 若缓存中找不到对应的key，是否会一直blocking，直到有对应的数据进入缓存。  


-------
  
  那么究竟应该不应该使用二级缓存呢？先来看一下二级缓存的注意事项：  

缓存是以namespace为单位的，不同namespace下的操作互不影响。  
insert,update,delete操作会清空所在namespace下的全部缓存。  
通常使用MyBatis Generator生成的代码中，都是各个表独立的，每个表都有自己的namespace。  
多表操作一定不要使用二级缓存，因为多表操作进行更新操作，一定会产生脏数据。  
如果你遵守二级缓存的注意事项，那么你就可以使用二级缓存。  

但是，如果不能使用多表操作，二级缓存不就可以用一级缓存来替换掉吗？  
而且二级缓存是表级缓存，开销大，没有一级缓存直接使用 HashMap 来存储的效率更高，所以二级缓存并不推荐使用。  



-------
  三、Cache使用时的注意事项

1. 只能在【只有单表操作】的表上使用缓存

不只是要保证这个表在整个系统中只有单表操作，而且和该表有关的全部操作必须全部在一个namespace下。

2. 在可以保证查询远远大于insert,update,delete操作的情况下使用缓存

这一点不需要多说，所有人都应该清楚。记住，这一点需要保证在1的前提下才可以！
-------

四、避免使用二级缓存

可能会有很多人不理解这里，二级缓存带来的好处远远比不上他所隐藏的危害。

缓存是以namespace为单位的，不同namespace下的操作互不影响。

insert,update,delete操作会清空所在namespace下的全部缓存。

通常使用MyBatis Generator生成的代码中，都是各个表独立的，每个表都有自己的namespace。

为什么避免使用二级缓存

在符合【Cache使用时的注意事项】的要求时，并没有什么危害。

其他情况就会有很多危害了。

针对一个表的某些操作不在他独立的namespace下进行。

例如在UserMapper.xml中有大多数针对user表的操作。但是在一个XXXMapper.xml中，还有针对user单表的操作。

这会导致user在两个命名空间下的数据不一致。如果在UserMapper.xml中做了刷新缓存的操作，在XXXMapper.xml中缓存仍然有效，如果有针对user的单表查询，使用缓存的结果可能会不正确。

更危险的情况是在XXXMapper.xml做了insert,update,delete操作时，会导致UserMapper.xml中的各种操作充满未知和风险。

有关这样单表的操作可能不常见。但是你也许想到了一种常见的情况。

多表操作一定不能使用缓存

为什么不能？

首先不管多表操作写到那个namespace下，都会存在某个表不在这个namespace下的情况。

例如两个表：role和user_role，如果我想查询出某个用户的全部角色role，就一定会涉及到多表的操作。

<select id="selectUserRoles" resultType="UserRoleVO">
    select * from user_role a,role b where a.roleid = b.roleid and a.userid = #{userid}
</select>
 

像上面这个查询，你会写到那个xml中呢？？

不管是写到RoleMapper.xml还是UserRoleMapper.xml，或者是一个独立的XxxMapper.xml中。如果使用了二级缓存，都会导致上面这个查询结果可能不正确。

如果你正好修改了这个用户的角色，上面这个查询使用缓存的时候结果就是错的。

这点应该很容易理解。

在我看来，就以MyBatis目前的缓存方式来看是无解的。多表操作根本不能缓存。

如果你让他们都使用同一个namespace（通过<cache-ref>）来避免脏数据，那就失去了缓存的意义。

看到这里，实际上就是说，二级缓存不能用。整篇文章介绍这么多也没什么用了。



-------
 最后还是建议，放弃二级缓存，在业务层使用可控制的缓存代替更好。    
     
     
     