/**
 * 파일명: Product.java
 * 작성일: 2021. 2. 4.
 * 파일설명: 상품에 대한 기본적인 구조와 기능을 담는 클래스 만들기
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public abstract class Product {
	
	String pname;
	int price;

	public void printDetail() {
		System.out.print("상품명:" + pname + ",");
		System.out.print("가격:"+ price +",");
		printExtra();
	}
	
	public abstract void printExtra();
	

}
