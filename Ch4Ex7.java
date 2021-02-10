/**
 * 파일명: Ch4Ex7.java
 * 작성일: 2021. 2. 3.
 * 파일설명: 메서드 오버라이딩 사용하기
 */
package javabook.ch4;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch4Ex7 {

	/*
	  @Override
	  public String toString(){
	  		return "오버라이딩 예제입니다.";
	 }
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Ch4Ex7 exam = new Ch4Ex7();
	    Ch4Ex7 exam2 = new Ch4Ex7();
	    
	    System.out.println(exam.toString());
	    System.out.println(exam2.toString());

	}

}
