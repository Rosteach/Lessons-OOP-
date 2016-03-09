package week6_lesson2_06_05_15;
import java.util.Scanner;
public class exmplScan {
 public static void main(String[] args) throws InterruptedException {
	 SecondThread obj1 = new SecondThread ("Thr1"); 
	 SecondThread obj2 = new SecondThread("Thr2");
  obj1.start();
  obj2.start();
  
  Scanner scan = new Scanner(System.in);
  scan.next();
  obj1.interrupt();
  //Thread.sleep(1000);
  obj2.interrupt(); 
 }
}
