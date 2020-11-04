package ex05method;
/*
 문제5-2) 파일명 : QuCircleCalculator.java (난이도:중)
원의 반지름을 파라메타로 전달하면 원의넓이와 둘레를 계산하여 반환하는 메소드를 각각 정의하자. 이를 호출하는 main 메소드를 정의하라.

메소드명 : circleArea() > 원의넓이, circleRound() > 원의둘레
-넓이공식 : 3.14 * 반지름 * 반지름
-둘레공식 : 2 * 3.14 * 반지름

실행결과]
원의 둘레(5.5) : 34.54
원의 넓이(5.5) : 94.985

 */

import java.util.Scanner;

public class QuCircleCalculator {
	
	//원의넓이(반환값이 없는 형태)
	static void circleArea(double rad){
		double result= 3.14 * rad * rad;
		System.out.println("원의넓이:"+ result);
	}
	
	//원의둘레(반환값이 있는 형태)
	static double circleRound(double rad){
		double result = 2 * 3.14 * rad;
		return result;
	}
	
	public static void main(String[] args) {
		
		//반환값이 없는타입이라 값만 적어주면됨(ex.10.2)
		//원의넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과출력됨
		circleArea(10.2);
		
		//원의둘레를 구하는 함수는 반환값이 있으므로 갓을 반환받아 출력함
		System.out.println("원의둘레:"+circleRound(12.3));
		
		
		
		
		//내가한고얌
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("반지름을 입력하세요:");
//		double a = scanner.nextDouble();
//		
//		circleArea(a);
//		circleRound(a);
//	}
//	
//	static void circleArea (double r) {
//		final double PI = 3.14;
//		double sum1= r*r*PI;
//		System.out.println("원의둘레: "+sum1);
//	}
//	
//	static void circleRound (double r) {
//		final double PI = 3.14;
//		double sum2 = 2*PI*r;
//		System.out.println("원의넓이: "+ sum2);
	}
	}
		
