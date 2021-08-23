package by.jonline.algorithmization.main;
/* 
 * Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
import java.util.Random;

public class Array2Task1 {

	public static void main(String[] args) {
		
		int[][] array = new int [3][7];
		initArray(array);
		printArray(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j+=2) {
				
				if (array[0][j] > array[array.length - 1][j]) {
					
					System.out.print(array[i][j]+" ");
			
				}
			}
			
		System.out.println();
		
		}
	}
	
	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}
		Random random = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
			mas[i][j] = random.nextInt(9);
			}
		}
	}
	
	public static void printArray(int[][] mas) {
		if (mas == null) {
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
			System.out.print(mas[i][j]+ " ");
			}
		System.out.println();
		}
	}

}
