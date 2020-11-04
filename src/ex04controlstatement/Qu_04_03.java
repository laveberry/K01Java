package ex04controlstatement;

import java.util.Scanner;

public class Qu_04_03 {

	public static void main(String[] args) {
		
		/*
		 국어, 영어, 수학 점수를 사용자로부터 입력받아서	평균을 구해  
90점이상 A학점, 
	80점이상 B학점,
	....
	60점미만 F학점을 출력하는 프로그램을 작성하시오.
단 switch문을 사용해야 합니다.(Scanner클래스를 사용하세요)

실행결과]
국어:88
영어:99
수학:77
평균점수:88
학점:B

		 /*
		 Scanner클래스
		 	: JDK5.0에 추가된 클래스로 키보드를 통해 사용자로부터
		 	값을 입력받을때 사용함.
		 	nextInt() : 정수를 입력받음
		 	nextLine() : 문자열을 입력받음.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;

			System.out.print("국어:");
			kor = scanner.nextInt();
			System.out.print("영어:");
			eng = scanner.nextInt();
			System.out.print("수학:");
			math = scanner.nextInt();
			
			avg = (kor + eng + math)/(3*10);
			
			System.out.println("평균점수= " + avg/10);
			
			switch(avg){
			case 10: case 9:
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
		}
				
}
