package by.jonline.algorithmization.main;
/*
 * Даны две последовательности 
 * Образовать из них новую последовательность 
 * чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать.
 */
public class SortingTask2 {

	public static void main(String[] args) {
		
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 3, 4, 4 };
		int[] result;
		
		result = new int[a.length + b.length];
		
		for (int i = 0; i < a.length; i++) {
			result[i] = a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			result[i + a.length] = b[i];
		}
		
		sortArray(result);
		
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
	
	public static void sortArray(int[] mas) {
		boolean sort;
		sort = true;
		
		while (sort == true) {
			sort = false;
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i+1]) {
					swap(mas, i, i+1);
					sort = true;
				}
			} 
		}
	}
}
