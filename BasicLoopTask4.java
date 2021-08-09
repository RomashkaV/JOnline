package by.jonline.basic.main;
/*
 *  Даны  числовой  ряд  и  некоторое  число  е.  Найти  сумму  тех  членов  ряда,  модуль  которых  больше  или  равен 
 *  заданному е. 
 */
public class BasicLoopTask4 {

	public static void main(String[] args) {
		
		int n;
		double e;
		double sum;
		
		e = 0.01;
		sum = 0;
		n = 10;
		
		for (int i = 1; i <= n ; i++) {
			
			double elememt = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
			if (Math.abs(elememt) >= e) {
				sum += elememt;
				
			}
			
		}
		
		System.out.println(sum);

	}

}
