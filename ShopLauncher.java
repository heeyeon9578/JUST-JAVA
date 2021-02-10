/**
 * 파일명: ShopLauncher.java
 * 작성일: 2021. 2. 7.
 * 파일설명: 쇼핑몰 프로그램을 실행하는 런처 클래스 구현하기
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */

//쇼핑몰을 실행하는 런처 프로그램
//IShop 인터페이스를 구현하는 다른 쇼핑몰 클래스도 이곳에서 실행 가능하다
public class ShopLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IShop shop = new MyShop();
		shop.setTitle("MyShop");
		shop.genUser();
		shop.genProduct();
		shop.start();
	}

}
