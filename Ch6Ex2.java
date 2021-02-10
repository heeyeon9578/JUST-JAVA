/**
 * 파일명: Ch6Ex2.java
 * 작성일: 2021. 2. 8.
 * 파일설명: StringBuffer 클래스 구현하기
 */
package javabook.ch6;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="문자열";
		
		for(int i =0; i<50; i++) {
			str =str+i;
		}
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("문자열");
		
		for(int i = 0; i<50; i++) {
			sb.append(i);
			
		}
		
		System.out.println(sb.toString());
		
		

	}

}
