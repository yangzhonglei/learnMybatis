package study.yzl.com.mybatis1;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.Blog;
import study.yzl.com.mybatis1.BuildSqlSessionFactory.BlogMapper;
import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.dao.StudentDao;
import study.yzl.com.mybatis1.entity.Student;

@SuppressWarnings("unused")
public class Test5 {

	SqlSessionTemplate sqlSession;

	public void init() {

		BlogMapper dao = sqlSession.getMapper(BlogMapper.class);
		Blog blog = dao.selectBlog(0);
		String s = blog.getName();

		System.out.println("========blog name======:" + s);

	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

}
