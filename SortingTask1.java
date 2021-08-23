package by.jonline.algorithmization.main;

/*
 * Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
 * Объединить их в один  массив,  включив  второй  массив  
 * между  k-м  и  (k+1)  -  м  элементами  первого,  
 * при  этом  не  используя дополнительный массив
 */
public class SortingTask1 {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 1 };
		int[] b = { 3, 3, 3, 3 };
		int[] result;
		int k = 2;

		result = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			result[i + a.length] = b[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			swap(result, k + i, a.length + i);
		} 
		
		printArray(result);

	}
	
	public static void swap(int mas[], int i, int j) {
		if (mas == null) {
			return;
		}

		if ((i < 0) || (i > mas.length - 1) || (j < 0) || (j > mas.length - 1)) {
			return;
		}

		int temp;
		temp = mas[i];
		mas[i] = mas[j];
		mas[j] = temp;
	}
	
	public static void printArray(int mas[]) {
	
		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

}
