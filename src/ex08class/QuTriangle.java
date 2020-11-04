package ex08class;

//클래스 만들때: 멤버변수, 생성자, 멤버메소드 필요
class Triangle{
	//멤버변수
	int bottom;//밑변
	int heigh;//높이
	
	//밑변과 높이를 초기화하는 멤버메소드
	public void init(int bottom, int _heigh) {
		this.bottom = bottom; //this.멤버변수 = 매개변수
		heigh = _heigh;//이름이 다른경우는 this 안붙여도됨
	}
	
	//밑변을 설정
	//int형 함수로 안만들어도도네여 ?, void임
	public void setBottom(int bot) {
		bottom = bot;
	}
	
	//높이를 설정
	public void setHeight(int hei) {
		heigh = hei;
	}
	
	//소수점이 나올 가능성 있으니 double
	//삼각형의 넓이를 구하는 멤버메소드
	public double getArea() {
		return bottom*heigh*0.5;
	}
}


//'class중'에 public 붙은건 한개
public class QuTriangle {
	
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}

//내가한고
//class Triangle{
//	
//	int bottom, heigh;
//	
//	void init(int bottom, int heigh) {
//		this.bottom = bottom;
//		this.heigh = heigh;
//	}
//	
//	int setBottom(int bottom) {
//		this.bottom = bottom;
//		return bottom;
//	}
//	
//	int setHeight(int heigh) {
//		this.heigh = heigh;
//		return heigh;
//	}
//	
//	double getArea() {
//		return bottom*heigh/2.0;
//	}
//	
//}