package lab.one;

/**
 * Класс для расчета гипотенузы
 * 
 * @author LittlePrince
 */
public class Hypotenuse {

	static double a = 10d, b = 4d;
	
	/**
	 * Выполняет расчет гипотенузы по предустановленным значениям
	 * @return 
	 */
	public static double hyp(){
		return Math.sqrt(a*a + b*b);
	}
	
	/**
	 * Выполняет расчет гипотенузы
	 * @param a катет
	 * @param b катет
	 * @return гипотенуза
	 */
	public static double hyp(double a, double b){
		return Math.sqrt(exponent(a, 2) + exponent(b, 2));
	}
	
	/**
	 * Метод возводит число в указанную степень
	 * @param a основание степени
	 * @param b показатель степени
	 * @return результирующее значение (a^b)
	 */
	public static double exponent(double a, double b){
		return Math.exp(b*Math.log(a));
	}
	
	/**
	 * Метод для расчета гипотенузы
	 * Использует готовый метод библиотеки {@link Math}
	 * @param a основание степени
	 * @param b показатель степени
	 * @return результирующее значение (a^b)
	 */
	public static double hypByMath(double a, double b){
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	/**
	 * Точка входа программы
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Катет a = " + a);
		System.out.println("Катет b = " + b);
		System.out.println("Гипотенуза по методу hyp = " + hyp());
		System.out.println("Гипотенуза по методу hyp с параметрами = " + hyp(a, b));
		System.out.println("Гипотенуза по методу hypByMath = " + hypByMath(a, b));
	}

}
