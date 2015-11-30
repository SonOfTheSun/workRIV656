package lab.three;

/**
 * Класс для лабораторной работы по теме
 * "Арифметические операции в Java"
 * @author LittlePrince
 */
public class Operations {
	
	public static int x = 7, y = 11;
	
	/** длина разрядной сетки */
	public static int length = 32;
	
	/** количество сдвигаемых разрядов  */ 
	public static int shift = 2;

	/**
	 * Точка входа программы
	 * Вывод всех результатов на консоль
	 * @param args
	 */
	public static void main(String[] args) {
		print("x           = ", trunk(x));
		print("y           = ", trunk(y));
		print("Conjunction = ", trunk(conjunction()));
		print("Disjunction = ", trunk(disjunction()));
		print("binaryNot x = ", trunk(binaryNot(x)));
		print("binaryNot y = ", trunk(binaryNot(y)));
		print("binaryXor   = ", trunk(binaryXor()));
		print("shiftLeft x = ", trunk(shiftLeft(x, shift)));
		print("shiftRight x = ", trunk(shiftRight(x, shift)));
		print("unsignedShiftRight x  = ", trunk(unsignedShiftRight(x, shift)));
	}
	
	/**
	 * Дизъюнкция
	 * @return
	 */
	public static int disjunction() {
		return x|y;
	}

	/**
	 * Конъюнкция
	 * @return
	 */
	public static int conjunction(){
		return x&y;
	}
	
	/**
	 * Отрицание (логическо не)
	 * @param value 
	 * @return
	 */
	public static int binaryNot(int value){
		return ~value;
	}
	
	/**
	 * Исключающее ИЛИ
	 * @return
	 */
	public static int binaryXor(){
		return x^y;
	}
	
	/**
	 * Сдвиг влево
	 * @param x обрабатываемое число
	 * @param count число разрядов, на которое производится сдвиг
	 * @return 
	 */
	public static int shiftLeft(int x, int count){
		return x << count;
	}
	
	/**
	 * Сдвиг вправо
	 * @param x обрабатываемое число
	 * @param count число разрядов, на которое производится сдвиг
	 * @return 
	 */
	public static int shiftRight(int x, int count){
		return x >> count;
	}
	
	/**
	 * Беззнаковый сдвиг вправо
	 * @param x обрабатываемое число
	 * @param count число разрядов, на которое производится сдвиг
	 * @return 
	 */
	public static int unsignedShiftRight(int x, int count){
		return x >>> count;
	}
	
	/**
	 * Вывод сообщения на консоль
	 * @param message 
	 * @param value
	 */
	public static void print(String message, String value){
		System.out.println(message + value);
	}
	
	/**
	 * Метод выводящий целое число в двоичном коде с лидирующими нулями
	 * 1. превращаем число в 33-разрядное с лидирующей 1
	 * 2. превращаем полученное число в строку
	 * 3. удаляем лидирующую 1
	 * @param value значение, к которому приращиваются ноли
	 * @return строка с выводом лидирующих нолей
	 */
	public static String trunk(int value){
		return Integer.toBinaryString(setMask(value)).substring(1);
	}
	
	/**
	 * Метод накладывает маску "10{32}",
	 * в результате получается число в 33 разряда, с главным разрядом 1, 
	 * а остальные разрядные числа без изменений, тем самым функция {@link Integer.toBinaryString()}
	 * не обрезает лидирующие нули
	 * @param число для преобразования
	 * @return 
	 */
	public static Integer setMask(Integer value){
		return value|Integer.MIN_VALUE;
	}
	
	
}
