

mybatis  代码生成
controller  注解验证 、   开启方法验证 、分组验证
controller  异常处理
controller  返回统一格式json

菜单树生成
中文乱码  解决    web.xml 编码filter

登录验证拦截器

使用lombok 简化

考虑 使用bean 映射  mapstruct 、 jmapper、dozer

分页请求


尝试 抽取 base controller  、base service 、base dao

增加 deleteByIdInBatch

封装 study.yzl.com.web.controller.CommonController.validPara(String, R)   方法
使用代码实现统一的验证 

验证分组类  位置 ：study.yzl.com.web.SysConstants.VALIDATE_GROUP_PACKAGE  + XxxController+ XxxMethod 

第一次 动态加载  验证类
没有找到对应的验证类  则不适用验证分组类


是不是可以考虑 用aop 实现方法的动态调用  --  动态代理 不是继承 ？

或者 采用 组合的方式使用 base controller

@Controller
public class NewController {
    // Autowired fields
    BaseController base;

    protected x toExtend() {
         base.toExtend();
         //new stuff
    }
}



考虑 验证分类的 分开问题  在一个类里有些乱



动态获取当前的方法名


id 回填



增加 swagger 配置 :   

swagger 配置类:     study.yzl.com.web.SwaggerConfig
http://127.0.0.1:9090/demo1/swagger-ui.html

spring-mvc.xml  增加：
	 
	 <mvc:resources location="classpath:/META-INF/resources/" mapping="swagger-ui.html"/>
    <mvc:resources location="classpath:/META-INF/resources/webjars/" mapping="/webjars/**"/>

 pom.xml  增加：
  <dependency>
		    <groupId>io.springfox</groupId>
		    <artifactId>springfox-swagger2</artifactId>
		    <version>2.4.0</version>
		 </dependency>
        <dependency>
		    <groupId>io.springfox</groupId>
		    <artifactId>springfox-swagger-ui</artifactId>
		    <version>2.4.0</version>
        </dependency>
	    
	    
		<!-- jackson用于将springfox返回的文档对象转换成JSON字符串 -->
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-annotations</artifactId>
		    <version>${version.jackson}</version>
		</dependency>
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-databind</artifactId>
		    <version>${version.jackson}</version>
		</dependency>
		<dependency>
		    <groupId>com.fasterxml.jackson.core</groupId>
		    <artifactId>jackson-core</artifactId>
		    <version>${version.jackson}</version>
		</dependency>
	    <!-- jackson end -->



springfox   可以参考    https://github.com/springfox/springfox-demos




