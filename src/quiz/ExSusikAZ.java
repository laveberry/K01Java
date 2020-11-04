package quiz;
/*
 문제3) 파일명 : ExSusikAZ.java
다음 수식을 만족하는 모든 A와 Z를 구하는 프로그램을 작성하시오.
  AZ
 +ZA
--------
  99
단, A와 Z는 서로다른 숫자이다.
실행결과]
09 + 90 = 99
18 + 81 = 99
27 + 72 = 99
36 + 63 = 99
45 + 54 = 99
54 + 45 = 99
63 + 36 = 99
72 + 27 = 99
81 + 18 = 99
90 + 09 = 99
 */

public class ExSusikAZ {

	public static void main(String[] args) {
		
		for(int A=0 ; A<=9 ; A++) {
			for(int Z=0 ; Z<=9 ; Z++) {
				
				/*
				 A와 Z는 서로다른 정수이므로 같은값이 나올때는 아래코드를
				 실행하지 않고 반복문의 처음으로 돌아간다.
				 */
				if(A==Z) {
					//A와 Z는 서로 다를 숫자이므로 확인 필요없음
					continue; //반복문의 처음으로 돌아감
				}
				else {
					//AZ와 ZA를 코드로 표현하면 아래와 같다.
					int result = (A*10+Z) + (Z*10+A);
					if(result==99) {
						System.out.printf("%d%d + %d%d = %d\n",
								A, Z, Z, A, result);
					}
				}
			}
		}
	}
}
