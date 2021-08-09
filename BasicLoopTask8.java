package by.jonline.basic.main;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class BasicLoopTask8 {

	public static void main(String[] args) {

		int a;
		int b;
		int counterA;
		int counterB;
		int tempA;
		int tempB;
		int result;

		a = 603159;
		b = -710769;
		result = 0;
		tempA = 0;
		tempB = 0;
		counterA = 1;
		counterB = 1;

		while (counterA < Math.abs(a)) {

			tempA = (Math.abs(a) % (counterA * 10)) / counterA;

			while (counterB <= Math.abs(b)) {

				tempB = (Math.abs(b) % (counterB * 10)) / counterB;

				if (tempA == tempB) {

					result = tempB;
					System.out.print(result + " ");
					
				}
				counterB *= 10;
				
			}
			counterA *= 10;
			counterB = 1;
			
		}

	}

	
}
