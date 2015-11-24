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
		print("x           = ", addZero(length, Integer.toBinaryString(x)));
		print("y           = ", addZero(length, Integer.toBinaryString(y)));
		print("Conjunction = ", addZero(length, Integer.toBinaryString(conjunction())));
		print("Disjunction = ", addZero(length, Integer.toBinaryString(disjunction())));
		print("binaryNot x = ", addZero(length, Integer.toBinaryString(binaryNot(x))));
		print("binaryNot y = ", addZero(length, Integer.toBinaryString(binaryNot(y))));
		print("binaryXor   = ", addZero(length, Integer.toBinaryString(binaryXor())));
		print("shiftLeft x = ", addZero(length, Integer.toBinaryString(shiftLeft(x, shift))));
		print("shiftRight x = ", addZero(length, Integer.toBinaryString(shiftRight(x, shift))));
		print("unsignedShiftRight x  = ", addZero(length, Integer.toBinaryString(unsignedShiftRight(x, shift))));
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
	 * добавление лидирующих нолей
	 * @param length длина строки
	 * @param value значение, к которому приращиваются ноли
	 * @return результирующая строка длины @param length
	 */
	public static String addZero(int length, String value){
		return getStringZero(length).substring(value.length()) + value;
	}
	
	/**
	 * Получение 0-строки заданной длины
	 * @param length длина строки
	 * @return результирующая строка длины length
	 */
	public static String getStringZero(int length){
		StringBuilder builder = new StringBuilder();
		builder.setLength(length);
		return builder.toString().replace('\0', '0');
	}
	
	
}
