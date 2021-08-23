package by.jonline.algorithmization.main;
/*
 * Даны целые числа а1 ,а2 ,..., аn . 
 * Вывести на печать только те числа, для которых аi > i.
 */
import java.util.Random;

public class ArrayTask5 {

	public static void main(String[] args) {
		
		int [] a = new int [10];
		
		initArray(a);
		printArray(a);
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}

	}
	public static void initArray(int[] mas) {
		if (mas == null) {
			return;
		}
		Random random = new Random();
		
		for (int i = 0; i < mas.length; i++) {
		
			mas[i] = -10 + random.nextInt(30);
			
		}
	}
	
	public static void printArray(int[] mas) {
		if (mas == null) {
			return;
		}
		
		for (int i = 0; i < mas.length; i++) {
		
			System.out.print(mas[i]+ " ");
			
		}
		System.out.print("\r");
	}
}
