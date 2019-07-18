package util;

import java.util.Calendar;
import java.util.Random;

public class User {

	
	public static String randomString(int len) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		StringBuffer sb = new StringBuffer(len);
		for (int i = 0; i < len; i++)
        sb.append(str.toLowerCase().charAt(random.nextInt(str.length())));
		return sb.toString();
   }
    public static String Instructor() {
		StringBuffer sb = new StringBuffer();
		sb.append("_instructor");
		String instructor = randomString(5);
		String sb1 = instructor + sb;
		return sb1;
	}
   public static String student() {
		StringBuffer sb = new StringBuffer();
		sb.append("_student");
		String student = randomString(6);
		String str = student + sb;
		return str;
	}
	public static String getCurrentTimeStamp() {
		Calendar cal = Calendar.getInstance();
		return Integer.toString(cal.getTime().getHours()) + Integer.toString(cal.getTime().getMinutes())
		+ Integer.toString(cal.getTime().getSeconds());
		}

	public static String userStudent() {
		StringBuffer sb = new StringBuffer();
		sb.append("@yopmail.com");
		String str = student()+getCurrentTimeStamp()+ sb;
		return str;
	}
	public static String userInstructor() {
		StringBuffer sb = new StringBuffer();
		sb.append("@yopmail.com");
		String str =Instructor()+getCurrentTimeStamp()+ sb;
		return str;
	}
     
public static void main(String[] args) {
	   System.out.println(student());
	   System.out.println(Instructor());
	   System.out.println( userStudent());
	   System.out.println(userInstructor());
}	
}
