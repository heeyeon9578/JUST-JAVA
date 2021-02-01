/**
 * 파일명: Ch3ExX7.java
 * 작성일: 2021. 1. 29.
 * 파일설명: while 문 종료 조건 변경하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 20;
		while(num>10) {
			System.out.println(num--);
			
			
		}
		boolean flag =true;
		while(flag) {
			num--;
			if(num==3) {
				flag = false;
				System.out.println("num=3 종료!");
			}
		}
		

	}

}
