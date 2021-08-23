package by.jonline.algorithmization.main;

import java.util.Random;

/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого 
 * являются числа, сумма цифр которых равна К и которые не большее N.
 */
public class DecompositionTask12 {

	public static void main(String[] args) {
		int k;
		int n;
		int[] a = new int[10];

		n = 500;
		k = 9;

		for (int i = 0; i < a.length; i++) {
			a[i] = rightValue(k, n);
		}
		printArray(a);
	}

	public static int rightValue(int k, int n) {
		int result;
		Random random = new Random();
		result = random.nextInt(500); 
		
		while (true) {
			
			if (chekValue(result, k)) {
				return result;
			}
			else {
				result = random.nextInt(n);
			}
		}
	}

	public static boolean chekValue(int value, int k) {
		
		int i = 1;
		int sum = 0;
		
		while ( i < value ) {
			
			sum += (Math.abs(value) % (i * 10)) / i;
			i *= 10;
		}
		if (sum == k) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
			
			System.out.print(mas[i]+ " ");
			
		}
	}
}
