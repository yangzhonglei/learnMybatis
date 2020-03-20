



Mybatis 加载 Mapper配置的四种方式:  
 
第三种 把 Mapper 的xml配置文件单独放置到 resources 中，和Mapper 类分开    

	<mappers>
	     <mapper resource="BlogMapper.xml" />
	</mappers>

好处是便于统一管理 xml 配置文件，不好的的地方是无法使用注解模式了    可以不同名字







