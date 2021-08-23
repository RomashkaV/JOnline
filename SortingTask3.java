package by.jonline.algorithmization.main;

// Сортировка выбором
public class SortingTask3 {

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
		int max = 0;
		int maxIndex = 0;
		for (int i = 0; i < mas.length; i++) {

			sort = false;
			max = mas[i];
			maxIndex = 0;
			for (int j = i; j < mas.length - 1; j++) {
				if (max < mas[j + 1]) {
					max = mas[j + 1];
					maxIndex = j + 1;
					sort = true;
				}
			}
			if (sort == true) {
				swap(mas, i, maxIndex);
			}
		}
	}
}
