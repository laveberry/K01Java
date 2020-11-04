package ex04controlstatement;

public class Qu_04_05 {

	public static void main(String[] args) {
/*
 샘플코드]
public static void main(String[] args)
{
	int num1=50, num2=100;
	int big, diff;

	big = (num1>num2)? num1:num2; //조건?참:거짓;
	System.out.println(big);

	diff = (num1>num2)? num1-num2: num2-num1;
	System.out.println(diff); 
}

실행결과]
100
50 
		
 */
			int num1=50, num2=100;
			int big, diff;

	
			if(num1>num2) {
				System.out.println(num1);
				System.out.println(num1-num2);

			}
			else {
				System.out.println(num2);
				System.out.println(num2-num1);

			}
			
			
			
			
			
			
//			int dan = 2; //단
//			while(dan <= 9) {//단은 2~9까지 증가함
//				int su = 1; //수(하나의 단을 출력한 후 단이 증가하면 수는 1로 최기화됨)
//				while(su<=9) {//수는 1~9까지 증가함
//					//서식에 맞춰 출력할때는 printf()문이 유리함.
//					//★★★★★★★★★★ 띄어쓰기 확인
//					System.out.printf("%-2d*%-2d=%2d", dan, su, (dan*su));
//					//System.out.print(dan +"*"+ su +"="+ (dan*su));
//					System.out.print(" ");
//					su++;
//				}
//				//하나의 단을 모두 출력한후 다음 단을 출력하기위해 줄바꿈 처리
//				System.out.println();
//				dan++; //단 증가
//			}
//			System.out.println("\n====================\n");
//			
//			
			//단
			for(int dan=2 ; dan<=9 ; dan++)
			{
				//수
				for(int su=1 ; su<=9 ; su++) {
					System.out.print(dan+"*"+su+"="+(dan*su));
					System.out.print(" ");
				}
				//하나의 단을 출력후 줄바꿈
				System.out.println();
			}
			
			
			
			/*
			시나리오] 다음의 출력결과를 보이는 for문을 작성하시오
			출력결과
				0 0 0 1
				0 0 1 0
				0 1 0 0
				1 0 0 0
			해법 : x와 y를 더해서 5개 될때 1을 출력한다.
			 */
			
			System.out.println("==증가연산자 사용으로 구현==");
			for(int x=1 ; x<=4 ; x++)
			{
				for(int y=1 ; y<=4 ; y++)
				{
					if(x+y==5)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				//한줄 출력후 줄바꿈 처리
				System.out.println();
			}
			
			System.out.println("==감소연사자 사용으로 구현==");
			
			
			for(int x=1 ; x<=4 ; x++)
			{
				for(int y=4 ; y>=1 ; y--)
				{
					if(x==y)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
				//한줄 출력후 줄바꿈 처리
				System.out.println();
			}
			
			
			
	}

}
