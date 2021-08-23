package by.jonline.algorithmization.main;

import java.util.Random;

/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы
 */
public class Array2Task3 {

	public static void main(String[] args) {
		int k;
		int p;
		
		k = 2;
		p = 3;
		int[][] array = new int [5][5];
		
		initArray(array);
		printArray(array);
		System.out.println();
		for (int i = 0; i < array[k-1].length; i++) {
			
			System.out.print(array[k-1][i] + " ");
		
		}
		System.out.println("\r");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i][p-1] + " ");
		
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
