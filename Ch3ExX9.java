/**
 * 파일명: Ch3ExX9.java
 * 작성일: 2021. 1. 29.
 * 파일설명: 2차원 배열을 사용한 자료구조 처리하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] members = {{"101", "홍길동"}, {"102","김사랑"},{"103","이신용"}};
		
		for(int i=0; i<members.length; i++) {
			
			System.out.println(members[i][0]+":"+members[i][1]);
			
		}
	}

}
