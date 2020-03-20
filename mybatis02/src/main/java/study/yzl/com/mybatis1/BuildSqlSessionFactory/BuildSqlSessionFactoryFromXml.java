package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BuildSqlSessionFactoryFromXml {
	
	
	
	public static void main(String[] args) {
		
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		SqlSessionFactory sqlSessionFactory ;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		    
		    
			//老的方式
		try (SqlSession session = sqlSessionFactory.openSession()) {
				  Blog blog = (Blog) session.selectOne("study.yzl.com.mybatis1.BuildSqlSessionFactory.BlogMapper.selectBlog", 101);
				  
				  System.out.println(blog.getName());
				}
		    
			//新的方式
			try (SqlSession session = sqlSessionFactory.openSession()) {
				  BlogMapper mapper = session.getMapper(BlogMapper.class);
				  Blog blog = mapper.selectBlog(101);
				  System.out.println(blog.getName());
				}
			
		    
		    
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	

}
