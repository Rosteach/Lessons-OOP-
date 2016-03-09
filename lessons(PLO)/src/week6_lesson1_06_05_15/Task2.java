/*Task 2. Написать метод, проверяющий, является ли строка числом. 
 * Воспользоваться Integer. valueOf( str ). 
 * Если строка не число, то метод должен кидать исключение NullPointerException.
 */
package week6_lesson1_06_05_15;

public class Task2 {
	public static void main(String[] args) {
		String s = "123";
		Proverka(s);
		System.out.println(s);
	}
	public static void Proverka(String str){
		try{
		Integer.valueOf(str);
		}
		catch(Exception e){
			throw new NullPointerException();
		}
	}

}
