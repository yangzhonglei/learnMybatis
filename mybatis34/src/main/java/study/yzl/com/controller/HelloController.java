package study.yzl.com.controller;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageRowBounds;

//import study.yzl.com.dao.BillMapper;
//import study.yzl.com.dao.DeviceMapper;
//import study.yzl.com.dao.FileMapper;
//import study.yzl.com.dao.RoleMapper;
//import study.yzl.com.model.Bill;
//import study.yzl.com.model.DevicePOJO;
//import study.yzl.com.model.File;
//import study.yzl.com.model.Lecture;
//import study.yzl.com.model.LectureExample;
//import study.yzl.com.model.Role;
//import study.yzl.com.service.LectureService;
//import study.yzl.com.service.RoleService;

@Controller
public class HelloController {

	
//	@Autowired
//	RoleService roleService ;
//	@Autowired
//	LectureService lectureService ;
//	 
//
//    @RequestMapping(path ="/updateRole" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseBody()
//    public Object updateRole(Model model) {
//    	
//    	Role role = new Role();
//    	role.setId(2);
//    	role.setNote("new note2"+ System.currentTimeMillis());
//    	role.setRoleName("new name2"+System.currentTimeMillis());
//    	int i = roleService.updateRole(role);
//    	System.out.println(i);
//    	return role ;
//    }
//    
//    @RequestMapping(path ="/testLecture" ,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    @ResponseBody()
//    public Object testLecture(Model model) {
//    	
//    	
//    	LectureExample example = new LectureExample();
//    	example.createCriteria().andIdEqualTo(1);
//    	List<Lecture> list = lectureService.selectByExample(example );
//    	
//    	return list ;
//    }
    
    
}
