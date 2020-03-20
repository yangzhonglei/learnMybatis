package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class BuildSqlSessionFactory {
	
	
	
	public static void main(String[] args) {
		
		DataSource dataSource = BlogDataSourceFactory.getBlogDataSource();
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("development", transactionFactory, dataSource);
		Configuration configuration = new Configuration(environment);
		
		//configuration.getTypeAliasRegistry().registerAlias("Blog", BlogMapper.class);
//		configuration.getMapperRegistry().
		
		
		configuration.addMapper(BlogMapper.class);
		
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(configuration);
		
		//老的方式
//		try (SqlSession session = sqlSessionFactory.openSession()) {
//			  Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
//			}
//		
		//新的方式
		try (SqlSession session = sqlSessionFactory.openSession()) {
			  BlogMapper mapper = session.getMapper(BlogMapper.class);
			  Blog blog = mapper.selectBlog(101);
			  System.out.println(blog.getName());
			}
		
		
		
		
	}
	

}
