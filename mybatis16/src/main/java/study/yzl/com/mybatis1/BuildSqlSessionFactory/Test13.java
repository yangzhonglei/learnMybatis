package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Test13 {

	public static void main(String[] args) {

		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			RoleMapper mapper = session.getMapper(RoleMapper.class);
            Role role = new Role();
            role.setId(1);
            role.setRoleName("test123");
		    role.setNote("note123333333333");
		    int i = mapper.updateRole(role);
		    session.commit();
			System.out.println("i:"+i);
			
            role.setId(1);
            role.setRoleName("test123");
		    role.setNote("note123333333333");
		    int ii = mapper.deleteRole(role);
		    session.commit();
			System.out.println("ii:"+ii);
			
			
		}

	}

}
