package by.jonline.algorithmization.main;
/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали. 
 */
import java.util.Random;

public class Array2Task2 {

public static void main(String[] args) {
		
		int[][] array = new int [5][5];
		initArray(array);
		printArray(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if (i == j) {
					
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
				
			System.out.print(mas[i][j]+ "  ");
			}
		System.out.println();
		}
	}

}
