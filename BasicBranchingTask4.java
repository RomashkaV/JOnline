package by.jonline.basic.main;
/*
 * Заданы размеры прямоугольного отверстия A, B и размеры x, y, z кирпича. 
 * Определить пройдет ли кирпич через отверстие.
 */
public class BasicBranchingTask4 {

	public static void main(String[] args) {
		
		int holeA;
		int holeB;
		int brickX;
		int brickY;
		int brickZ;
		int min1 = 0;
		int min2 = 0;
		
		holeA = 142;
		holeB = 66;
		
		brickX = 250;
		brickY = 120;
		brickZ = 65;
		
		if ((brickX >= brickY) && (brickX >= brickZ)) {
			min1 = brickY;
			min2 = brickZ;
		}
		
		if ((brickY >= brickX) && (brickY >= brickZ)) {
			min1 = brickX;
			min2 = brickZ;
		}
		
		if ((brickZ >= brickX) && (brickZ >= brickY)) {
			min1 = brickX;
			min2 = brickY;
		}
		
		if (((holeA > min1) && (holeB > min2))||((holeA > min2) && (holeB > min1))) {
			System.out.println("кирпич пройдет в отверстие");
		}
		else {
			System.out.println("кирпич не пройдет в отверстие");
		}

	}

}
