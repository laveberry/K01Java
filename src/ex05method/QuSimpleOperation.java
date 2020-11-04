package ex05method;
/*
 문제5-1) 파일명 : QuSimpleOperation.java (난이도:하)
두개의 정수를 입력받아서 사칙연산의 결과를 출력하는 메소드와 main메소드를 작성해보자. 단 나눗셈은 몫과 나머지를 각각 출력해야 한다.
파라메타로 전달되는 두 숫자는 모두 0 이상의 양의 정수이다.

메소드명 : arithmetic()

실행결과]
덧셈결과 -> 177
뺄셈결과 -> 23
곱셈결과 -> 7700
나눗셈 몫 -> 1
나눗셈 나머지 -> 23

 */

import java.util.Scanner;

public class QuSimpleOperation {
	
	static void arithmetic(int a, int b) {
		System.out.printf("덧셈:%d+%d=%d\n", a,b,(a+b));
		System.out.printf("뺄셈:%d-%d=%d\n", a,b,(a-b));
		System.out.printf("곱셈:%d*%d=%d\n", a,b,(a*b));
		System.out.printf("나눗셈:%d/%d=%d\n", a,b,(a/b));
		//%기호를 콘솔에 출력하기 위해 이스케이프 시퀀스 사용함.
		System.out.printf("나눗셈 나머지:%d%%%d=%d\n", a,b,(a%b));
		
	}
	
	//static으로 선언된 main함수는 static으로만 반환할수 있다.
	public static void main(String[] args) {
		arithmetic(10, 20);
		
		
		
		//♥내가한고얌
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 정수를 입력하시오:");
//		int a = scanner.nextInt();
//		System.out.print("두번째 정수를 입력하시오:");
//		int b = scanner.nextInt();
//		
//		 arithmetic(a,b);
//	}
//
//	static void arithmetic(int num1, int num2) {
//		System.out.println("덧셈결과->"+(num1+num2));
//		System.out.println("뺄셈결과->"+(num1=num2));
//		System.out.println("곱셈결과->"+(num1*num2));
//		System.out.println("나머지결과->"+(num1%num2));
	}

}
