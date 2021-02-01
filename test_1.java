/**
 * 파일명: test_1.java
 * 작성일: 2021. 1. 29.
 * 파일설명: 두 변수를 이용하여 구구단 만들기
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int j=0;
		
		while(i<10) {
			i++;
			System.out.printf("<"+ i + "단>\n");
			for(j=0; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
				
			}
			System.out.printf("---------------------------\n");
			
		}

	}

}
