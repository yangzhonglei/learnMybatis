package study.yzl.com.mybatis1;

import org.apache.ibatis.session.SqlSession;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.dao.StudentDao;
import study.yzl.com.mybatis1.dao.StudentSelfCardDao;
import study.yzl.com.mybatis1.entity.Student;
import study.yzl.com.mybatis1.entity.StudentSelfCard;

public class Test2 {
	
	
	 public static void main(String[] args) {
		
				try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
					StudentDao dao = session.getMapper(StudentDao.class);
					Student student = dao.getStudent(1);
					System.out.println("i:"+student.getStudentSelfCard().getNote());
				}
				
			}

}
