package by.jonline.algorithmization.main;

// Сортировка Шелла
public class SortingTask6 {

	public static void main(String[] args) {

		double[] a = { 10, 15, 16, 0, 22, 25, -2, 4, 5, 7, 9, 13, 16, 17, 20, 23 };
		sortArray(a);
		printArray(a);
	}

	public static void sortArray(double[] mas) {
		double tmp;
		int j;
		for (int step = mas.length / 2; step > 0; step /= 2) {

			for (int i = step; i < mas.length; i++) {
				tmp = mas[i];
				j = i;
				while (j >= step) {

					if (tmp < mas[j - step]) {
						mas[j] = mas[j - step];
					} else {
						break;
					}
					j -= step;
				}
				mas[j] = tmp;
			}
		}

	}

	public static void printArray(double mas[]) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + " ");
		}
		System.out.println();
	}

}