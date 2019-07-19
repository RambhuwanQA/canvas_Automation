package util;

import java.util.Calendar;
import java.util.Random;

import net.bytebuddy.utility.RandomString;

public class Course {
	public static String randomString(int len) {
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		Random random = new Random();
		
		StringBuffer sb = new StringBuffer(len);
		for (int i = 0; i < len; i++)
        sb.append(str.toLowerCase().charAt(random.nextInt(str.length())));
		return sb.toString();
   }
	public static String getCurrentTimeStamp() {
		Calendar cal = Calendar.getInstance();
		return Integer.toString(cal.getTime().getHours()) + Integer.toString(cal.getTime().getMinutes())
		+ Integer.toString(cal.getTime().getSeconds());
		}
    public static String addNewCourse() {
    	String newCourse=randomString(5)+getCurrentTimeStamp();
		return newCourse;
    	
    }
    public static void main(String[] args) {
		System.out.println(addNewCourse());
	}

}
