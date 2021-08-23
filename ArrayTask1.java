package by.jonline.algorithmization.main;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К

public class ArrayTask1 {

	public static void main(String[] args) {
		
		int a [] = {1,2,3,4,5,6,7,8,9}; 
		int k = 3;
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if ((a[i] % k) == 0) {
				
				result += a[i];
			}  
		}
		System.out.println(result);
	}

}
