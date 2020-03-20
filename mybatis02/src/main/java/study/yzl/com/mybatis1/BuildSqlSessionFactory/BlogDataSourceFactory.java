package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import javax.sql.DataSource;

import org.apache.ibatis.datasource.unpooled.UnpooledDataSource;

public class BlogDataSourceFactory {

	public static DataSource getBlogDataSource() {
		
		// MYSQL8的驱动名称是：com.mysql.cj.jdbc.Driver
        //MYSQL8以下的驱动名称是：com.mysql.jdbc.Driver
		String driver ="com.mysql.jdbc.Driver" ;
		
//		mysql JDBC URL格式如下： 
//		jdbc:mysql://[host:port],[host:port].../[database][?参数名1][=参数值1][&参数名2][=参数值2]... 
		String url = "jdbc:mysql://127.0.0.1:3306/demo_ds?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=CONVERT_TO_NULL&allowMultiQueries=true&useSSL=false&tinyInt1isBit=false";
		
		String username="root";
		String password="root";
		UnpooledDataSource   unpooledDataSource = new UnpooledDataSource(driver, url, username, password);
		
		
		return unpooledDataSource;
	}

}
