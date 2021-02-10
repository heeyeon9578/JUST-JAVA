/**
 * 파일명: HelloWorld.java
 * 작성일: 2021. 2. 3.
 * 파일설명: HelloWorld를 객체지향기법으로 해보기
 */
package javabook.ch5;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class HelloWorld {
	private String msg;
	static int count = 0;
	static String prefix = "";
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public HelloWorld() {
		msg = "Hello World!!";
		
	}
	public HelloWorld(String msg) {
		this.msg = msg;
	}
	
	public HelloWorld(String msg, int option) {
		if(option==1) {
			this.msg= msg;
			
		}
		else if(option==2) {
			this.msg =msg+", 안녕하세요?";
		}
	}
	
	public void print() {
		//System.out.println(msg);
		count++;
		System.out.println("["+count+"]"+prefix+msg);
	}
	
	

}
