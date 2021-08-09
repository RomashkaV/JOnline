package by.jonline.basic.main;

import java.util.Scanner;

/*
 * Пользователь вводит любое целое положительное число. А программа суммирует 
 * все числа от 1 до введенного пользователем числа.
 */
public class BasicLoopTask1 {

	public static void main(String[] args) {
		int n;
		int sum;
		
		n = readFromConsole();
		sum = 0;
		
		for (int i = 1; i <= n; i++) {
			
			if ((Integer.MAX_VALUE - sum) > i) {
				sum += i;
			}
			else if (i == n){
				System.out.println("переполнение, результат некорректен ");
			}
			
		}
		
		System.out.println("сумма от 1 до " + n + " равна " + sum );
		
	}

	private static int readFromConsole() {
		
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.print("целое положительное число >> ");
		while (sc.hasNextInt() == false) {
			System.out.print(sc.nextLine());
			System.out.print("целое положительное число >> ");
		}
		
		x = sc.nextInt();
		
		if (x <= 0) {
			x = readFromConsole();
		}
		
		return x;
			
		
	}
}
