 
 
resultMap 元素结构  

<resultMap>
	<constructor>
		<idArg/>
		<arg/>
	</constructor>
	<id/>
	<result/>
	<association/>
	<collection/>
	<discriminator>
		<case/>
	</discriminator>
</resultMap>
  

constructor   pojo 不存在没有参数的构造方法是   使用constructor  ,告诉mybatis 通过调这个构造pojo

id   表示那个列是主键    允许多个主键


association  、collection、discriminator  用于级联


1、任何的语句都可以使用map 存储结果集    但是可读性下降  不推荐   
要使用的话 配置 resultType="map"   


2、使用pojo存储结果集  
  pojo 是最常用  也是推荐的方式
  
  
基本映射 ：（resultType）使用resultType进行输出映射，只有查询出来的列名和pojo中的属性名一致，该列才可以映射成功。  
                  （数据库，实体，查询字段,这些全部都得一一对应）  
                  
高级映射 ：（resultMap） 如果查询出来的列名和pojo的属性名不一致，通过定义一个resultMap对列名和pojo属性名之间作一个映射关系。  
                   （高级映射，字段名称可以不一致，通过映射来实现）

resultType和resultMap功能类似 ，都是返回对象信息 ，但是resultMap要更强大一些 ，可自定义。
因为resultMap要配置一下，表和类的一一对应关系，所以说就算你的字段名和你的实体类的属性名不一样也没关系，
都会给你映射出来，但是，resultType就比较鸡肋了，必须字段名一样，比如说 cId和c_id 这种的都不能映射   


-------

级联 
association 一对一   column 要传给 里面的select的参数 多个用逗号分割

     <association property="studentSelfCard" column="id" 
       select="study.yzl.com.mybatis1.dao.StudentSelfCardDao.findStudentCardByStudentId">
     </association>  

collection  一对多   

   <collection property="studentLectureList"  column="id"  
     	select="study.yzl.com.mybatis1.dao.StudentLectureDao.findStudentLectureByStudentId">
     </collection>

     
     
     
     