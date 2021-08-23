package by.jonline.algorithmization.main;

/*
 *  Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
 *  если угол между сторонами длиной X и Y— прямой.
 */
public class DecompositionTask9 {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		double t;
		double result1;
		double result2;

		x = 3;
		y = 4;
		z = 5;
		t = 6;

		result1 = areaOfRightTriangle(x, y) + areaOfTriangle(hypotenuse(x, y), z, t);
		result2 = Math.abs(areaOfRightTriangle(x, y) - areaOfTriangle(hypotenuse(x, y), z, t));
		System.out.println("Площадь выпуклого четырехугольника " + result1);
		System.out.println("Площадь не выпуклого четырехугольника " + result2);
	}

	public static double areaOfRightTriangle(double cathetus1, double cathetus2) {
		return cathetus1 * cathetus2 / 2.0;
	}

	public static double areaOfTriangle(double sideA, double sideB, double sideC) {
		double p;

		p = (sideA + sideB + sideC) / 2.0;

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
	}

	public static double hypotenuse(double cathetus1, double cathetus2) {
		return Math.sqrt(Math.pow(cathetus1, 2) + Math.pow(cathetus2, 2));
	}

}
