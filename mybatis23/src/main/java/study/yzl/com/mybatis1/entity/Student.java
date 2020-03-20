package study.yzl.com.mybatis1.entity;

import java.util.List;

public class Student {
	
	
	private int id ;
	
	private String cnname ;
	
	private int selfcardNo ;
	
	private String note ;

	private StudentSelfCard studentSelfCard;
	
	private List<StudentLecture>   studentLectureList ;
	
	private int sex ;
	
	
	private List<StudentHealthMale>   studentHealthMaleList ;
	
	
	
	public List<StudentHealthMale> getStudentHealthMaleList() {
		return studentHealthMaleList;
	}

	public void setStudentHealthMaleList(List<StudentHealthMale> studentHealthMaleList) {
		this.studentHealthMaleList = studentHealthMaleList;
	}
	
	private List<StudentHealthFemale>   studentHealthFemaleList ;
	
	public List<StudentHealthFemale> getStudentHealthFemaleList() {
		return studentHealthFemaleList;
	}

	public void setStudentHealthFemaleList(List<StudentHealthFemale> studentHealthFemaleList) {
		this.studentHealthFemaleList = studentHealthFemaleList;
	}
	
	
	
	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}


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
