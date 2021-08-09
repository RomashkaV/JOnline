package by.jonline.basic.main;

import java.util.Random;

// Найти max{min(a,b), min(c,d)}

public class BasicBranchingTask2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int d;
		int result;
		int minab;
		int mincd;
		
		Random random = new Random();
		
		a = random.nextInt(9);
		b = random.nextInt(9);
		c = random.nextInt(9);
		d = random.nextInt(9);
		
		System.out.println(
				  "a = " + a + 
				", b = " + b + 
				", c = " + c +
				", d = " + d
				);
		
		if (a <= b) {
			minab = a;
		}
		else {
			minab = b;
		}
		
		if (c <= d) {
			mincd = c;
		}
		else {
			mincd = d;
		}
		
		if (minab >= mincd) {
			result = minab;
		}
		else {
			result = mincd;
		}
		
		
		System.out.println("max{ min(a,b), min(c,d) } = " + result);

	}

}
