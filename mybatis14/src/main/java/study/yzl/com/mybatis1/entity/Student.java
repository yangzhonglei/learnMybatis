package study.yzl.com.mybatis1.entity;

import java.util.List;

public class Student {
	
	
	private int id ;
	
	private String cnname ;
	
	private int selfcardNo ;
	
	private String note ;

	private StudentSelfCard studentSelfCard;
	
	private List<StudentLecture>   studentLectureList ;
	
	
	
	public List<StudentLecture> getStudentLectureList() {
		return studentLectureList;
	}

	public void setStudentLectureList(List<StudentLecture> studentLectureList) {
		this.studentLectureList = studentLectureList;
	}

	public StudentSelfCard getStudentSelfCard() {
		return studentSelfCard;
	}

	public void setStudentSelfCard(StudentSelfCard studentSelfCard) {
		this.studentSelfCard = studentSelfCard;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	 

	public String getCnname() {
		return cnname;
	}

	public void setCnname(String cnname) {
		this.cnname = cnname;
	}

	public int getSelfcardNo() {
		return selfcardNo;
	}

	public void setSelfcardNo(int selfcardNo) {
		this.selfcardNo = selfcardNo;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	

}
