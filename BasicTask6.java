package by.jonline.basic.main;
/*
 * Для данной области составить линейную программу, которая печатает true, 
 * если точка с координатами (x,y) принадлежит закрашенной области,
 * и false - в противном случае.
 */
public class BasicTask6 {

	public static void main(String[] args) {
		
		double x = 2;
		double y = 4;
		boolean result;
		
		
		result = ((x >= -4) && (x <= 4) && (y >= -3) && (y <= 0)) ||
				 ((x >= -2) && (x <= 2) && (y >= -0) && (y <= 4));
		
		System.out.println(result);
	}

}
