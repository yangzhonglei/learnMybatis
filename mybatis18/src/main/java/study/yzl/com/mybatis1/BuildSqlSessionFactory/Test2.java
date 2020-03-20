package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

public class Test2 {

	public static void main(String[] args) {

		try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
			RoleMapper mapper = session.getMapper(RoleMapper.class);
			Map map = new HashMap();
			map.put("roleName", "str");
			map.put("note", "te");
			List<Role> list = mapper.findRoleByMap(map);
			System.out.println("list.size:"+list.size());
		}

	}

}
