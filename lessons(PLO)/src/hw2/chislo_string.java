/* ������������ ������ �����. ������� � ���� ������. ���������� ����� ���� �����.
 ���������� ������ ��������� � ������ main.
 �������� ����� ����������� ����� � ��������� ������� �� �����.
 public boolean calcDigitsCount(String number)
 ������:
 calcDigitsCount("131")
 5*/

package hw2;
import java.util.Scanner;
public class chislo_string {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		String stroka = scan.nextLine();
		System.out.println("calcDigitsCount"+"("+stroka+")");
		calcDigitsCount(stroka);
		scan.close();
	}
	public static int calcDigitsCount(String numb){
		int sum = 0;		
		for(int i = 0;i<numb.length();i++){
			int x = Integer.parseInt(numb.charAt(i)+"");
			sum=sum+x;
		}
		System.out.println("["+sum+"]");
		return sum;
	}
}
