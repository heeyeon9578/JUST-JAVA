/**
 * 파일명: Ch6Ex7.java
 * 작성일: 2021. 2. 8.
 * 파일설명: 난수를 처리하는 Random 클래스 활용하기
 */
package javabook.ch6;
import java.util.Random;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r1 = new Random();
		Random r2 = new Random(123);
		Random r3 = new Random(123);
		Random r4 = new Random(System.currentTimeMillis());
		
		System.out.println("##기본 난수 출력##");
		System.out.println("r1: "+ r1.nextInt(10));
		System.out.println("r2: "+ r2.nextInt(10));
		System.out.println("r3: "+ r3.nextInt(10));
		System.out.println("r4: "+ r4.nextInt(10)); //nextInt때문에 0~9 사이의 숫자만 나온다.
		
		System.out.println("##범위 지정 난수 출력##");
		System.out.println("1~20: "+ r1.nextInt(20)+1); //1~20까지의 수
		
	}

}
