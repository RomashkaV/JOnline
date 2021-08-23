package by.jonline.algorithmization.main;

/*
 * Пусть  даны  две  неубывающие  последовательности  действительных  чисел  
 * Требуется указать те места, на которые нужно вставлять элементы второй последовательности первую 
 * последовательность так, чтобы новая последовательность оставалась возрастающей. 
 */
public class SortingTask7 {

	public static void main(String[] args) {

		int[] a = { -10, -5, 1, 3, 6, 8, 10, 15, 16, 19, 22, 25 };
		int[] b = { 2, 4, 5, 7, 9, 13, 16, 17, 20, 23 };

		for (int i = 0; i < b.length; i++) {
			System.out.print(findIndex(a, a.length, b[i]) + 1 + " ");
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
}
