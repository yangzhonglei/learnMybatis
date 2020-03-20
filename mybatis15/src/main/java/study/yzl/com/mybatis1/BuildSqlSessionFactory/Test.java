package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import org.apache.ibatis.session.SqlSession;

public class Test {

	public static void main(String[] args) {

		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			RoleMapper mapper = session.getMapper(RoleMapper.class);
			Role r = mapper.getRole(1);
			System.out.println("rolename:"+r.getRoleName());
		}

	}

}
