package study.yzl.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import study.yzl.com.dao.BillMapper;
import study.yzl.com.dao.DeviceMapper;
import study.yzl.com.dao.FileMapper;
import study.yzl.com.dao.RoleMapper;
import study.yzl.com.model.Bill;
import study.yzl.com.model.DevicePOJO;
import study.yzl.com.model.File;
import study.yzl.com.model.Role;

@Controller
public class HelloController {

	
	@Autowired
	private BillMapper billMapper ;
	
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
    @RequestMapping("/getbill")
    @ResponseBody
    public String getbill(Model model) {
    	
    	System.out.println("==============================");
    	 
    	Bill bill1 = new Bill();
    	bill1.setYear(2019);
    	bill1.setId(1);
    	
    	Bill resultBill1 = billMapper.getBill(bill1);
    	
    	System.out.println("=============================="+resultBill1.getAmount());
    	
    	bill1.setYear(2020);
    	
    	Bill resultBill2 = billMapper.getBill(bill1);
    	
     	System.out.println("=============================="+resultBill2.getAmount());
    	String i = "1";
    	return "{\"length\":"+i+"}";
    }
    
}
