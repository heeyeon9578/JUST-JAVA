/**
 * 파일명: test_7.java
 * 작성일: 2021. 2. 1.
 * 
 * 파일설명: 가위바위보 게임 프로그램을 작성하라
 * 가위, 바위, 보는 각각 정수형 1,2,3 으로 간주한다
 * 컴퓨터가 제시할 가위바위보 데이터를 만든다 
 * 다섯개의 정수를 저장할 수 있는 배열을 만들고 1,2,3 데이터를 섞어 초기화한다
 * 게임은 총 5회 진행, 컴퓨터는 배열 안 데이터를 차례로 출력
 * 현재 횟수/총 횟수와 함께 입력 메시지를 출력한다
 * 키보드로 1,2,3 중 하나를 입력, 컴퓨터와 키보드로 입력한 값을 비교, 누가 이겼는지 알려준다
 * 게임을 종료하면 누가 이겼는지 표시한다
 * 
 */
package javabook.ch3;
import java.util.Scanner;
/**
 * @author 최희연(heeyeon9578@naver.com)
 *
 */
public class test_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컴퓨터가 내보일 5가지 수
		int rsp[] = {1,2,3,2,3};
		Scanner scan = new Scanner(System.in);
		
		//컴퓨터가 이기면 -1, 참여자가 이기면 +1 
		int cnt = 0;
		
		
		for(int i=0; i<5; i++) {
			
			System.out.printf("가위(1), 바위(2), 보(3)중 하나를 입력하시오.(숫자로 입력):");
			String myRsp_s = scan.next();
			int myRsp = Integer.parseInt(myRsp_s);
			
			//1,2,3 이 아닌 다른 값을 입력했을 때를 방지
			if(myRsp<=3) {
				
				//컴퓨터의 값이 1(가위)일 경우의 수를 작성
				if(rsp[i]== 1) {
					if(myRsp==2) {
						cnt++;
						System.out.println("사용자가 이겼습니다!");
					}
					else if(myRsp==3) {
						cnt--;
						System.out.println("컴퓨터가 이겼습니다!");
					}
					else {
						System.out.println("비겼습니다!");
					}
				}
				else if(rsp[i]==2) {
					if(myRsp==1) {
						cnt--;
						System.out.println("컴퓨터가 이겼습니다!");
					}
					else if(myRsp==3) {
						cnt++;
						System.out.println("사용자가 이겼습니다!");
					}
					else {
						System.out.println("비겼습니다!");
					}
				}
				else if(rsp[i]==3) {
					if(myRsp==1) {
						cnt++;
						System.out.println("사용자가 이겼습니다!");
					}
					else if(myRsp==2) {
						cnt--;
						System.out.println("컴퓨터가 이겼습니다!");
					}
					else {
						System.out.println("비겼습니다!");
					}
				}
				
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력하시오!!! (1~3번 안에 선택 바람)");
			}
			
			
			System.out.printf("현재 횟수/총 횟수: %d/5 \n", i+1 );
			System.out.printf("입력메시지: %d , 컴퓨터가 낸 갑: %d \n", myRsp, rsp[i]);
			System.out.println("===================================================");
						
		}
		
		if(cnt>0) {
			System.out.println("최종적으로 사용자가 이겼습니다!");
			
			
		}else if(cnt<0){
			System.out.println("최종적으로 컴퓨터가 이겼습니다!");
		}
		else {
			System.out.println("최종적으로 비겼습니다!");
		}

	}

}
