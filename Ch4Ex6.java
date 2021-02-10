/**
 * 파일명: Ch4Ex6.java
 * 작성일: 2021. 2. 3.
 * 파일설명: 메서드 오버로딩 사용하기
 */
package javabook.ch4;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch4Ex6 {
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int sum(int num1, int num2, int num3) {
		return num1+num2+num3;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ch4Ex6 exam = new Ch4Ex6();
		System.out.println(exam.sum(3, 5));
		System.out.println(exam.sum(3,5,8));

	}

}
