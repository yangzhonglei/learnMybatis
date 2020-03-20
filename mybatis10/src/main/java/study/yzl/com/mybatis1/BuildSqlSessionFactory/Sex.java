package study.yzl.com.mybatis1.BuildSqlSessionFactory;

public enum Sex {

	MALE(1, "男"), FEMALE(2, "女"),XMALE(3, "X");

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

	public static Sex getSex(int id) {

		if (id == 1) {
			return MALE;
		} else if (id == 2) {

			return FEMALE;
		}
		return null;
	}

	private Sex(int id, String name) {
		this.id = id;
		this.name = name;
	}

}
