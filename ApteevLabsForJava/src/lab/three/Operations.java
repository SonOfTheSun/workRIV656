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
	 * ����� ��������� ����� ����� � �������� ���� � ����������� ������
	 * 1. ���������� ����� � 33-��������� � ���������� 1
	 * 2. ���������� ���������� ����� � ������
	 * 3. ������� ���������� 1
	 * @param value ��������, � �������� ������������� ����
	 * @return ������ � ������� ���������� �����
	 */
	public static String trunk(int value){
		return Integer.toBinaryString(setMask(value)).substring(1);
	}
	
	/**
	 * ����� ����������� ����� "10{32}",
	 * � ���������� ���������� ����� � 33 �������, � ������� �������� 1, 
	 * � ��������� ��������� ����� ��� ���������, ��� ����� ������� {@link Integer.toBinaryString()}
	 * �� �������� ���������� ����
	 * @param ����� ��� ��������������
	 * @return 
	 */
	public static Integer setMask(Integer value){
		return value|Integer.MIN_VALUE;
	}
	
	
}
