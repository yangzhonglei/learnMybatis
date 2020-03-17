package study.yzl.com.web.controller;

import org.springframework.util.StringUtils;

import study.yzl.com.web.SysConstants;

public class Test {
	
	
	public static void main(String[] args) {
		
		Test  t = new Test();
		t.test2();
		
	}
	
	
	public void  test2(){
		
//		System.out.println( this.getClass().getName());
//		System.out.println( this.getClass().getCanonicalName());
//		System.out.println( this.getClass().getPackage().getName());
//		System.out.println(System.Reflection.MethodBase.GetCurrentMethod().Name);
//		Thread.currentThread().getStackTrace();
		
//		String classFullName = Thread.currentThread().getStackTrace()[1].getClassName();
//		String packageName = classFullName.substring(0,classFullName.lastIndexOf("."));
//		String packageFatherName  = packageName.substring(0,packageName.lastIndexOf("."));
//		String clasShortName = classFullName.substring(classFullName.lastIndexOf(".")+1);
////		String  currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
//		String  currentMethodNameUpper = StringUtils.capitalize(currentMethodName);
//		String validateGroupClassName =packageFatherName+".vo.validateGroup." + clasShortName+currentMethodNameUpper;
//		
		String classFullName = Thread.currentThread().getStackTrace()[1].getClassName();
		String clasShortName = classFullName.substring(classFullName.lastIndexOf(".")+1);
	    String  currentMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
	    String  currentMethodNameUpper = StringUtils.capitalize(currentMethodName);
	    String validateGroupClassName = SysConstants.VALIDATE_GROUP_PACKAGE+clasShortName+currentMethodNameUpper;
	    		
		System.out.println(  validateGroupClassName);
		
//		
//		try {
//			Class.forName(validateGroupClassName);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("=====");
//			e.printStackTrace();
//		}
//		
		
//		System.out.println("=====");
//		System.out.println(packageFatherName+".vo.validateGroup");
//		System.out.println("=====");
//		System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
//		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
//		System.out.println(Thread.currentThread().getStackTrace()[1]);
		
	}

}
