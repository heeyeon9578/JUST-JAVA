/**
 * 파일명: Ch3ExX4.java
 * 작성일: 2021. 1. 28.
 * 파일설명: 중첩 if문을 이용하여 아이디와 비밀번호 확인하기
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("##아이디를 입력하시오:");
		String uname = scan.next();
		
		if(uname.equals("hong")) {
			System.out.print("#비밀번호를 입력하시오:");
			String pwd = scan.next();
			
			if(pwd.equals("1234")) {
				System.out.println("비밀번호 인증 확인!!-> 로그인 성공!");
				
			}
			else {
				System.out.println("비밀번호가 틀렸습니다!");
			}
		}else {
			System.out.println("아이디가 틀렸습니다!");
		}
		
		

	}

}
