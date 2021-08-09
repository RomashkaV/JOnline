package by.jonline.basic.main;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class BasicLoopTask6 {

	public static void main(String[] args) {
		
		for (char i = 33; i < 126; i++) {
			System.out.println("ASCII " +(int)i + " -> " + i);
		}
		
	}

}
