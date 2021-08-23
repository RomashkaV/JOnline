package by.jonline.algorithmization.main;

import java.util.Random;

/*
 * На плоскости заданы своими координатами n точек. 
 * Написать метод(методы), определяющие, между какими 
 * из пар точек самое большое расстояние. Указание. 
 * Координаты точек занести в массив. 
 */
public class DecompositionTask4 {

	public static void main(String[] args) {
		int n; 
		n=6;
		
		int[][] points = new int[n][2];
		initArray(points);
		printArray(points);
		maxDistance(points);
	}

	public static double distance(int[] point1, int[] point2) {
		return Math.sqrt(Math.pow((double) (point1[0] - point2[0]), 2) + Math.pow((double) (point1[1] - point2[1]), 2));
	}

	public static void maxDistance(int[][] coordArray) {
		double max = 0;
		int maxPoint1 = 0;
		int maxPoint2 = 0;
		for (int i = 0; i < coordArray.length; i++) {
			for (int j = i + 1; j < coordArray.length; j++) {

				if (distance(coordArray[i], coordArray[j]) > max) {
					max = distance(coordArray[i], coordArray[j]);
					maxPoint1 = i;
					maxPoint2 = j;
				}
			}
		}
		System.out.println("Самое большое расстояние между точками [" + coordArray[maxPoint1][0] + ", "
				+ coordArray[maxPoint1][1] + "], [" + coordArray[maxPoint2][0] + ", " + coordArray[maxPoint2][1] + "]");
	}
	
	public static void initArray(int[][] mas) {
		if (mas == null) {
			return;
		}
		Random random = new Random();
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				
			mas[i][j] = -10 + random.nextInt(20);
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
