package by.jonline.basic.main;

import java.util.Random;

/*
 * Вычислить значение функции
 */
public class BasicBranchingTask5 {

	public static void main(String[] args) {
		
		double x;
		double result;
		
		Random random = new Random();
		x = random.nextInt(10);
		
		if (x <= 3) {
			result = x * x - 3 * x + 9;
		}
		else {
			result = 1 / (x * x * x + 6);
		}
		
		System.out.println("для х = " + x + " результат равен " + result);
	}

}
