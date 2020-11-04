package quiz;

import java.util.Random;

public class bubble {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int[] array = new int[10];
		
		array[0] = random.nextInt(10000)%99+1;
		while(true) {
			for(int i=1 ; i<array.length ; i++) {
				array[i] = random.nextInt(10000)%99+1;
				System.out.print(array[i]+ " ");
					if(array[i-1]>array[i]) {
						int temp = array[i-1];
						array[i-1] = array[i];
						array[i] = temp;
					}
					else {
						break;
					}
			}
			for(int i=0 ; i<array.length ; i++) {
			System.out.print(array[i]+" ");
			}
		}
	}
}
