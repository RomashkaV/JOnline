package by.jonline.basic.main;
/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. 
 * m и n вводятся с клавиатуры
 */

import java.util.Scanner;

public class BasicLoopTask7 {

	public static void main(String[] args) {
		
		int m;
		int n;
		
		m = readFromConsole();
		n = readFromConsole();
		
		for (int i = Math.min(m, n); i <= Math.max(m, n); i++) {
			System.out.print("для " + i + " делители: " );
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					System.out.print(" " + j + "");
				}
			}
			System.out.print('\r');
		}
		
	}
	
	private static int readFromConsole() {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("натуральное число>> ");
		while (sc.hasNextInt() == false) {
			System.out.print(sc.nextLine());
			System.out.print("натуральное число>> ");
		}
		
		x = sc.nextInt();
		
		if (x <= 0) {
			x = readFromConsole();
		}
		
		return x;
			
		
	}
}
