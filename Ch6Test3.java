/**
 * 파일명: Ch6Test3.java
 * 작성일: 2021. 2. 10.
 * 파일설명: 데이터베이스에서 백업 받은 신장/체중 정보 파일이 있다고 할 때, 이 데이터를 읽어 남자의 평균 체중을 구하는 프로그램을 작성하라.
 * 단, 파일 입출력은 아직 배우지 않았으므로 문자열로 된 다섯명의 데이터를 사용한다.
 * 홍길동,남,65,170/김새영,여,57,164/이장군,남,80,190/김명수,남,77,167/홍미용,여,64,165
 */
package javabook.ch6;

import java.util.StringTokenizer;

/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class Ch6Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data[]= new String[5];
		
		int sum = 0;
		int avg = 0;
		int num = 0;
		String name="";
		String sex="";
		String weight="";
		String high="";
		
		
		data[0] = "홍길동,남,65,170";
		data[1] = "김새영,여,57,164";
		data[2] = "이장군,남,80,190";
		data[3] = "김명수,남,77,167";
		data[4] = "홍미용,여,64,165";
		
	    for(int i =0; i<5; i++) {
	    	
	    	StringTokenizer st = new StringTokenizer(data[i],",");
	    	name= st.nextToken();
	    	sex = st.nextToken();
	    	weight = st.nextToken();
	    	high = st.nextToken();
	    	
	    	if(sex.equals("남")) {
	    		sum =  sum + Integer.parseInt(weight);
	    		num++;
	    	}
	    	
	    }
	    avg =sum/num;
	    System.out.println("남자의 평균 몸무게는 "+ avg + "입니다.");
	    
	    
		
	
		
		
	}

}
