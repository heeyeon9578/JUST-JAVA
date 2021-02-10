/**
 * 파일명: IShop.java
 * 작성일: 2021. 2. 4.
 * 파일설명: 
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */

//쇼핑몰의 기본 구조 정의
public interface IShop {

	public abstract void setTitle(String title);
	public abstract void genUser();
	public abstract void genProduct();
	public abstract void start();
	
}
