package bokang;

import java.util.Scanner;

public class R01if {
	public static void main(String[] args) {
		
		int jumsu = 85;
		//if문은 조건식, 논리식 들어감. 크다작다, 참이다거짓이다
		if(jumsu>=90) {
			System.out.println("A학점");
		}
		else if(jumsu>=80 && jumsu<90) {
			System.out.println("B학점");
		}
		else {
			System.out.println("F학점");
		}
		
		//switch 딱떨어지는 정수식 혹은 산술식
		/*
		 switch문
		 
		 형식]
		 	switch(정수식 혹은 산술식){
		 	case 값1:
		 		실행문; break;
		 	.........
		 	default;
		 		나머지실행문;
		 		<마지막은 일반적으로 break생략>
		 	}
		 */
		

		/*
		시나리오] 월에 해당하는 1~12까지의 숫자를 입력받아서
			봄(3~5), 여름(6~9), 가을(10~11), 겨울(12~2)인지 판단하는 
			switch~case문을	작성해보시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~12사이의 정수를 입력하세요:");
		int month = scanner.nextInt();
		
		switch(month) {
		case 3: case 4: case 5: //if문의 or조건같은 형식
			System.out.println("3~5월은 봄입니다."); break;
		case 6: case 7: case 8:
			System.out.println("6~7월은 여름"); break;
		case 9: case 10: case 11:
			System.out.println("9~11월은 가을"); break;
		default: //나머지조건은 case아닌 default!!!
			System.out.println("12~2월은 겨울"); //마지막부분 break 생략
		}
	}
}
