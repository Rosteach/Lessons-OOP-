/*Task1. ��������� � ������� ���� ����� � ����������. 
������� �� ����� ��� ����� � ��c�������� �� ���� �����.*/

package week4_lesson1_22_04_15;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
public class File_task1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("enter path : ");
		File path= new File(scan.nextLine());
		System.out.print("enter expansion : ");
		File exp= new File(scan.nextLine());
		File[] files = path.listFiles();
		
		System.out.println(Arrays.toString(files));
		scan.close();
	}
}
