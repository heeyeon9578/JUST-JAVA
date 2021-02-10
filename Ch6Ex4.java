/**
 * 파일명: Ch6Ex4.java
 * 작성일: 2021. 2. 8.
 * 파일설명: 
 */
package javabook.ch6;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("환경변수 PATH: "+ System.getenv("PATH"));
		System.out.println("user 속성값: "+ System.getProperty("user"));
		
		System.out.println("종료하려면 x를 누르세요.");
		while(true) {
			if(scanner.next().equals("x")) {
				System.out.println("프로그램 종료함!!");
			}
			else
				System.out.println("다시입력하세요!!");
		}

	}

}
