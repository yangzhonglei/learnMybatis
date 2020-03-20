package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BuildSqlSessionFactoryFromXml3 {

	public static void main(String[] args) {


			// 新的方式  对象化的方式
			// 使用mapper 可以进一步屏蔽 SqlSession   具有更强的业务可读性 ，ide 可以帮助检查语法
			try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
				BlogMapper mapper = session.getMapper(BlogMapper.class);
				Blog blog = mapper.selectBlog(101);
				System.out.println(blog.getName());
			}


	}

}
