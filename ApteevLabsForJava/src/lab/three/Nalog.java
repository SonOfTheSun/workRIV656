package lab.three;

/**
 * 
 * Класс для лабораторной работы по теме
 * "Арифметические операции в Java" 3 задание.
 * @author LittlePrince
 */
public class Nalog {

	/**
	 * Точка входа программы
	 * Вывод результатов
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Налог от 1200 = " + calcNalog(1200));
		System.out.println("Налог от 2100 = " + calcNalog(2100));
		System.out.println("Налог от 4000 = " + calcNalog(4000));
		System.out.println("Налог от 5500 = " + calcNalog(5500));
	}

	/**
	 * вычисление налога
	 * @param summ сумма, с которой считается налог
	 * @return сумма налога
	 */
	public static double calcNalog(int summ){
		return summ < 1500 ? summ*0.1 : summ < 3000 ? summ*0.2 : summ < 5000 ? summ*0.3 : summ*0.5;
	}

}
