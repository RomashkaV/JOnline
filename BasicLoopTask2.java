package by.jonline.basic.main;
/*
 * Вычислить значения функции на отрезке [а,b] c шагом h
 */
public class BasicLoopTask2 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int h;
		double x;
		double f;
		double stepx;
		
		a = -5;
		b = 5;
		h = 8;
		stepx = (b - a) / (double)h;
		
		for (int i = 0; i < h; i++) {
			x = a + stepx * i;
			
			if (x > 2) {
				f = x;
			}
			else {
				f = -x;
			}
			
			System.out.println(x + "   " + f + "   ");
		}

	}

}
