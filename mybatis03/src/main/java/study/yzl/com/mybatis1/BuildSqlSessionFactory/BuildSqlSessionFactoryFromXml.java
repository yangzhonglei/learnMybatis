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
		SqlSessionFactory sqlSessionFactory;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			// 老的方式  找到指定的sql的 id   执行sql  比用获取 映射器 mapper
			try (SqlSession session = sqlSessionFactory.openSession()) {
				Blog blog = (Blog) session
						.selectOne("study.yzl.com.mybatis1.BuildSqlSessionFactory.BlogMapper.selectBlog", 101);

				System.out.println(blog.getName());
			}

			// 新的方式  对象化的方式
			// 使用mapper 可以进一步屏蔽 SqlSession   具有更强的业务可读性 ，ide 可以帮助检查语法
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
