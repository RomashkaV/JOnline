package by.jonline.algorithmization.main;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)
public class Array2Task6 {
	public static void main(String[] args) {
		int n;

		n = 8;

		int[][] array = new int[n][n];

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array[i].length - i; j++) {

				array[i][j] = 1;
				array[array.length - 1 - i][j] = 1;
			}
		}
		printArray(array);
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
}
