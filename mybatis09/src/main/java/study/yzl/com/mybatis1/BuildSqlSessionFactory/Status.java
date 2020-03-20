package study.yzl.com.mybatis1.BuildSqlSessionFactory;

public enum Status {
	
	
	NORMAL(0, "正常"), UNNORMAL(1, "异常");

	private int id;
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

	public static Status getStatus(int id) {

		if (id == 1) {
			return NORMAL;
		} else if (id == 2) {

			return UNNORMAL;
		}
		return null;
	}

	private Status(int id, String name) {
		this.id = id;
		this.name = name;
	}
	

}
