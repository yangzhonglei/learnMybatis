



Mybatis 加载 Mapper配置的四种方式:  
 
第四种  直接在spring中配置Mapper的路径    

配置 mapperLocations -- 哪里去找mapper文件 
<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">  
		<property name="dataSource" ref="dataSource" />  
		<property name="typeAliasesPackage" value="实体类包路径" />  
		<property name="typeAliasesSuperType" value="实体类顶级包路径" />  
		
		<property name="mapperLocations" value="classpath:/mybatis/mappings/**/*.xml" />  
		<property name="configLocation" value="classpath:/mybatis/mybatis-config.xml"></property>  
		
	</bean>  

 配置 basePackage -- 哪里去找mapper类
<bean id="mapperScannerConfigurer" class="org.mybatis.spring.mapper.MapperScannerConfigurer">
		<property name="basePackage" value="mapper类的包路径" />
		<property name="sqlSessionFactoryBeanName" value="sqlSessionFactory" />
	</bean>
	
	






