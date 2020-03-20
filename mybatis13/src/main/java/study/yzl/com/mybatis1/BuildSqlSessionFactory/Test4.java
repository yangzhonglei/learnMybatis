package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Test4 {

	public static void main(String[] args) {

		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			RoleMapper mapper = session.getMapper(RoleMapper.class);

			RoleParam rp = new RoleParam();
			rp.setNote("te");
			rp.setRoleName("str");
			List<Role> list = mapper.findRoleByBean(rp);
			System.out.println("list.size:"+list.size());
		}

	}

}
