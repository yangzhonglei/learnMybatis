package study.yzl.com.mybatis1.BuildSqlSessionFactory;

import org.apache.ibatis.annotations.Select;

public interface BlogMapper {

	
	@Select(" select * from Blog where id = #{id}")
	public Blog selectBlog(int i);

}
