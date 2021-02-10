/**
 * 파일명: Ch6Test2.java
 * 작성일: 2021. 2. 10.
 * 파일설명: 동전을 입력하여 합계가 500원이 되면 동작하는 자판기를 구현한다. 
 * 동전 입력은 키보드를 이용하며, Scanner 클래스를 사용한다. 500원이 될 때까지 계속 입력을 받으며,
 * 실행결과는 '원하시는 상품이 준비 되었습니다!'는 메시지를 출력하는 것으로 한다.
 */
package javabook.ch6;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		while(sum<=500) {
			System.out.printf("돈을 넣어주세요(500원): ");
			String money = scan.next();
			int iMoney = Integer.parseInt(money);
			sum = sum + iMoney;
			
		}
		System.out.println("원하시는 상품이 준비 되었습니다!");
		
		
		
		
		
	}

}
