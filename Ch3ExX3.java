/**
 * 파일명: Ch3ExX3.java
 * 작성일: 2021. 1. 28.
 * 파일설명: 여러 if else 문을 응용한 로그인과 메뉴 선택하기 
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("##로그인(admin 혹은 임의 아이디)##");
		System.out.println("##로그인 아이디:");
		
		String user = scan.next();
		
		if(user.equals("admin")) {
			System.out.println("관리자 로그인!!");
			
		}
		else {
			System.out.println(user + "로그인!!");
			
		}
		
		System.out.println("##메뉴를 선택하시오(1~2)##");
		System.out.println("#메뉴선택:");
		
		String sel =scan.next();
		
		if(sel.equals("1") && user.equals("admin")) {
			System.out.println("관리자 1번 선택함!!");
			
		}
		else if(sel.equals("2")&& user.equals("admin")) {
			System.out.println("관리자 2번 선택함!!");
		}
		else if(sel.equals("1")&& !user.equals("admin")) {
			System.out.println(user + " 1번 선택함!!");
		}
		else if(sel.equals("2")&& !user.equals("admin")) {
			System.out.println(user + "2번 선택함!!");
		}
		
	}

}
