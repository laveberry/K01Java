package ex02variable;

import Ex01JavaStart.SystemOutPrintln;

public class Qu_02_01 {

	public static void main(String[] args) {

		/*
		 문제1] 파일명 : Qu_02_01.java
1.국어, 영어, 수학점수 및 과목의 총점을 저장할수 있는 변수를 선언하시오.
2.국어 89점, 영어 99점, 수학 78점을 대입한다.
3.국영수 총합을 구해서 총점을 저장할 변수에 대입한다.
4.총합점수를 출력한다.
실행결과]
국어:89, 영어:99, 수학:78
총점:266
		 */
		
		
		int kor = 89;
		int eng = 99;
		int mat = 78;

		System.out.println(" 국어=" + kor + " 영어="+ eng + " 수학="+ mat);		
		
		//선생님코드
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, mat);
		
		System.out.println("총점="+(kor + eng +mat));
		
	}

}
