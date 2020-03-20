package study.yzl.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.yzl.com.dao.BlogMapper;
import study.yzl.com.model.Blog;
import study.yzl.com.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper ;
	
	
	
	
	@Override
	public Blog getBlog(int id) {
		Blog blog = blogMapper.selectBlog(0);
		return blog;
	}

	

	
	
	
}
