package study.yzl.com.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.dao.SysMenuMapper;
import study.yzl.com.model.SysMenu;
import study.yzl.com.model.SysMenuExample;
import study.yzl.com.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService  {

	@Autowired
	private SysMenuMapper sysMenuMapper ;

	@Override
	public long countByExample(SysMenuExample example) {
		return sysMenuMapper.countByExample(example);
	}
	@Override
	@Transactional
	public int deleteByExample(SysMenuExample example) {
		return sysMenuMapper.deleteByExample(example);
	}
	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		return sysMenuMapper.deleteByPrimaryKey(id);
	}
	@Override
	@Transactional
	public int insert(SysMenu record) {
		return sysMenuMapper.insert(record);
	}
	@Override
	@Transactional
	public int insertSelective(SysMenu record) {
		return sysMenuMapper.insertSelective(record);
	}

	@Override
	public List<SysMenu> selectByExampleWithRowbounds(SysMenuExample example, RowBounds rowBounds) {
		return sysMenuMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<SysMenu> selectByExample(SysMenuExample example) {
		return sysMenuMapper.selectByExample(example);
	}

	@Override
	public SysMenu selectByPrimaryKey(Integer id) {
		return sysMenuMapper.selectByPrimaryKey(id);
	}
	@Override
	@Transactional
	public int updateByExampleSelective(SysMenu record, SysMenuExample example) {
		return sysMenuMapper.updateByExampleSelective(record, example);
	}
	@Override
	@Transactional
	public int updateByExample(SysMenu record, SysMenuExample example) {
		return sysMenuMapper.updateByExample(record, example);
	}
	@Override
	@Transactional
	public int updateByPrimaryKeySelective(SysMenu record) {
		return sysMenuMapper.updateByPrimaryKeySelective(record);
	}
	@Override
	@Transactional
	public int updateByPrimaryKey(SysMenu record) {
		return sysMenuMapper.updateByPrimaryKey(record);
	}
	
}
