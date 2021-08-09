package by.jonline.basic.main;
 
// Даны три точки. Определить, будут ли они расположены на одной прямой.

public class BasicBranchingTask3 {

	public static void main(String[] args) {
		
		int x1, y1;
		int x2, y2;
		int x3, y3;
		double area;
		
		x1 = 0;
		y1 = 1;
		x2 = 1;
		y2 = 0;
		x3 = -1;
		y3 = 2;
		
		
		
		area = ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) / 2.0; // площадь треугольника
		
		if (area == 0) {
			System.out.println("Точки лежат на одной прямой");
		}
		else {
			System.out.println("Точки не лежат на одной прямой");
		}

	}

}
