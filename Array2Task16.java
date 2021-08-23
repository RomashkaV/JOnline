package by.jonline.algorithmization.main;

// Построить магический квадрат 3 порядка
public class Array2Task16 {

	public static void main(String[] args) {

		int n;
		int countElement;

		n = 3;
		countElement = n * n;
		int[][] mas = new int[n][n];
		int[] rowMas = new int [countElement];
		
		for (int i = 0; i < rowMas.length; i++) {
			rowMas[i] = i + 1;
		}
		
		while (indexChangeElement(rowMas) != -1) {
			getNewArray(rowMas);
			arrayFromRow(mas, rowMas);
			if (checkArray(mas)) {
			printArray(mas);
			System.out.println();
			}
		}
		
	}

	public static void arrayFromRow(int[][] mas, int[] row) {
		if ((mas == null) || (row == null) || (mas.length * mas.length != row.length)) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = row[j + i*3];
			}
		}
	}

	public static void printArray(int[][] mas) {
		if (mas == null) {
			return;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean checkArray(int[][] mas) {
		if (mas == null) {
			return false;

		}
		int n;
		int mSum;
		int rowSum;
		int columnSum;
		int diagonal1Sum;
		int diagonal2Sum;
		boolean check;

		check = true;
		rowSum = 0;
		columnSum = 0;
		diagonal1Sum = 0;
		diagonal2Sum = 0;
		n = mas.length;
		mSum = n * (n * n + 1) / 2;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				rowSum += mas[i][j];
				columnSum += mas[j][i];
				if (i == j) {
					diagonal1Sum += mas[i][j];
				}

				if (i == j) {
					diagonal2Sum += mas[mas.length - 1 - i][j];
				}
			}

			if ((rowSum != mSum) || (columnSum != mSum)) {
				check = false;
			}

			rowSum = 0;
			columnSum = 0;
		}

		if ((diagonal1Sum != mSum) || (diagonal2Sum != mSum)) {
			check = false;
		}

		return check;
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

	public static int indexChangeElement(int[] mas) {
		if (mas == null) {
			return -1;
		}

		for (int i = mas.length - 2; i >= 0; i--) {
			if (mas[i] < mas[i + 1]) {
				return i;
			}
		}
		return -1;
	}

	public static int index2ChangeElement(int[] mas, int indexChange) {
		if (mas == null) {
			return -1;
		}
		for (int i = mas.length - 1; i > indexChange; i--) {
			if (mas[indexChange] < mas[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void reverseTail(int[] mas, int indexChange) {
		if (mas == null) {
			return;
		}
		int indexTail;
		indexTail = indexChange + 1;

		for (int i = 0; i < (mas.length - indexChange) / 2; i++) {

			swap(mas, indexTail + i, mas.length - 1 - i);
		}
	}

	public static int[] getNewArray(int[] mas) {
		if (mas == null) {
			return null;
		}

		int indexChange;
		int index2Change;

		indexChange = indexChangeElement(mas);

		if (indexChange == -1) {
			return null;
		}
		index2Change = index2ChangeElement(mas, indexChange);
		swap(mas, indexChange, index2Change);
		reverseTail(mas, indexChange);

		return mas;
	}
}
