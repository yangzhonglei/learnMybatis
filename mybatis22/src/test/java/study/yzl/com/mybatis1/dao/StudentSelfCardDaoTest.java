package study.yzl.com.mybatis1.dao;

import static org.junit.Assert.assertEquals;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.Role;
import study.yzl.com.mybatis1.BuildSqlSessionFactory.RoleMapper;
import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.entity.StudentSelfCard;

public class StudentSelfCardDaoTest {
	
	
	@Test
	public void findStudentCardByStudentIdTest(){
		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			StudentSelfCardDao dao = session.getMapper(StudentSelfCardDao.class);
			StudentSelfCard studentSelfCard = dao.findStudentCardByStudentId(1);
			System.out.println("i:"+studentSelfCard.getNativ());
			assertEquals("sd",studentSelfCard.getNativ());
		}
		
	}
	
	

}
