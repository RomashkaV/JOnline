package by.jonline.basic.main;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class BasicTask2 {

	public static void main(String[] args) {
		
		double a = 1.4;
		double b = 2.1;
		double c = 3.5;
		double result;
		
		result= (b + Math.sqrt(b*b + 4*a*c))/ a*2 - a*a*a*c + 1/b*b;
		
		System.out.println(result);
	}

}
