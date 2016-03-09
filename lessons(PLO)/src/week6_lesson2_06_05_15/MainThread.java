package week6_lesson2_06_05_15;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class MainThread {
	public static void main(String[] args) throws InterruptedException {
	/*MyThread obj1 = new MyThread("first");
	MyThread obj2 = new MyThread("second");
	obj1.start();
	
	obj2.start();
	System.out.println("end");
	*/
	Task1 obj = new Task1();

	obj.start();
	//Thread.sleep(10);
	Scanner scan = new Scanner(System.in);
	scan.next();
	obj.interrupt();
	}
}
