/**
 * 파일명: Ch3ExX5.java
 * 작성일: 2021. 1. 28.
 * 파일설명: switch문을 이용하여 회원 등급별 혜택 적용하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String memberLevel = "YOUNG";
		String msg;
		
		switch(memberLevel){
			case "VIP":
				msg = "VIP 고객 혜택 적용"; 
				break;
			case "NEW":
				msg = "NEW 고객 혜택 적용";
			case "YOUNG":
				msg = "YOUNG 고객 혜택 적용";
			default:
				msg = "등급없음";
				
		}
		
		System.out.println(msg);

	}

}
