package by.jonline.algorithmization.main;

import java.util.Random;

/*
 *  Даны действительные числа а1 ,а2 ,..., аn .
 *  Поменять местами наибольший и наименьший элементы. 
 */ 
public class ArrayTask4 {

	public static void main(String[] args) {
		int indexMin;
		int indexMax;
		int n;
		double temp;
		
		n = 10;
		indexMin = 0;
		indexMax = 0;
		double[] a = new double[n];

		initArray(a);
		//printArray(a);
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] > a[indexMax]) {
				indexMax = i;
			}
			
			if (a[i]<a[indexMin]) {
				indexMin = i;
			}
		} 
		temp = a[indexMin];
		a[indexMin] = a[indexMax];
		a[indexMax] = temp;
		System.out.println("элементы "+ indexMin +"(мин.) и "+ indexMax + "(макс.) были поменяны местами");
		printArray(a);
		

	}

	public static void initArray(double[] mas) {
		if (mas == null) {
			return;
		}
		Random random = new Random();
		
		for (int i = 0; i < mas.length; i++) {
		
			mas[i] = -10 + random.nextDouble() * 20;
			
		}
	}
	
	public static void printArray(double[] mas) {
		if (mas == null) {
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
		
			System.out.println(mas[i]+ " ");
			
		}
	}
}
