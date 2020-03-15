package study.yzl.com.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.dao.StationMapper;
import study.yzl.com.model.Station;
import study.yzl.com.model.StationExample;
import study.yzl.com.service.StationService;

@Service
public class StationServiceImpl implements StationService {
	
	@Autowired
	private  StationMapper  stationMapper ;

	public long countByCriteria(StationExample example) {
		return stationMapper.countByExample(example);
	}

	@Transactional
	public int deleteByExample(StationExample example) {
		return stationMapper.deleteByExample(example);
	}
	@Transactional
	public int deleteByPrimaryKey(Integer id) {
		return stationMapper.deleteByPrimaryKey(id);
	}
	@Transactional
	public int insert(Station record) {
		return stationMapper.insert(record);
	}
	@Transactional
	public int insertSelective(Station record) {
		return stationMapper.insertSelective(record);
	}

	public List<Station> selectByExampleWithRowbounds(StationExample example, RowBounds rowBounds) {
		return stationMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	public List<Station> selectByExample(StationExample example) {
		return stationMapper.selectByExample(example);
	}

	public Station selectByPrimaryKey(Integer id) {
		return stationMapper.selectByPrimaryKey(id);
	}
	
	@Transactional
	public int updateByExampleSelective(Station record, StationExample example) {
		return stationMapper.updateByExampleSelective(record, example);
	}
	@Transactional
	public int updateByExample(Station record, StationExample example) {
		return stationMapper.updateByExample(record, example);
	}
	@Transactional
	public int updateByPrimaryKeySelective(Station record) {
		return stationMapper.updateByPrimaryKeySelective(record);
	}
	@Transactional
	public int updateByPrimaryKey(Station record) {
		return stationMapper.updateByPrimaryKey(record);
	}

	
	
	
	
	
	
}
