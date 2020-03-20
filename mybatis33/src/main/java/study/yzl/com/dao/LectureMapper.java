package study.yzl.com.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import study.yzl.com.model.Lecture;
import study.yzl.com.model.LectureExample;

public interface LectureMapper {
    long countByExample(LectureExample example);

    int deleteByExample(LectureExample example);

    int insert(Lecture record);

    int insertSelective(Lecture record);

    List<Lecture> selectByExampleWithRowbounds(LectureExample example, RowBounds rowBounds);

    List<Lecture> selectByExample(LectureExample example);

    int updateByExampleSelective(@Param("record") Lecture record, @Param("example") LectureExample example);

    int updateByExample(@Param("record") Lecture record, @Param("example") LectureExample example);
}