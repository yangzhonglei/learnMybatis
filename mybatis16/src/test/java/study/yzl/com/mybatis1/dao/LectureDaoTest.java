package study.yzl.com.mybatis1.dao;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.entity.Lecture;
import study.yzl.com.mybatis1.entity.StudentSelfCard;

public class LectureDaoTest {
	
	
	
	
	@Test
	public void findStudentCardByStudentIdTest(){
		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			LectureDao dao = session.getMapper(LectureDao.class);
			Lecture lecture = dao.getLecture(1);
			System.out.println(""+lecture.getLectureName());
			assertEquals("english",lecture.getLectureName());
		}
		
	}
	

}
