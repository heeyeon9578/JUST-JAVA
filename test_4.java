/**
 * 파일명: test_4.java
 * 작성일: 2021. 2. 1.
 * 파일설명: 다음 제휴 카드의 발급 조건 1,2 를 모두 만족하면 발급 가능 여부를 알려주는 프로그램을 작성
 * 연소득, 신용 등급과 신규, 기존 고객 여부는 키보드로 입력받기
 * 
 * 발급조건 1(둘 중 하나 만족)
 * 연소득 5000만원 이상 또는 신용등급 B이상 
 * 
 * 발급조건 2
 * 기존고객
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String 	yes = "발급 가능";
	String no = "발급 불가능";
	
	Scanner scan = new Scanner(System.in);
	System.out.println("연소득이 얼마인지 작성하시오:");
	String yMoney = scan.next();
	System.out.println("신용등급이 얼마인지 작성하시오:");
	String credit = scan.next();
	System.out.println("기존고객이면 '기존고객' 이라고 작성하시오:");
	String customer = scan.next();
	
	long yearMoney = Integer.parseInt(yMoney);
	
	if( ( yearMoney >=50000000 || 
			((credit.equals("B") || credit.equals("A"))) ) 
			&& customer.equals("기존고객") ) {
		System.out.println(yes);
	}
	else {
		System.out.println(no);
	}
	
	
	
		

	}

}
