package study.yzl.com.mybatis1;

import org.apache.ibatis.session.SqlSession;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.dao.StudentDao;
import study.yzl.com.mybatis1.entity.Student;

public class Test4 {
	
	
	 public static void main(String[] args) {
			
			try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
				StudentDao dao = session.getMapper(StudentDao.class);
				Student student = dao.getStudent(2);
				String s = "";
				if(student.getSex()==1) {
					 s =  student.getStudentHealthMaleList().get(0).getProstate();
				}else {
					 s =  student.getStudentHealthFemaleList().get(0).getUterus();
				}
				
				System.out.println("i:"+s);
			}
			
		}

}
