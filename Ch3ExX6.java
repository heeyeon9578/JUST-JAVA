/**
 * 파일명: Ch3ExX6.java
 * 작성일: 2021. 1. 29.
 * 파일설명: for 문으로 구구단 출력하기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3ExX6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i =2; i<10; i++) {
			System.out.println("##"+ i+"단");
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}

	}

}
