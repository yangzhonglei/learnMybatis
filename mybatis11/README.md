 
 
 MyBatis 的自动映射功能是建立在 resultMap 基础之上的。  
 resultType 属性自动映射的原理是，当 sql 映射输出配置为 resultType 时，MyBatis 会生成一个空的 resultMap，  
 然后指定这个 resultMap 的 type 为指定的 resultType 的类型，  
 接着 MyBatis 检测查询结果集中字段与指定 type 类型中属性的映射关系，对结果进行自动映射。  


自动映射器 在mybatis配置文件的 setting中设置  默认值是PARTIAL

<setting name="autoMappingBehavior" value="PARTIAL"/>
取值：

NONE     表示不启用自动映射  
PARTIAL  表示只对非嵌套的 resultMap 进行自动映射  
FULL     表示对所有的 resultMap 都进行自动映射  

数据库中一些字段是通过下划线分割的 和java中属性驼峰不同    自动映射需要设置下划线转驼峰  
配置下划线转驼峰   
<setting name="mapUnderscoreToCamelCase" value="true" />
  
  

  INSERT INTO demo_ds.`role` (id,role_name,note) VALUES 
(1,'testrolename','note')
,(2,'testrooooo','tete')
,(3,'strxx','teyyy')
;
  
传递参数 3种方式  
map 传参  可读性不好  后期维护困难  不建议  
@Param   传参 一般参数少于5 个 合适  多了可读性变差  
javabean 传参 直观，一般参数多于5个使用。  但需要建一个实体类，扩展不容易--需要加属性。  
  
  






