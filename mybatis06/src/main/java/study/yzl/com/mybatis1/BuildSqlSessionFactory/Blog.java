package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import org.apache.ibatis.type.Alias;

@Alias(value = "Blog")
public class Blog {
	
	private int id ;
	
	private String name;

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
	
	

}
