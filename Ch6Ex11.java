/**
 * 파일명: Ch6Ex11.java
 * 작성일: 2021. 2. 9.
 * 파일설명: 고급 문자열 메시지를 생성하는 MessageFormat 클래스 활용하기
 */
package javabook.ch6;
import java.text.MessageFormat;
import java.util.Date;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String msg = "{0, date}일 {0, time}에 {1}에서 {2}와 만나기로 했다.";
		Object[] objs= {new Date(), "종로", "홍길동"};
		MessageFormat mf = new MessageFormat(msg);
		System.out.println(mf.format(objs));
		
		String from = "홍길동";
		String to = "김기동";
		String location = "HOME";
		final int CHAT_SEND = 1;
		
		String chatMsg = "{0}|{1}|{2}-{3}|{4}";
		System.out.println(MessageFormat.format(chatMsg, CHAT_SEND, new Date(), from, to, location));
		
	}

}
