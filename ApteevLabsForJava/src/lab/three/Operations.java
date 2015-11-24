package lab.three;

/**
 * ����� ��� ������������ ������ �� ����
 * "�������������� �������� � Java"
 * @author LittlePrince
 */
public class Operations {
	
	public static int x = 7, y = 11;
	
	/** ����� ��������� ����� */
	public static int length = 32;
	
	/** ���������� ���������� ��������  */ 
	public static int shift = 2;

	/**
	 * ����� ����� ���������
	 * ����� ���� ����������� �� �������
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
	 * ����������
	 * @return
	 */
	public static int disjunction() {
		return x|y;
	}

	/**
	 * ����������
	 * @return
	 */
	public static int conjunction(){
		return x&y;
	}
	
	/**
	 * ��������� (��������� ��)
	 * @param value 
	 * @return
	 */
	public static int binaryNot(int value){
		return ~value;
	}
	
	/**
	 * ����������� ���
	 * @return
	 */
	public static int binaryXor(){
		return x^y;
	}
	
	/**
	 * ����� �����
	 * @param x �������������� �����
	 * @param count ����� ��������, �� ������� ������������ �����
	 * @return 
	 */
	public static int shiftLeft(int x, int count){
		return x << count;
	}
	
	/**
	 * ����� ������
	 * @param x �������������� �����
	 * @param count ����� ��������, �� ������� ������������ �����
	 * @return 
	 */
	public static int shiftRight(int x, int count){
		return x >> count;
	}
	
	/**
	 * ����������� ����� ������
	 * @param x �������������� �����
	 * @param count ����� ��������, �� ������� ������������ �����
	 * @return 
	 */
	public static int unsignedShiftRight(int x, int count){
		return x >>> count;
	}
	
	/**
	 * ����� ��������� �� �������
	 * @param message 
	 * @param value
	 */
	public static void print(String message, String value){
		System.out.println(message + value);
	}
	
	/**
	 * ���������� ���������� �����
	 * @param length ����� ������
	 * @param value ��������, � �������� ������������� ����
	 * @return �������������� ������ ����� @param length
	 */
	public static String addZero(int length, String value){
		return getStringZero(length).substring(value.length()) + value;
	}
	
	/**
	 * ��������� 0-������ �������� �����
	 * @param length ����� ������
	 * @return �������������� ������ ����� length
	 */
	public static String getStringZero(int length){
		StringBuilder builder = new StringBuilder();
		builder.setLength(length);
		return builder.toString().replace('\0', '0');
	}
	
	
}
