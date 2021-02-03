/**
 * 파일명: test_6.java
 * 작성일: 2021. 2. 1.
 * 파일설명: 마트의 POS 시스템에서 판매상품의 가격을 바코드로 읽어 총액을 계산하는 프로그램 작성
 * 상품가격은 키보드 입력으로 바코드 리딩을 대체하도록 한다. 
 * 상품 가격 대신 q를 입력하면 지금까지의 입력 금액의 합을 출력하고 종료한다.
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sPrice="";
		int total  =  0;
		
		while(!sPrice.equals("q")) {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("제품의 가격을 입력하시오:");
			sPrice = scan.next();
			if(!sPrice.equals("q")) {
				int price = Integer.parseInt(sPrice);
				total += price;
			}
			
		}
		System.out.printf("총 가격은 : %d 입니다.", total);
				
	}

}
