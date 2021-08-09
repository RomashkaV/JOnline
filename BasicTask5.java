package by.jonline.basic.main;
/*
 * Дано натуральное число T, которое представляет длительность прошедшего времени
 * в секундах. Вывести данное значение длительности в часах, минутах и секундах в 
 * следующей форме: ННч ММмин SSc.
 */
public class BasicTask5 {

	public static void main(String[] args) {
		
		int total = 10000;
		int hours;
		int minute;
		int seconds;
		
		hours = total / 3600;
		minute = (total - hours * 3600) / 60;
		seconds = total - minute * 60 - hours * 3600;
		
		System.out.println(hours + "ч " + minute + "мин " + seconds + "c");
	}
}
