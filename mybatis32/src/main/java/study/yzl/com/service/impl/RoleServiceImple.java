package study.yzl.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.dao.RoleMapper;
import study.yzl.com.model.Role;
import study.yzl.com.service.RoleService;


@Service
public class RoleServiceImple implements RoleService {

	
	@Autowired
	private RoleMapper roleMapper ;
	
	
	@Transactional
	public int updateRole(Role role) {
		 
		int i = roleMapper.updateRole(role);
		
		return i;
		
	}

}
