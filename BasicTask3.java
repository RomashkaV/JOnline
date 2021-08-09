package by.jonline.basic.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class BasicTask3 {

	public static void main(String[] args) {
		
		double x = 0.5;
		double y = 1.0;
		double result;
		
		result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println(result);

	}

}
