/**
 * 파일명: Ch6Ex8.java
 * 작성일: 2021. 2. 9.
 * 파일설명: 구분자로 분리되는 문자열을 처리하는 StringTikenizer활용하기
 * 
 */
package javabook.ch6;
import java.util.StringTokenizer;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data= "홍길동, 010-123-1234, 서울시 종로구, 학생";
		StringTokenizer st = new StringTokenizer(data,",");
		
		System.out.println("## 개인 정보 출력 ##");
		System.out.println("이름: "+ st.nextToken());
		System.out.println("전화번호1: "+ st.nextToken());
		System.out.println("주소: "+ st.nextToken());
		System.out.println("직업: "+ st.nextToken());
		

	}

}
