package ex06array;


public class QuTwoDimArray {

	//문제에서 제시한 내용
	public static void addOneArr(int[] arr, int add)
	{

		for(int i=0; i<arr.length; i++){
			arr[i] += add; 
		}
	}
	
	//addOneArr() 메소드를 기반으로 2차원 배열을 증가시키는 메소드
	//arr[] 세로행을 전달했으니 가로정렬에 대한 배열
	public static void addTwoArr(int[][] arr, int add)
	{
		//세로 한행씩 전달해서, 가로에 대한 반복
		//세로에 대한 반복을 통해 한행씩 addOneArr()로 전달한다.
		//(이차원배열에서는 배열의 이름을 통해 세로길이를 알수있음)
		for(int i=0; i<arr.length; i++){
			addOneArr(arr[i], add);
		
			//내가한거(정답)
//		for(int a=0 ; a<arr.length ; a++) {
//			for(int b=0 ; b<arr[a].length ; b++) {
//				arr[a][b]+=add;
//			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){		
		/*배열선언 : 비어있는 부분은 null로 초기화 되므로
		 	배열시 .length가 아닌 숫자를 넣으면 오류날수있음*/
		int[][] arr = {
			{1, 2, 3, 4},
			{5, 6, 7},
			{8, 9}
		};
		//값 증가전 출력
		arrPrint(arr);		
		//2만큼 증가시키는 메소드 호출
		addTwoArr(arr, 2);
		//증가후 출력
		arrPrint(arr);
	}
	
	//2차원 배열을 출력하기 위한 메소드
	static void arrPrint(int[][] arr) {
		//세로크기만큼 반복(배열이름으로 가져옴)
		for(int i=0 ; i<arr.length ; i++) {
			//가로크기만큼 반복(인덱스하나)
			for(int j=0 ; j<arr[i].length ; j++) {
				//각각의 요소를 출력함(인덱스두개)
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();//가로행 출력후 줄바꿈
			}
	}
}
