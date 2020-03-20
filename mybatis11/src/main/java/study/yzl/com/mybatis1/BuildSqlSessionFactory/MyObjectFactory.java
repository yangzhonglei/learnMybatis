package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.util.List;
import java.util.Properties;

import org.apache.ibatis.reflection.factory.DefaultObjectFactory;

public class MyObjectFactory extends DefaultObjectFactory {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6915800925688292004L;

	@Override
	public void setProperties(Properties properties) {
		
		System.out.println("===MyObjectFactory===setProperties");
		
		super.setProperties(properties);
	}

	@Override
	public <T> T create(Class<T> type) {
		System.out.println("===MyObjectFactory===create");
		return super.create(type);
	}

	@Override
	public <T> T create(Class<T> type, List<Class<?>> constructorArgTypes, List<Object> constructorArgs) {
		System.out.println("===MyObjectFactory===create2");
		return super.create(type, constructorArgTypes, constructorArgs);
	}

	@Override
	public <T> boolean isCollection(Class<T> type) {
		System.out.println("===MyObjectFactory===isCollection");
		return super.isCollection(type);
	}

}
