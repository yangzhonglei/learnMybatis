package study.yzl.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.yzl.com.dao.FileMapper;
import study.yzl.com.model.File;

@Controller
public class HelloController {

	
	@Autowired
	private FileMapper fileMapper ;
	
	
    @RequestMapping("/getFile")
    @ResponseBody
    public String getBlog(Model model) {
    	
    	System.out.println("==============================");
    	File f =fileMapper.getFile(1);
    	
    	int i = f.getFile().length;
        return "{\"length\":"+i+"}";
    }

    
    
    
    @RequestMapping("/addFile")
    @ResponseBody
    public String addBlog(Model model) {
    	
    	System.out.println("==============================");
    	File f = new File();
    	f.setFile("WWWWWWWWWWWWW".getBytes());
    	int i = fileMapper.insertFile(f);
    	
        return "{\"length\":"+i+"}";
    }
    
    
    
}
