package by.jonline.algorithmization.main;

// Сортировка перестановками
public class SortingTask4 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7 };

		sortArray(a);

		printArray(a);
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
				if (mas[i] < mas[i+1]) {
					swap(mas, i, i+1);
					sort = true;
				}
			} 
		}
	}
}
