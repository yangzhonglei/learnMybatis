package study.yzl.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.yzl.com.model.Blog;
import study.yzl.com.service.BlogService;

@Controller
public class HelloController {

	
	@Autowired
	private BlogService blogService ;
	
	
    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
    
    @RequestMapping("/getBlog")
    @ResponseBody
    public Blog getBlog(Model model) {
    	
    	System.out.println("==============================");
    	Blog blog = blogService.getBlog(0);
        
        
        return blog;
    }

    
    
    
    
    
    
	public BlogService getBlogService() {
		return blogService;
	}

	public void setBlogService(BlogService blogService) {
		this.blogService = blogService;
	}
    
    
    
    
}
