package study.yzl.com.mybatis1;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.dao.StudentDao;
import study.yzl.com.mybatis1.entity.Student;

@SuppressWarnings("unused")
public class Test5 {

	
	 SqlSessionTemplate  sqlSession ;
	 
	 
	 public void init() {
		 
				StudentDao dao = sqlSession.getMapper(StudentDao.class);
				Student student = dao.getStudent(2);
				String s = "";
					 s =  student.getCnname();
				
				System.out.println("========student name======:"+s);
		 
		 
		 
	 }


	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}


	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}
	
}
