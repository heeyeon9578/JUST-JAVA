/**
 * 파일명: Ch6Ex5.java
 * 작성일: 2021. 2. 8.
 * 파일설명: Date 와 Calender 클래스 활용하기
 */
package javabook.ch6;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;


/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date1 = new Date();
		Date date2 = new Date(123141245);
		System.out.println("date1: "+ date1);
		System.out.println("date2: "+ date2);
		
		System.out.println("date1, date2 비교:"+date1.compareTo(date2));
		
		Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT+2"));
		System.out.println("시간: "+ cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE));
		
		
	}

}
