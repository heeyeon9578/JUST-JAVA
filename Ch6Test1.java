/**
 * 파일명: Ch6Test1.java
 * 작성일: 2021. 2. 10.
 * 파일설명: StringBuffer 클래스로 출력결과 
 
                *
                **
                ***
                ****
                *****
 만들기 
 */
package javabook.ch6;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<5; i++) {
			for(int j = 0; j<i+1; j++) {
				sb.append("*");
				
			}
			sb.append("\n");
		}
		
		
		System.out.println(sb.toString());
	}

}
