package study.yzl.com.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.model.SysMenu;
import study.yzl.com.model.SysMenuExample;

public interface SysMenuService {

	long countByExample(SysMenuExample example);

	int deleteByExample(SysMenuExample example);

	int deleteByPrimaryKey(Integer id);

	int insert(SysMenu record);

	int insertSelective(SysMenu record);

	List<SysMenu> selectByExampleWithRowbounds(SysMenuExample example, RowBounds rowBounds);

	List<SysMenu> selectByExample(SysMenuExample example);

	SysMenu selectByPrimaryKey(Integer id);

	int updateByExampleSelective(SysMenu record, SysMenuExample example);

	int updateByExample(SysMenu record, SysMenuExample example);

	int updateByPrimaryKeySelective(SysMenu record);

	int updateByPrimaryKey(SysMenu record);

}