package ex05method;
/*
 문제5-3) 파일명 : QuTemperature.java  (난이도:중)
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로 변환하여 리턴하는 함수를 만들어라.

공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8
 */

import java.util.Scanner;

public class QuTemperature {
	
	//섭씨 -> 화씨
	static double celsiusToFahrenheit(int cel) {
		return 1.8 * cel + 32;
	}
	
	
	//화씨 -> 섭씨
	static double fahrenheitToCelsius(int fah) {
		return (fah - 32) / 1.8;
	}
	
	public static void main(String[] args) {
		
		System.out.println("섭씨20도->화씨=");
		System.out.println(celsiusToFahrenheit(20));
		
		System.out.println("화씨98도->섭씨");
		System.out.println(fahrenheitToCelsius(98));
		
		
		//♥다혜가한거
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("섭씨를 입력해주세요:");
//		double a = scanner.nextDouble();
//		
//		System.out.print("화씨를 입력해주세요:");
//		double b = scanner.nextDouble();
//		
//		double x = Celsius(a);
//		double y = Fahrenheit(a);
//		
//		System.out.println("최종화씨="+x);
//		System.out.println("최종섭씨="+y);
//	}
//	
//
//	static double Celsius(double c) {
//		double ce = 1.8 * c +32;
//		return ce;
//	}
//
//
//	static double Fahrenheit (double d) {
//		double fa = (d-32)/1.8;
//		return fa;
	}
}
