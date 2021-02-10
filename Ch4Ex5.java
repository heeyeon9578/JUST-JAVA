/**
 * 파일명: Ch4Ex5.java
 * 작성일: 2021. 2. 3.
 * 파일설명: 클래스 변수와 인스턴스 변수 사용하기
 */
package javabook.ch4;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch4Ex5 {
	
	static int num1 = 10;
	int num2 = 10;

	
	public static void main(String[] args) {
		
		Ch4Ex5 ex1 = new Ch4Ex5();
		Ch4Ex5 ex2 = new Ch4Ex5();
		
		ex1.num1 =  20; //ex2.num1 에서 최종변경된 값으로 출력된다.
		ex2.num1 = 30;
		
		System.out.println("ex1.num1 = "+ ex1.num1);
		System.out.println("ex2.num1 = "+ ex2.num1);
		
		ex1.num2 = 30;
		ex2.num2 = 50;
		
		System.out.println("ex1.num2 = "+ ex1.num2);
		System.out.println("ex2.num2 = "+ ex2.num2);
		
		

	}

}
