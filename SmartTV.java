/**
 * 파일명: SmartTV.java
 * 작성일: 2021. 2. 4.
 * 파일설명: Product 클래스를 상속받는 클래스 
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class SmartTV extends Product{
	
	String resolution;
	
	public SmartTV(String pname, int price, String resolution) {
		this.pname = pname;
		this.price = price;
		this.resolution = resolution;
	}
	
	public void printExtra() {
		System.out.println("해상도: "+resolution);
	}

}
