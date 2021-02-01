/**
 * 파일명: test_3.java
 * 작성일: 2021. 2. 1.
 * 파일설명:현재 교통카드에 잔액이 10000원이고 사용 금액만큼 차감하여 잔액이 부족할 때 "잔액이 부족해 교통카드를 사용할 수 없습니다" 메시지를 출력한 후 종료하는 프로그램 작성
 * 교통카드 사용은 키보드 입력을 이용하고 입력된 문자열의 숫자 변환은 Integer.parseInt("금액"); 메서드를 사용한다. 
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tMoney = 10000;
		
		while(tMoney>=0) {
			System.out.println("현재 교통카드 잔액: "+ tMoney +"\n");
			System.out.println("사용할 금액:");
			Scanner scan = new Scanner(System.in);
			String use = scan.next();
			tMoney = tMoney - Integer.parseInt(use);
			
			
		}
		System.out.println("잔액이 부족해 교통카드를 사용할 수 없습니다");
		
		

	}

}
