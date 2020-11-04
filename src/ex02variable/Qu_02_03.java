package ex02variable;

public class Qu_02_03 {

	public static void main(String[] args) {

		/*
		 문제3] 파일명 : Qu_02_03.java
반지름이 10인 원의 넓이를 구해 출력하시오.
단, 면애의 타입을 int, float, double형
세가지로 선언하여 각각 출력해야한다.
변수명] 
	int형 : area_int
	float형 : area_float
	double형 : area_double
공식]
	원의넓이 = 반지름 * 반지름 * 3.14
실행결과]
int형 넓이:314
float형 넓이:314.0
double형 넓이:314.0
		 */
		
		final double PI = 3.14;
		int r = 10; 
		double result1 = r * r * PI;
		
		/*
		 큰 자료형을 작은 자료형에 대입할때는 자료의 손실이 있을수 있으므로
		 반드시 강제형변환(명시적형변환)을 통해 형변환후 대입해야한다.
		 */
		int area_int = (int)(result1);
		float area_float = (float)(result1);
		double area_double = (result1);
	
		System.out.println("int형 넓이="+ area_int);
		System.out.println("float형 넓이="+ area_float);
		System.out.println("double형 넓이="+ area_double);
	}

}
