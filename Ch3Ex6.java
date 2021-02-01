/**
 * 파일명: Ch3Ex6.java
 * 작성일: 2021. 1. 28.
 * 파일설명: 
 */
package javabook.ch3;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch3Ex6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pwd =123456;
		int encPwd, decPwd;
		int key = 0x1A253B65;
		
		System.out.println("암호화 전 비밀번호:"+ pwd);
		
		encPwd = pwd ^ key;
		
		System.out.println("암호화 후 비밀번호:"+ encPwd);
		
		decPwd = encPwd ^ key;
		
		System.out.println("복호화 후 비밀번호:" + decPwd);
		
		

	}

}
