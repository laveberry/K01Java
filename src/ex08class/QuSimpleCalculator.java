package ex08class;


class CalculatorEx{
	
	//멤버변수 : 각 연산의 횟수를 카운트 하기 위한 용도(전체사용가능, 지역변수x)
	int addCount;
	int minCount;
	int mulCount;
	int divCount;
	
	//초기화를 위한 멤버메소드
	public void init() {
		addCount = 0;
		minCount = 0;
		mulCount = 0;
		divCount = 0;
	}
	
	//연산횟수를 출력하는 멤버메소드
	public void showOpCount() {
		System.out.println("덧셈횟수:"+addCount);
		System.out.println("뺄셈횟수:"+minCount);
		System.out.println("곱셈횟수:"+mulCount);
		System.out.println("나눗셈횟수:"+divCount);
	}
	
	public double add(double n1, double n2) {
		//덧셈 연산을 수행하면 +1 증가
		addCount++;
		return n1+n2; //카운트하고 리턴해야하니 뒤에적기
	}
	
	public double min(double n1, double n2) {
		minCount++;
		return n1-n2;
	}
	
	public double mul(double n1, double n2) {
		mulCount++;
		return n1*n2;
	}
	
	public double div(double n1, double n2) {
		divCount++;
		return n1/n2;
	}
}

public class QuSimpleCalculator {
	
	public static void main(String[] args)
	{
		CalculatorEx cal = new CalculatorEx();//생성자
		cal.init();
		System.out.println("1 + 2 = " + cal.add(1 , 2));
		System.out.println("10.5 - 5.5 = " + cal.min(10.5 , 5.5));
		System.out.println("4.0 * 5.0 = " + cal.mul(4.0 , 5.0));
		System.out.println("100 / 25 = " + cal.div(100 , 25));
		System.out.println("10.0 * 3.0 = " + cal.mul(10.0 , 3.0));
		cal.showOpCount();
	}	
}


//내가한거(참조해섷;=졍답)
//class CalculatorEx{
//	
//	int plusadd, plusmin, plusmul, plusdiv;
//	
//	void init() {
//		//초기화
//		plusadd = 0;
//		plusmin = 0;
//		plusmul = 0;
//		plusdiv = 0;
//	}
//	
//	double add (double a, double b) {
//		plusadd++;
//		return a+b;
//	}
//	
//	double min(double a, double b) {
//		plusmin++;
//		return a-b;
//	}
//	
//	double mul(double a, double b) {
//		plusmul++;
//		return a*b;
//	}
//	
//	double div(double a, double b) {
//		plusdiv++;
//		return a/b;
//	}
//	
//	void showOpCount() {
//		System.out.println("덧셈횟수:" + plusadd);
//		System.out.println("뺄셈횟수:" + plusmin);
//		System.out.println("곱셈횟수:" + plusmul);
//		System.out.println("나눗셈횟수:" + plusdiv);
//	}
//	
//}