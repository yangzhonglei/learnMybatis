package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//辅助类。创建SqlSession对象
public class SqlSessionFactoryUtil {
	static SqlSessionFactory factory = null;
	static InputStream is = null;
	static {// 用一个静态块读取配置文件，获取返回的文件流。静态块在编译时就初始化
		try {
			is = Resources.getResourceAsStream("mybatis-config.xml");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

     //采用单例模式来保证工厂创建唯一
	public static SqlSessionFactory getSqlSessionFactory()  {
		
		Properties p = null;
		if (factory == null) {
			// 创建SqlsessionFactory工厂
			synchronized (SqlSessionFactoryUtil.class) {
				if (factory == null) {// 二次检查
					
					try {
						InputStream ist = Resources.getResourceAsStream("jdbc.properties");
						InputStreamReader r = new InputStreamReader(ist);
						p = new Properties();
						p.load(r);
						p.setProperty("username", EncodeUtil.decode(p.getProperty("username")));
						p.setProperty("password", EncodeUtil.decode(p.getProperty("password")));
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}					
					factory = new SqlSessionFactoryBuilder().build(is, p);
				}
			}
		}
		return factory;
	}

	//获取SqlSession对象
	public static SqlSession getSqlSession() {

		return getSqlSessionFactory().openSession();
	}

}
