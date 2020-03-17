package study.yzl.com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;
import study.yzl.com.service.SysLogAcctService;
import study.yzl.com.utils.ResponseMessage;
import study.yzl.com.web.SysConstants;
import study.yzl.com.web.vo.StationRequestVO;

//@Controller
//@Slf4j
//@RequestMapping("/station")
public class StationController44 {
	
	
//	@Autowired
//	Validator validateor ;
	
	
	@Autowired
	private SysLogAcctService sysLogAcctService ;
	
	@Autowired()
	@Qualifier("cacheManager")
	private SimpleCacheManager cacheManager ;
	
	@PostMapping(path = "/add")
	@ResponseBody
	public Object addOne(StationRequestVO station) {
		String currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
		ValidationResult result = validPara(currentMethodName+"qq",station);
		if (result.isHasErrors()) {
			String errMsg = ValidationUtils.getFirstErrMsg(result);
			return ResponseMessage.failMessage(errMsg);
		}
		
		
		
		
		return ResponseMessage.successMessage(station);
	}
	
	
	
	private ValidationResult validPara(String currentMethodName, StationRequestVO station) {
		
		ValidationResult result = null;
		String ValidateGroupClassName = getValidateGroupClassName( currentMethodName);
		System.out.println("==========================="+ValidateGroupClassName);
		Class<?> validateGroupClass = getGRoup(ValidateGroupClassName);
		if(validateGroupClass == null) {
			result = ValidationUtils.validateEntity(station);
		}else {
			result = ValidationUtils.validateEntity(station,validateGroupClass);
		}
		return result;
	}



	private Class<?> getGRoup(String validateGroupClassName) {
		
		ValueWrapper vm =cacheManager.getCache("springMapCache").get(validateGroupClassName);
		if(vm!=null) {
			Class clazz = (Class) vm.get();
			return clazz;
		}
		Class<?> clz = null;
		try {
			clz = Class.forName(validateGroupClassName);
			
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			//log.warn("can not find validate group class ,class name:{}",validateGroupClassName);
		}
		cacheManager.getCache("springMapCache").put(validateGroupClassName, clz);
		return clz;
	}
	
	
	
	private static String  getValidateGroupClassName(String currentMethodName){
		
		String classFullName = Thread.currentThread().getStackTrace()[1].getClassName();
		String clasShortName = classFullName.substring(classFullName.lastIndexOf(".")+1);
	    String currentMethodNameUpper = StringUtils.capitalize(currentMethodName);
	    String validateGroupClassName = SysConstants.VALIDATE_GROUP_PACKAGE+clasShortName+currentMethodNameUpper;
	    return validateGroupClassName ;
	}
	

}
