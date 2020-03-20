package study.yzl.com.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
	private RoleMapper roleMapper ;
	
    @RequestMapping(path ="/getRolePage" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody()
    public Object getRolePage(Model model) {
    	
    	RowBounds rowBounds = new RowBounds(1, 2);
    	
    	List<Role> list = roleMapper.findAllRole2(rowBounds);
    	
    	 
        return list ;
    }

    
    
}
