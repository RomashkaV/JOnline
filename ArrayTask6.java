package by.jonline.algorithmization.main;

import java.util.Random;

/*
 *  Задана  последовательность  N  вещественных  чисел.  
 *  Вычислить  сумму  чисел,  порядковые  номера  которых 
 *  являются простыми числами
 */
public class ArrayTask6 {

	public static void main(String[] args) {
		
		int n;
		int counter;
		double result;
		
		n = 10;
		counter = 0;
		result = 0;
		double[] a = new double [n];
		
		initArray(a);
//		printArray(a);
		
		for (int i = 1; i < a.length; i++) {
			
			for (int j = 2; j <= i+1; j++) {
				
				if (((i+1) % j) == 0) {      //порядковый номер числа = i+1
					counter++;
				}
			}
			if (counter < 2) {
//				System.out.println(i+1);
				result += a[i];
			}
			counter = 0;
		}
		
		System.out.println("\r"+result);
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
