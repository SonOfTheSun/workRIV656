package lab.one;

/**
 * ����� ��� ������� ����������
 * 
 * @author LittlePrince
 */
public class Hypotenuse {

	static double a = 10d, b = 4d;
	
	/**
	 * ��������� ������ ���������� �� ����������������� ���������
	 * @return 
	 */
	public static double hyp(){
		return Math.sqrt(a*a + b*b);
	}
	
	/**
	 * ��������� ������ ����������
	 * @param a �����
	 * @param b �����
	 * @return ����������
	 */
	public static double hyp(double a, double b){
		return Math.sqrt(exponent(a, 2) + exponent(b, 2));
	}
	
	/**
	 * ����� �������� ����� � ��������� �������
	 * @param a ��������� �������
	 * @param b ���������� �������
	 * @return �������������� �������� (a^b)
	 */
	public static double exponent(double a, double b){
		return Math.exp(b*Math.log(a));
	}
	
	/**
	 * ����� ��� ������� ����������
	 * ���������� ������� ����� ���������� {@link Math}
	 * @param a ��������� �������
	 * @param b ���������� �������
	 * @return �������������� �������� (a^b)
	 */
	public static double hypByMath(double a, double b){
		return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
	}
	
	/**
	 * ����� ����� ���������
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("����� a = " + a);
		System.out.println("����� b = " + b);
		System.out.println("���������� �� ������ hyp = " + hyp());
		System.out.println("���������� �� ������ hyp � ����������� = " + hyp(a, b));
		System.out.println("���������� �� ������ hypByMath = " + hypByMath(a, b));
	}

}
