/**
 * 파일명: Ch6Ex3.java
 * 작성일: 2021. 2. 8.
 * 파일설명: Integer클래스의 주요 메서드 사용하기
 */
package javabook.ch6;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num1 = new Integer(30);
		Integer num2 = num1.intValue();
		Integer num3 = 50;		
		int num4 = num3;
		String num5 = "40";
		
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);
		System.out.println("num3: "+ num3);
		System.out.println("num4: "+ num4);
		
		System.out.println("MAX_VALUE:"+ Integer.MAX_VALUE);
		System.out.println("SIZE: "+ Integer.SIZE);
		
		int result = num1 + Integer.parseInt(num5);
		System.out.println("num1+num5 = "+result);
		

	}

}
