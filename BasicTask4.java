package by.jonline.basic.main;
/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой части).
 * Поменять местами дробную  и целую части числа и вывести полученное значение числа.
 */

public class BasicTask4 {

	public static void main(String[] args) {
		
		double r = 123.567;
		double result;
		
		result = (int) (r * 1000) % 1000 + (int)r / 1000.0; 
				
		System.out.println(result);

	}
	
}
