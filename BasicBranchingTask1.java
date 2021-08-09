package by.jonline.basic.main;
/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
 * и если, да, то будет ли он прямоугольным. 
 */
public class BasicBranchingTask1 {

	public static void main(String[] args) {
		
		int angle1 = 30;
		int angle2 = 60;
		
		if (angle1 + angle1 < 180) {
			System.out.println("Треугольник с углами " + angle1 + "\u00B0 и " + angle2 + "\u00B0 существует");
			
			if ((angle1 + angle2 == 90) || (angle1 == 90) || (angle2 == 90)) {
				System.out.println("Треугольник прямоугольный");
			}
			
		}
		else {
			System.out.println("Треугольник с углами " + angle1 + "\u00B0 и " + angle2 + "\u00B0 не существует");
		}

	}

}
