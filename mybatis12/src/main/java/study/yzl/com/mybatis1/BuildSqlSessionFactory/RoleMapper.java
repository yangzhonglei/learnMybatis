package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {

	
	public Role getRole(int id);
	public List<Role> findRoleByMap(Map map);
	
	public List<Role> findRoleByAnnotation(@Param(value = "roleName") String roleName ,@Param(value = "note") String note);
	
	public List<Role> findRoleByBean(RoleParam roleParam);
	
	
	public int insertRole(Role role);
	
	public int insertRoleGK(Role role);
	
	public int insertRoleGKSelectKey(Role role);
	
}
