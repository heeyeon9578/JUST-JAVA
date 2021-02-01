/**
 * 파일명: Ch3ExX1.java
 * 작성일: 2021. 1. 28.
 * 파일설명: if 문을 사용하여 메뉴선택 처리하기
 */
package javabook.ch3;

import java.util.Scanner;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("##메뉴선택##");
		System.out.println("[1]구매자 [2]판매자");
		System.out.println("##메뉴를 선택하시오->");
		
		String sel =scan.next();
		
		if(sel.equals("1")) {
			System.out.println("환영합니다! 구매자로 로그인하셨습니다.");
			
		}
		if(sel.equals("2")) {
			System.out.println("환영합니다! 판매자로 로그인하셨습니다.");
			
		}
		
		
		
		

	}

}
