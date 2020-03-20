package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.type.EnumOrdinalTypeHandler;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BuildSqlSessionFactoryFromXml3 {

	public static void main(String[] args) {


			// 新的方式  对象化的方式
			// 使用mapper 可以进一步屏蔽 SqlSession   具有更强的业务可读性 ，ide 可以帮助检查语法
			try (SqlSession session = SqlSessionFactoryUtil.getSqlSession()) {
				BlogMapper mapper = session.getMapper(BlogMapper.class);
				Blog blog = mapper.selectBlog(101);
				 
				System.out.println(JSON.toJSONString(blog));
				
				Blog blog2 =  new Blog();
				blog2.setId(0);
				blog2.setName("test");
				blog2.setSex(Sex.MALE);
				blog2.setStatus(Status.NORMAL);
				
				int i = mapper.addBlog(blog2);
				session.commit();
				System.out.println(i);
			}
			//org.apache.ibatis.type.JdbcType.INTEGER
	}

}
