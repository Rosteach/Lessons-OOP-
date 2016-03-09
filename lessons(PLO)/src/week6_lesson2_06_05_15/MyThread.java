package week6_lesson2_06_05_15;

public class MyThread extends Thread {
	private String name;
	public MyThread(String name){
		this.name=name;
	}
	@Override
	public void run(){
		for(int i = 0; i<10; i++){
			System.out.print(name+","+i);
			System.out.println(" ");
		}
	}
}
