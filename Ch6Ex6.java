/**
 * 파일명: Ch6Ex6.java
 * 작성일: 2021. 2. 8.
 * 파일설명: 키보드 입력을 처리하는 Scanner 클래스 사용하기 
 */
package javabook.ch6;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String msg = scan.next();
		System.out.println("입력: "+ msg);
		int num = scan.nextInt();
		System.out.println("입력: "+ num);

	}

}
