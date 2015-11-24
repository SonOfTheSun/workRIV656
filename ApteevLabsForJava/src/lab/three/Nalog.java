package lab.three;

/**
 * 
 * ����� ��� ������������ ������ �� ����
 * "�������������� �������� � Java" 3 �������.
 * @author LittlePrince
 */
public class Nalog {

	/**
	 * ����� ����� ���������
	 * ����� �����������
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("����� �� 1200 = " + calcNalog(1200));
		System.out.println("����� �� 2100 = " + calcNalog(2100));
		System.out.println("����� �� 4000 = " + calcNalog(4000));
		System.out.println("����� �� 5500 = " + calcNalog(5500));
	}

	/**
	 * ���������� ������
	 * @param summ �����, � ������� ��������� �����
	 * @return ����� ������
	 */
	public static double calcNalog(int summ){
		return summ < 1500 ? summ*0.1 : summ < 3000 ? summ*0.2 : summ < 5000 ? summ*0.3 : summ*0.5;
	}

}
