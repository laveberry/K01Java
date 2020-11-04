package bokang.sub;

/*
체크카드 클래스 Ver.01

시나리오] 체크카드를 클래스로 표현해보자.
	멤버변수 : 카드번호, 소유자, 잔액, 포인트
	멤버메소드 : 충전(입금), 결제, 적립, 현재상태출력
	적립율 : 사용금액의 0.1%	
*/

//멤버변수, 생성자, 멤버메소드
public class CheckCard1 {
	//멤버변수
	public long cardNumber; //패키지 다르니 변수에 public 붙임
	public String owner;
	public int balance;
	public int point;
	
	//멤버메소드
	//충전
	public void charge(int amount) { //메소드도 퍼블릭!
		//잔고에 충전할 금액을 더한다.
		this.balance += amount;
	}
	
	//결제
	public void payment(int amount) {
		//잔고에서 결제할 금액만큼 차감된다.
		this.balance -=amount;
		//카드를 사용할때 적립금이 발생하게되므로 호출해준다.
		savingPoint(amount); //적립을 위해 호출!
	}
	
	//적립
	public void savingPoint(int amount) {
//		this.point += (amount*0.1); //방법1
		double plusPoint = (amount * 0.1);
		this.point += plusPoint; //복합연산자로 자동형변환 일어남
		//큰게 작은거로 갈때는 형변환 해줘야함 원래는 (int)plusPoint
	}
	
	//현재상태 출력
	public void showState() {
		System.out.println("=======================");
		System.out.println("카드번호:" + cardNumber);
		System.out.println("소유자:" + owner);
		System.out.println("잔고:" + balance);
		System.out.println("포인트:" + point);
		System.out.println("=======================");
	}
}
