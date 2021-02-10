/**
 * 파일명: Ch6Ex9.java
 * 작성일: 2021. 2. 9.
 * 파일설명: 다양한 날짜 정보 형식을 지정하여 출력하는 프로그램 만들기
 */
package javabook.ch6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("DateFormat 기본: "+ df1.format(date));
		System.out.println("DateFormat LONG: "+ df2.format(date));
		System.out.println("DateFormat TimeZone: "+ df1.getTimeZone().getID());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd, hh:mm:a");
		System.out.println("SimpleDateFormat 기본: "+ sdf1.format(date));
		System.out.println("DateFormat 지정: "+ sdf2.format(date));
		sdf1.applyPattern("yyyy년 MM/dd");
		System.out.println("DateFormat 변경: "+ sdf1.getTimeZone().getID());
		
		
		

	}

}
