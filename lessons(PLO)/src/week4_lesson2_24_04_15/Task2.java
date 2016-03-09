/*Task2. Ќаписать рекурсивный метод, который принимает в качестве параметров k.
ћетод выводит числа от 2 до k.*/
package week4_lesson2_24_04_15;

public class Task2 {
	public static void main(String[] args){
		int k=4;
		Method(k);
	}
	public static void Method(int k){
		//System.out.print(k);
		if(k>2)Method(k-1);
		if(k<2)Method(k+1);
		System.out.print(k+",");
	}
}
