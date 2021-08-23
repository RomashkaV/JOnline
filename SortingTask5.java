package by.jonline.algorithmization.main;

// Сортировка вставками
public class SortingTask5 {

	public static void main(String[] args) {

		int[] a = { -10, -5, 1, 3, 6, 8, 10, 15, 16, 19, 22, 25,    2, 4, 5, 7, 9, 13, 16, 17, 20, 23 };
		int sorted = 12;
		int insertIndex = 0;
		
		for (int j = sorted; j < a.length; j++) {
			insertIndex = findIndex(a, j, a[j]);
			insertToIndex(a, insertIndex, j);
		}

		printArray(a);
	}

	
	public static void insertToIndex(int[] mas, int insertIndex, int elementIndex) {

		for (int i = elementIndex; i > insertIndex; i--) {

			swap(mas, i - 1, i);
		}
	}

	public static int findIndex(int[] mas, int countSorted, int searchValue) {

		int mid;
		int start = 0;
		int end = countSorted - 1;

		while (start <= end) {

			mid = (end - start) / 2 + start;

			if (searchValue == mas[mid]) {
				return mid;
			} else if (searchValue < mas[mid]) {
				end = mid - 1;
			} else if (searchValue > mas[mid]) {
				start = mid + 1;
			}

			if (start > end) {
				return start; // searchValue нет в массиве
			}
		}

		return -1;
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
