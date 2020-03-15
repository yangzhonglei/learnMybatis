package study.yzl.com.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.dao.SysRoleMapper;
import study.yzl.com.model.SysRole;
import study.yzl.com.model.SysRoleExample;
import study.yzl.com.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService {
	
	@Autowired
	private SysRoleMapper  sysRoleMapper ;

	public long countByExample(SysRoleExample example) {
		return sysRoleMapper.countByExample(example);
	}
    @Transactional
	public int deleteByExample(SysRoleExample example) {
		return sysRoleMapper.deleteByExample(example);
	}
    @Transactional
	public int deleteByPrimaryKey(Integer id) {
		return sysRoleMapper.deleteByPrimaryKey(id);
	}
    @Transactional
	public int insert(SysRole record) {
		return sysRoleMapper.insert(record);
	}
    @Transactional
	public int insertSelective(SysRole record) {
		return sysRoleMapper.insertSelective(record);
	}

	public List<SysRole> selectByExampleWithRowbounds(SysRoleExample example, RowBounds rowBounds) {
		return sysRoleMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	public List<SysRole> selectByExample(SysRoleExample example) {
		return sysRoleMapper.selectByExample(example);
	}

	public SysRole selectByPrimaryKey(Integer id) {
		return sysRoleMapper.selectByPrimaryKey(id);
	}
	@Transactional
	public int updateByExampleSelective(SysRole record, SysRoleExample example) {
		return sysRoleMapper.updateByExampleSelective(record, example);
	}
	@Transactional
	public int updateByExample(SysRole record, SysRoleExample example) {
		return sysRoleMapper.updateByExample(record, example);
	}
	@Transactional
	public int updateByPrimaryKeySelective(SysRole record) {
		return sysRoleMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	public int updateByPrimaryKey(SysRole record) {
		return sysRoleMapper.updateByPrimaryKey(record);
	}

	 
	
	
	
	
	
	
}
