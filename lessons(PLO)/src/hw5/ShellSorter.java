/*
 Пользователь вводит количество сортируемых чисел, затем вводит числа.
 Отсортировать введенные числа методом Шелла и вывести на экран пары индексов обмениваемых элементов.
 Метод void sortShell(int[] vector)
 Класс задания: ShellSorter
 Пример:
 sortShell([6, 2, 5, 4, 6, 5])
 3 0
 1 0
 5 4
 4 3
*/

package hw5;
import java.util.Scanner;
public class ShellSorter {
public static void sortShell(int [] arr){
	int d = arr.length/2;
	while(d>0){
		for(int i = 0; i < (arr.length - d);i++){
			int j = i;
			while((j>=0)&&(arr[j]>arr[j+d])){		
				int temp = arr[j];
				arr[j]=arr[j+d];
				arr[j+d]=temp;
				j--;
				System.out.println((j+d+1)+" "+(j+1));
			}
		}
		d=d/2;
		
	}
	//for(int i=0;i<arr.length;i++)System.out.print(" ["+arr[i]+"],");
}
public static void main(String[] args) {
	//int [] arr = new int []{6,2,5,4,6,5};
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter quantity: ");
	int [] arr = new int [scan.nextInt()];
	for(int j=0;j<arr.length;j++){
		arr[j] = (int)(scan.nextInt());
		//System.out.print(arr[j]+", ");
	}
	System.out.println("");
	sortShell(arr);
}
}
