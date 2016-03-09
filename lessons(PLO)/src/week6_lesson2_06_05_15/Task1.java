/*Task 1. Создать поток, который будет каждые 10 секунд выводить текущее время на экран. 
Сделать возможность прерывания потока с помощью команды с консоли.
 */

package week6_lesson2_06_05_15;

import java.text.SimpleDateFormat;

public class Task1 extends Thread {
	public Task1(){
	}
	public  void run(){
		long curTime = System.currentTimeMillis(); 
		  String curStringDate = new SimpleDateFormat("mm:ss").format(curTime);	
		//while(true){
		  
			//System.out.println(curStringDate);
		//}
		while(true){
			System.out.println(curStringDate); 
			   if(isInterrupted())break;
			  }
		
		 // System.out.println(curStringDate);
		}

}