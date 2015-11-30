package lab.two;

/**
 *  ласс дл€ поиска максимального числа в массива натуральных чисел
 * @author LittlePrince
 */
public class Maxim {

	/**
	 * точка входа программы
	 * @param args
	 */
	public static void main(String[] args) {
		int m[] = {8, 3, 5, 1, 9};
		int f[] = {};
		try{
			System.out.println("max = " + findMaximum(f));
		}catch(RuntimeException re){
			System.out.println("Error! " + re.getMessage());
		}
	}
	
	/**
	 * ѕоиск максимального значени€
	 * @param rowNumber численный р€д
	 * @return максимальное значение массива
	 * @exception RuntimeException ≈сли был передан пустой массив
	 */
	public static int findMaximum(int[] rowNumber){
		if(rowNumber.length != 0){
			int max = rowNumber[0];
			for(int i=1; i < rowNumber.length; i++){
				if(rowNumber[i] > max) max = rowNumber[i];
			}
			return max;
		} else
			throw new RuntimeException("Ѕыл передан пустой массив! Ќаименьшее число найти не удалось");
	}

}
