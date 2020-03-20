package study.yzl.com.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import study.yzl.com.model.Lecture;
import study.yzl.com.model.LectureExample;

public interface LectureService {

	long countByExample(LectureExample example);

	int deleteByExample(LectureExample example);

	int insert(Lecture record);

	int insertSelective(Lecture record);

	List<Lecture> selectByExampleWithRowbounds(LectureExample example, RowBounds rowBounds);

	List<Lecture> selectByExample(LectureExample example);

	int updateByExampleSelective(Lecture record, LectureExample example);

	int updateByExample(Lecture record, LectureExample example);

}