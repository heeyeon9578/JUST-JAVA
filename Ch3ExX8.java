/**
 * 파일명: Ch3ExX8.java
 * 작성일: 2021. 1. 29.
 * 파일설명: 배열을 사용하여 제품 목록 출력하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] products = {"애플 아이폰", "삼성 갤럭시", "노키아 루미아", "소니 엑스페리아"};
		
		for(int i=0; i<products.length; i++) {
			System.out.println(products[i]);
		}
		
		System.out.println("-----------------------");
		
		//새로운 for문 사용
		for(String s: products) {
			System.out.println(s);
			
		}
	}

}
