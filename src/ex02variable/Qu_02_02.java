package ex02variable;

public class Qu_02_02 {

	public static void main(String[] args) {
	
		/*
		 문제2] 파일명 : Qu_02_02.java
국어,영어,수학 점수를 99, 80, 96점으로 입력하고 
평균점수를 구해서 출력하는 프로그램을 작성하시오.
실행결과]
평균점수(실수형)=91.66666666666667
평균점수(정수형)=91
		 */
		
		int Kor = 99;
		int eng = 80;
		int mat = 96;
		
		int result1 = (Kor + eng + mat)/3;
		double result2 = (double)(Kor + eng + mat)/3;

		System.out.println("평균점수(정수형)="+ result1);
		System.out.println("평균점수(실수형)="+ result2);
		
		//선생님
		double avg1 = (Kor + eng + mat)/3; // 정수/ 정수 => 정수의 결과
		double avg2 = (Kor + eng + mat)/3.0; //정수 / 실수 => 실수의 결과
		
		System.out.println("평균점수1:" + avg1);
		System.out.println("평균점수2:" + avg2);
		
		//????????이상한듯 다시하기★
		
		
	}

}
