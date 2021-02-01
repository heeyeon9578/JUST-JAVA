/**
 * 파일명: Ch3Ex7.java
 * 작성일: 2021. 1. 28.
 * 파일설명: 비트 시프트를 사용하여 연산하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 50;
		System.out.printf("정수값 num1 : %d, %s\n", num1, Long.toBinaryString(num1));
		
		int result1 = num1 >> 1;
		System.out.printf("num1 >> 1 : %d, %s\n", result1, Long.toBinaryString(result1));
		
		int result2 = num1 << 1;
		System.out.printf("num1 << 1 : %d, %s\n", result2, Long.toBinaryString(result2));

	}

}
