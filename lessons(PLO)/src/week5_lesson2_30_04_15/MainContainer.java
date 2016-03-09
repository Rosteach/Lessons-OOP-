package week5_lesson2_30_04_15;

public class MainContainer {
	 public static void main(String[] args) {
		  Container <Integer> obj1 = new Container <Integer> ();
		  obj1.setValue(15);
		  System.out.println(obj1.getValue());
		  obj1.print();
		  
		  Container<String> obj2 = new Container<String>();
		  obj2.setValue("");
		  System.out.println(obj2.getValue());
		  obj2.print();
	}
}
