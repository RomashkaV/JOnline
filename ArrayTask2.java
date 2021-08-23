package by.jonline.algorithmization.main;
/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим 
 * числом. Подсчитать количество замен. 
 */
public class ArrayTask2 {

public static void main(String[] args) {
		
	double a [] = {1,2,3,4,5,6,7,8,9}; 
	int z = 3;
	int counter = 0;
		
	for (int i = 0; i < a.length; i++) {
		
		if (a[i] > z) {
			
			a[i] = z;
			counter++;
		}  
		System.out.print(a[i] + " ");
	 }
	System.out.print("\r" + counter + " замен");
	}

}
