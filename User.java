/**
 * 파일명: User.java
 * 작성일: 2021. 2. 4.
 * 파일설명: 사용자 클래스 만들기
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class User {
	//사용자 이름
	private String name;
	//결제 유형 - enum
	private PayType payType;
	
	public User(String name, PayType payType) {
		this.name = name;
		this.payType = payType;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PayType getPayType() {
		return payType;
	}

	public void setPayType(PayType payType) {
		this.payType = payType;
	}
	
	

}
