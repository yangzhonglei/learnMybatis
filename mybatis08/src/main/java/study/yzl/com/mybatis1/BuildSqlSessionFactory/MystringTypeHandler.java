package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

@MappedTypes(String.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class MystringTypeHandler  implements TypeHandler<String> {

	@Override
	public void setParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("======myTypeHandler=====setParameter");
		ps.setString(i, parameter);
		
	}

	@Override
	public String getResult(ResultSet rs, String columnName) throws SQLException {
		System.out.println("======myTypeHandler=====getResult");
		return rs.getString(columnName);
	}

	@Override
	public String getResult(ResultSet rs, int columnIndex) throws SQLException {
		System.out.println("======myTypeHandler=====getResult2");
		return rs.getString(columnIndex);
	}

	@Override
	public String getResult(CallableStatement cs, int columnIndex) throws SQLException {
		System.out.println("======myTypeHandler=====getResult3");
		return cs.getString(columnIndex);
	}

}
