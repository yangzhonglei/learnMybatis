package study.yzl.com.mybatis1.BuildSqlSessionFactory;

public class EncodeUtil {
	
	
	
	public static String encode(String str) {
		
		return   AesEncodeUtil.encrypt(str) ;
	}
	
	
	public static String decode(String str) {
		
		return   AesEncodeUtil.decrypt(str) ;
	}


public static void main(String[] args) {
	
	
	System.out.println(encode("root"));
	
}	
	
	

}
