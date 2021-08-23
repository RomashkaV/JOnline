package by.jonline.algorithmization.main;

/*
 *  Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
 * натуральных чисел
 */
public class DecompositionTask1 {

	public static void main(String[] args) {
		int a;
		int b;

		a = 15;
		b = 9;

		System.out.println(gcd(a, b));
		System.out.println(lcm(a, b));
	}

	public static int gcd(int a, int b) {
		if ((a == 0) || (b == 0)) {
			System.out.println("Делитель для 0 не существует");
			return 0;
		}
		a = Math.abs(a);
		b = Math.abs(b);

		while (a != b) {

			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		return a;
	}

	public static int lcm(int a, int b) {
		if ((a == 0) || (b == 0)) {
			System.out.println("Кратное для 0 не существует");
			return 0;
		}
		a = Math.abs(a);
		b = Math.abs(b);

		return a * b / gcd(a, b);
	}
}
