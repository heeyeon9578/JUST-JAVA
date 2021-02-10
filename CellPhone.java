/**
 * 파일명: CellPhone.java
 * 작성일: 2021. 2. 4.
 * 파일설명: Product 클래스를 상속받는 클래스 
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class CellPhone extends Product{

	String carrier; //통신사
	
	public CellPhone(String pname, int price, String carrier) {
		this.pname = pname;
		this.price = price;
		this.carrier = carrier;
		
		
	}
	
	public void printExtra() {
		System.out.println("통신사:"+carrier);
	}
}
