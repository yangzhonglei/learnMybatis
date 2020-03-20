

dao是data access object，即数据访问对象。  
数据可能保存到各种数据库，或者各种文件，或者内存。  
dao层隐藏了这种实现细节，更换数据库或者文件或者内存，对调用dao的更高层来说不受影响。  

mapper和dao不同，mapper的目的是为了把关系数据库映射成java类（对象）。  
因此，如果只有mapper没有dao层，那么一旦项目需要把数据保存到文件或者内存，那么调用mapper的高层就会受到影响。  





Mybatis 加载 Mapper配置的四种方式:  
 
第二种 依据 Mapper 类所在的package包路径 配置 Mapper:  
<configuration>
	<mappers>
		<package name="study.yzl.com.mybatis1.BuildSqlSessionFactory"/>
	</mappers>
</configuration>  


如果是非注解模式的话xml配置文件必须也处于同一级 package 下，且与Mapper类同名







