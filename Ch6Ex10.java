/**
 * 파일명: Ch6Ex10.java
 * 작성일: 2021. 2. 9.
 * 파일설명: 숫자 데이터를 다양한 형식으로 출력하는 프로그램 만들기
 */
package javabook.ch6;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Ex10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num1 = 35.829283;
		int num2 = 340000000;
		
		NumberFormat nf1 = NumberFormat.getInstance();
		NumberFormat nf2 = NumberFormat.getIntegerInstance();
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		
		System.out.println(nf1.format(num1));
		System.out.println(nf2.format(num1));
		System.out.println(nf3.format(num1));
		nf3.setMinimumIntegerDigits(3);
		System.out.println(nf3.format(num1));
		
		DecimalFormat df1 = new DecimalFormat();
		DecimalFormat df2 = new DecimalFormat("00.####");
		System.out.println(df1.format(num2));
		System.out.println(df2.format(num1));
		df2.applyPattern("00.##");
		System.out.println(df2.format(num1));
		
		
		
	}

}
