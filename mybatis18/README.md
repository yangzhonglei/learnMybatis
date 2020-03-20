
使用  mybatis-spring   

xml 配置的话    
1、要配置  数据源  
2、要配置 sqlSessionFactory  
3、配置   SqlSessionTemplate
4、配置spring 事物管理器  
5、配置 mapper的发现：  
有几种办法来发现映射器：  
   使用 <mybatis:scan/> 元素  
   使用 @MapperScan 注解  
   在经典 Spring XML 配置文件中注册一个 MapperScannerConfigurer  
   
  <mybatis:scan/> 和 @MapperScan 都在 MyBatis-Spring 1.2.0 中被引入。@MapperScan 需要你使用 Spring 3.1+。  
  
  MapperScannerConfigurer将扫描basePackage所指定的包下的所有接口类（包括子类），如果它们在SQL映射文件中定义过，则将它们动态定义为一个Spring Bean



     
MapperScannerConfigurer  和  @MapperScan 注解有  都有以下属性：  注意一下含义 
- annotationClass: 扫描器将注册所有的在 base-package 包内并且匹配指定注解的映射器 Mapper 接口。
- markerInterface: 扫描器将注册在 base-package 包中的并且继承了特定的接口类的映射器 Mapper 接口



