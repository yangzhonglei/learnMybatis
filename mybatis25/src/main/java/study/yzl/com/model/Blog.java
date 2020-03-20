package study.yzl.com.model;

import org.apache.ibatis.type.Alias;

@Alias(value = "Blog")
public class Blog {
	
	private int id ;
	
	private String name;

	private   Sex sex ;
	
	private   Status status ;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}



}
