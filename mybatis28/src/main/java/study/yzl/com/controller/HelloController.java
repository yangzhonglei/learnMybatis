package study.yzl.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.yzl.com.dao.DeviceMapper;
import study.yzl.com.dao.FileMapper;
import study.yzl.com.dao.RoleMapper;
import study.yzl.com.model.DevicePOJO;
import study.yzl.com.model.File;
import study.yzl.com.model.Role;

@Controller
public class HelloController {

	
	@Autowired
	private DeviceMapper deviceMapper ;
	@Autowired
	private FileMapper fileMapper ;
	
	@Autowired
	private RoleMapper roleMapper ;
	
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
    
    @RequestMapping("/updateRole1")
    @ResponseBody
    public String updateRole1(Model model) {
    	
    	System.out.println("==============================");
    	
    	List<Role> list = roleMapper.findAllRole();
    	
    	 
    	for(Role r : list) {
    		
    		r.setRoleName(r.getRoleName()+"XXX");
    		r.setNote(r.getNote()+"YYY");
    		
    	}
    	
    	int i =roleMapper.updateRoleBatch1(list);
    	
    	return "{\"length\":"+i+"}";
    }
    @RequestMapping("/updateRole2")
    @ResponseBody
    public String updateRole2(Model model) {
    	
    	System.out.println("==============================");
    	
    	List<Role> list = roleMapper.findAllRole();
    	
    	
    	for(Role r : list) {
    		
    		r.setRoleName(r.getRoleName()+"XXX");
    		r.setNote(r.getNote()+"YYY");
    		
    	}
    	
    	int i =roleMapper.updateRoleBatch2(list);
    	
    	return "{\"length\":"+i+"}";
    }
    
    @RequestMapping("/invokeProcedure")
    @ResponseBody
    public String invokeProcedure(Model model) {
    	
    	System.out.println("==============================");
    	DevicePOJO devicePOJO = new DevicePOJO();
    	devicePOJO.setDevoceName("name");
    	deviceMapper.count(devicePOJO);
    	String i = devicePOJO.getDeviceCount();
    	return "{\"length\":"+i+"}";
    }
    
}
