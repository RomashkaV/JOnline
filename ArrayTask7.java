package by.jonline.algorithmization.main;

import java.util.Random;

/*
 * Даны действительные числа  a1,a2,...,a2n . Найти max(a1 + a2n-1...)
 * 
 */
public class ArrayTask7 {

	public static void main(String[] args) {
		
		int n;
		double result;
		
		n = 4;
		double[] a = new double [2 * n];
		
		initArray(a);
//		printArray(a);
		
		result = a[0]+a[2*n - 1];
		
		for (int i = 0; i < n; i++) {
			if ((a[i]+a[a.length - 1 - i]) > result) {
				result = a[i]+a[a.length - 1 - i];
			}
		}
		
		System.out.println("\r" + result);
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
