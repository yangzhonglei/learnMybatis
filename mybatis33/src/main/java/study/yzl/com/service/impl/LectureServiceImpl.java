package study.yzl.com.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.yzl.com.dao.LectureMapper;
import study.yzl.com.model.Lecture;
import study.yzl.com.model.LectureExample;
import study.yzl.com.service.LectureService;

@Service
public class LectureServiceImpl implements LectureService {
	
	@Autowired
	private  LectureMapper lLectureMapper;

	@Override
	public long countByExample(LectureExample example) {
		return lLectureMapper.countByExample(example);
	}

	@Override
	@Transactional
	public int deleteByExample(LectureExample example) {
		return lLectureMapper.deleteByExample(example);
	}

	@Override
	@Transactional
	public int insert(Lecture record) {
		return lLectureMapper.insert(record);
	}

	@Override
	@Transactional
	public int insertSelective(Lecture record) {
		return lLectureMapper.insertSelective(record);
	}

	@Override
	public List<Lecture> selectByExampleWithRowbounds(LectureExample example, RowBounds rowBounds) {
		return lLectureMapper.selectByExampleWithRowbounds(example, rowBounds);
	}

	@Override
	public List<Lecture> selectByExample(LectureExample example) {
		return lLectureMapper.selectByExample(example);
	}

	@Override
	@Transactional
	public int updateByExampleSelective(Lecture record, LectureExample example) {
		return lLectureMapper.updateByExampleSelective(record, example);
	}

	@Override
	@Transactional
	public int updateByExample(Lecture record, LectureExample example) {
		return lLectureMapper.updateByExample(record, example);
	}
	
	
	

}
