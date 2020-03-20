package study.yzl.com.mybatis1.dao;

import java.util.List;

import study.yzl.com.mybatis1.entity.StudentLecture;

public interface StudentLectureDao {
	
	
	public  List<StudentLecture> findStudentLectureByStudentId(int id);
	

}
