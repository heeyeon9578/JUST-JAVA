/**
 * 파일명: test_5.java
 * 작성일: 2021. 2. 1.
 * 파일설명: 비밀번호를 보호하려고 간단한 암호화를 수행하는 프로그램을 작성하라
 * 키보드에서 네자리로 된 숫자 비밀번호를 입력받으면 왼쪽으로 2비트씩 이동시켜 암호화된 결과를 출력한다
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("비밀번호 네자리를 입력하시오:");
		String pwd = scan.next();
		int intPwd = Integer.parseInt(pwd);
		int encPwd = intPwd<<2;
		System.out.println("암호화 된 결과:");
		System.out.println(encPwd);
	}

}
