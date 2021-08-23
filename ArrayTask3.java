package by.jonline.algorithmization.main;

import java.util.Random;

/*
 * Дан  массив  действительных  чисел,  размерность  которого  N.  Подсчитать,  сколько  в  нем  отрицательных, 
 * положительных и нулевых элементов. 
 */
public class ArrayTask3 {

	public static void main(String[] args) {
		
		int[] result =new int [3];
		int n;
		
		
		Random random = new Random();
		n = 10;
		double [] massive = new double [n]; 

		for (int i = 0; i < n; i++) {
		
			massive[i] = -10 + random.nextDouble() * 20;
			
		}
			
		for (int i = 0; i < massive.length; i++) {
			
			if (massive[i] > 0) {
				
				result[0]++ ;
			} 
			else if (massive[i] < 0) {
			
				result[1]++ ;
			}
			else {
				
				result[2]++ ;
			}
			
		 }
		System.out.println("+ -> " + result[0]);
		System.out.println("- -> " + result[1]);
		System.out.println("0 -> " + result[2]);
		}

}
