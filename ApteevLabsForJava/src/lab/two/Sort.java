package lab.two;

/**
 * 
 * Класс сортирующий массив
 * @author LittlePrince
 */
public class Sort {
	
	public static int lengthMassive = 5;
	public static double[] massive = new double[lengthMassive];
	
	/**
	 * Моды ддля сортировки ASC - возрастающая, DESC - убывающая 
	 */
	public static final String ASC = "ASC", DESC = "DESC";
	
	/**
	 * Точка входа программы
	 * @param args
	 */
	public static void main(String[] args) {
		initVariable();
		printMassive();
		sort(ASC);
		System.out.println("Результат сортировки по возрастанию:");
		printMassive();
		sort(DESC);
		System.out.println("Результат сортировки по убыванию:");
		printMassive();
	}
	
	/**
	 * Иницаилизация массива
	 */
	public static void initVariable(){
		massive[0] = 8d;
		massive[1] = -5d;
		massive[2] = 1d;
		massive[3] = 7d;
		massive[4] = 2d;
	}
	
	/**
	 * Вывод массива на консоль
	 */
	public static void printMassive(){
		for(int i = 0; i < massive.length; i++){
			System.out.println("x[" + i + "] = " + massive[i] + ";");
		}
	}
	
	/**
	 * Сортировка массива
	 * @param mod тип сортировки
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
	 * Смещение для сортировки по возрастанию
	 * @param row индекс строки
	 * @param col индекс колонки
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
	 * Смещение для сортировки по убыванию
	 * @param row индекс строки
	 * @param col индекс колонки
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
