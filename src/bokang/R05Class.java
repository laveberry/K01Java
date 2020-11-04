package bokang;

import bokang.sub.CheckCard1;
import bokang.sub.CheckCard2;
import bokang.sub.CheckCard3;

public class R05Class {

	public static void main(String[] args) {
		
		//체크카드 클래스ver01, 초기화진행
		/*
		 숫자를 구분할때 구분자로 언더바를 사용할수 있다.
		 JDK7.0부터 지원되었으며 숫자사이에 쓰는것만 허용된다.
		 잘못된방법]
		 	3._14159
		 	123_456_
		 	_123_456
		 	위와같이 언더바로 시작하거나 끝날수 없고, 소수점과
		 	연결해서도 사용할수없다.
		 */
		CheckCard1 cc1 = new CheckCard1(); //객체생성
		//메인함수에서 초기화 진행
		cc1.cardNumber = 1111-2222-3333-4444L; //L붙여야함, 빼기가됨
		cc1.cardNumber = 1111_2222_3333_4444L; //_언더바 연결
		cc1.owner = "홍길동";
		cc1.balance = 10000;
		cc1.point = 0;
		
		//5000원 결제
		cc1.payment(5000);
		//10000원 결제
		cc1.payment(10000);
		//현재상태 출력
		cc1.showState();
		
		
		/******************************************************/
		//객체생성후 초기화메소드를 통해서 멤버변수 초기화 
		CheckCard2 cc2 = new CheckCard2();
		cc2.initMembers(1234_5678_9012_3456L, "안효섭", 3000, 0);
		
		//인자생성자를 통해 객체생성과 동시에 멤버변수 초기화
		CheckCard2 cc3 = new CheckCard2(9876_5432_1098_7654L, "태연", 100000, 0);
		
		cc2.charge(8000);
		cc2.payment(9000);
		cc2.showState();
		
		cc3.charge(18000);
		cc3.payment(19000);
		cc3.showState();
		
		//private멤버이므로 메인함수에서 호출하여 초기화 불가능
//		cc2.getBalance = 9900; 
//		cc2.owner = "아이린";
		cc2.setBalance(9900); //setter를 통해 초기화 진행
		cc2.setOwner("수지");
		cc2.showState();
		
		CheckCard3 cc4 = new CheckCard3();

	}
}
