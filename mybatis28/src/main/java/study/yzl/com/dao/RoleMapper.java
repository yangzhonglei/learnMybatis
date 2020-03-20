package study.yzl.com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import study.yzl.com.model.Role;

public interface RoleMapper {

	
	
	
	public List<Role> findAllRole();
	
	
	
	public int updateRoleBatch1(List<Role> role);
	
	
	public int updateRoleBatch2(List<Role> role);
}
