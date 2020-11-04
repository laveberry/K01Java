package ex05method;

import java.util.Scanner;


/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)
 */



public class E04MethodType03_1 {
	
	/*
	 시나리오] 사용자가 입력한 2개의 시작값과 끝값사이에 있는
	 수를 모두 더하여 출력하는 프로그램을 작성하시오
	 	출력결과]
	 		시작값 : 5
	 		종료값 : 9
	 		결과 : 5+6+7+8+9=???
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작값:");
		int s = scanner.nextInt();
		System.out.print("종료값:");
		int e = scanner.nextInt();
		yesParamNoReturn(s, e);
	}
	
	static void yesParamNoReturn(int starNum, int endNum) {
		/*
		 1~10까지의 합을 구하는 프로그램의 시간과 종료값만 변수로
		 변경하여, 해당 구간의 합을 구하는 프로그램으로 커스트마이징 하였음.
		 */
		int sum = 0;
		for(int i=starNum ; i<=endNum ; i++) {
			sum += i;
		}
		System.out.printf("%d~%d까지의합은:%d", starNum, endNum, sum);
	}

}
