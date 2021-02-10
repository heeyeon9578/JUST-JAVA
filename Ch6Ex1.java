/**
 * 파일명: Ch6Ex1.java
 * 작성일: 2021. 2. 8.
 * 파일설명: 
 */
package javabook.ch6;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		
		//String str4 = new String(30); 으로 처리하면, 데이터형이 맞지 않아 오류 발생
		String str4 = String.valueOf(30);
		
		String num1 = "20";
		
		if(str1 ==str2) {
			System.out.println("st1 과 str2 는 같습니다!!");
		}
		else
			System.out.println("str1과 str2는 같지 않습니다!");
		
		if(str1 ==str3) {
			System.out.println("st1 과 str3 는 같습니다!!");
		}
		else
			System.out.println("str1과 str3는 같지 않습니다!");
		
		if(str1.equals(str3)) {
			System.out.println("st1 과 str3 는 같습니다!!");
		}
		else
			System.out.println("str1과 str3는 같지 않습니다!");
		
		System.out.println("num1+30 = "+ num1 +30);
		System.out.println("str1의 길이: "+ str1.length());
		System.out.println("str1의 4번째 문자:"+ str1.charAt(3));
		System.out.println("str1의 2~4 위치에 있는 문자열: "+ str1.substring(1,4));
		System.out.println("str1의 ㅣ을 k로 치환:"+ str1.replace('l', 'k'));
		
		
		
		

	}

}
