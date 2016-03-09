package week1_lesson2_03_04_15;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
public class Task1 {
	public static void main(String[] args) throws Exception{
		  FileWriter fw = new FileWriter("file1.txt");
		  fw.write("stroka 1\n");// \n \r\n
		  fw.write("stroka 2");
		  fw.flush();
		  fw.close();

		  FileReader fr = new FileReader("file1.txt");
		  Scanner scan = new Scanner(fr);
		  int i = 0;
		  while (scan.hasNextLine()) {
		   System.out.println("строка с номером :" + i+": " + scan.nextLine());
		  }
		  scan.close();
	}
}


