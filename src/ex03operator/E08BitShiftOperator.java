package ex03operator;

public class E08BitShiftOperator {

	public static void main(String[] args) {
		
		/*(내가적은거)
		 2^4  2^3  2^2  2^1  2^0
		  =    =    =    =    =
		  16   8    4    2    1
		  
		  01000
		  00100
		  
		 */
		
		
		System.out.println(2<<1);
		System.out.println(2<<2);
		System.out.println(2<<3);
		System.out.println("================");
		
		int num = 8;
		int sh1=1, sh2=2, sh3=3, sh4=4, sh5=5;
		
		System.out.println("Right shift 연산자");
		System.out.println(num >> sh1);//4 (00100)
		System.out.println(num >> sh2);//2 (00010)
		System.out.println(num >> sh3);//1 (00001)
		System.out.println(num >> sh4);//0 (00000)
		System.out.println(num >> sh5);//0
		System.out.println("===============");
		System.out.println(num >>> sh1);//4
		System.out.println(num >>> sh2);//2
		System.out.println(num >>> sh3);//1
		System.out.println(num >>> sh4);//0
		System.out.println(num >>> sh5);//0
		System.out.println("==============");
		System.out.println("Left shift 연산자");
		System.out.println(num << sh1);//16 
		System.out.println(num << sh2);//32
		System.out.println(num << sh3);//64
		System.out.println(num << sh4);//128
		System.out.println(num << sh5);//256
		System.out.println("================");
		
	}

}
