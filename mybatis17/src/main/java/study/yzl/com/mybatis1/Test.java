package study.yzl.com.mybatis1;

import org.apache.ibatis.session.SqlSession;

import study.yzl.com.mybatis1.BuildSqlSessionFactory.SqlSessionFactoryUtil;
import study.yzl.com.mybatis1.dao.StudentSelfCardDao;
import study.yzl.com.mybatis1.entity.StudentSelfCard;

public class Test {
	
	
	 public static void main(String[] args) {
		
				try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
					StudentSelfCardDao dao = session.getMapper(StudentSelfCardDao.class);
					StudentSelfCard studentSelfCard = dao.findStudentCardByStudentId(1);
					System.out.println("i:"+studentSelfCard.getNativ());
					StudentSelfCard studentSelfCard2 = dao.findStudentCardByStudentId(1);
					System.out.println("i:"+studentSelfCard2.getNativ());
					
					
					 
				}
				try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
					StudentSelfCardDao dao = session.getMapper(StudentSelfCardDao.class);
					StudentSelfCard studentSelfCard = dao.findStudentCardByStudentId(1);
					System.out.println("i:"+studentSelfCard.getNativ());
					StudentSelfCard studentSelfCard2 = dao.findStudentCardByStudentId(1);
					System.out.println("i:"+studentSelfCard2.getNativ());
					
					
					 
				}
				
			}

}
