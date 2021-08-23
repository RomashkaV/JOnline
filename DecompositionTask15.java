package by.jonline.algorithmization.main;

/*
 * Найти  все  натуральные  n-значные  числа,  цифры  в  которых  образуют  строго  возрастающую 
 * последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */
public class DecompositionTask15 {

	public static void main(String[] args) {
		int n;

		n = 4;

		for (int i = (int)Math.pow(10, n); i < (int)Math.pow(10, n + 1); i++) {
			if (chekValue(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean chekValue(int value) {

		int i = 1;
//		int sum = 0;
		int n0 = 0;
		int n1 = 0;

		while (i < value) {

			n0 = (Math.abs(value) % (i * 10)) / i;
			n1 = (Math.abs(value) % (i * 100)) / (i * 10);
			i *= 10;
			if (n0 <= n1) {
				return false;
			}
		}
		return true;
	}
}
