package study.yzl.com.dao;

import study.yzl.com.model.Blog;

public interface BlogMapper {

	public Blog selectBlog(int i);
	
	public int addBlog(Blog blog);
	
	public int selectCountByStatus(String status);

}
