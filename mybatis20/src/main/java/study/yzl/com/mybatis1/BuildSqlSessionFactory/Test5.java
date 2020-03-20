package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Test5 {

	public static void main(String[] args) {

		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			RoleMapper mapper = session.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setRoleName("test123");
		    role.setNote("note123");
		    int i = mapper.insertRole(role);
		    session.commit();
			System.out.println("i:"+i);
			System.out.println("role id:"+role.getId());
		}

	}

}
