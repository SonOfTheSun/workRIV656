package lab.two;

/**
 * 
 * ����� ����������� ������
 * @author LittlePrince
 */
public class Sort {
	
	public static int lengthMassive = 5;
	public static double[] massive = new double[lengthMassive];
	public static String[] strMassive = new String[lengthMassive];
	
	/**
	 * ���� ���� ���������� ASC - ������������, DESC - ��������� 
	 */
	public static final String ASC = "ASC", DESC = "DESC";
	
	/**
	 * ����� ����� ���������
	 * @param args
	 */
	public static void main(String[] args) {
		initVariable();
		printMassive();
		sort(ASC);
		System.out.println("��������� ���������� �� �����������:");
		printMassive();
		sort(DESC);
		System.out.println("��������� ���������� �� ��������:");
		printMassive();
		printStrMassive();
		sortString(strMassive, ASC);
		System.out.println("��������� ���������� �� �����������:");
		printStrMassive();
		sortString(strMassive, DESC);
		System.out.println("��������� ���������� �� ��������:");
		printStrMassive();
	}
	
	/**
	 * ������������� �������
	 */
	public static void initVariable(){
		massive[0] = 8d;
		massive[1] = -5d;
		massive[2] = 1d;
		massive[3] = 7d;
		massive[4] = 2d;
		strMassive[0] = "cba";
		strMassive[1] = "baab";
		strMassive[2] = "aasd";
		strMassive[3] = "fasd";
		strMassive[4] = "bdab";
	}
	
	/**
	 * ����� ������� �� �������
	 */
	public static void printMassive(){
		for(int i = 0; i < massive.length; i++){
			System.out.println("x[" + i + "] = " + massive[i] + ";");
		}
	}
	
	/**
	 * ����� ������� ����� �� �������
	 */
	public static void printStrMassive(){
		for(int i = 0; i < strMassive.length; i++){
			System.out.println("x[" + i + "] = " + strMassive[i] + ";");
		}
	}
	
	/**
	 * ���������� �������
	 * @param mod ��� ����������
	 */
	public static void sort(String mod){
		for(int i = 0; i < lengthMassive; i++){
			for(int j = i+1; j < lengthMassive; j++){
				if(mod.equals(ASC))
					sortAsc(i, j);
				else
					sortDesc(i, j);
			}
		}
	}
	
	/**
	 * ���������� ������� �����
	 * @param massive ����������� ������
	 * @param mod ����� ����������: Sort.ASC - �� �����������, Sort.DESC - �� ��������
	 */
	public static void sortString(String[] massive, String mod){
		String buff;
		for(int row = 0; row < massive.length; row++){
			for(int col = 0; col < massive.length; col++){
				boolean leftMore = equalsLeftMore(massive[row], massive[col]);
				if((mod.equals(ASC) && leftMore) || (mod.equals(DESC) && !leftMore)){
					buff = massive[col];
					massive[col] = massive[row];
					massive[row] = buff;
				}
			}
		}
	}
	
	/**
	 * ��������� ���� ����� �����������
	 * @param left 
	 * @param right
	 * @return true - left ����� � ������ ��������(������), false - right ����� � ������ ��������(������)
	 */
	public static boolean equalsLeftMore(String left, String right){
		boolean result = false;
		for(int i = 0; i < left.length() || i < right.length();i++){
			if(left.charAt(i) > right.charAt(i)){
				break;
			} else
				if(left.charAt(i) < right.charAt(i)){
					result = true;
					break;
				}
		}
		return result;
	}
	
	/**
	 * �������� ��� ���������� �� �����������
	 * @param row ������ ������
	 * @param col ������ �������
	 */
	public static void sortAsc(int row, int col){
		double buff;
		if(massive[row] > massive[col]){
			buff = massive[col];
			massive[col] = massive[row];
			massive[row] = buff;
		}
	}
	
	/**
	 * �������� ��� ���������� �� ��������
	 * @param row ������ ������
	 * @param col ������ �������
	 */
	public static void sortDesc(int row, int col){
		double buff;
		if(massive[row] < massive[col]){
			buff = massive[col];
			massive[col] = massive[row];
			massive[row] = buff;
		}
	}
}
