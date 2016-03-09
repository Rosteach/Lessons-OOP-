package hw4;

public class MainMyArrList {
	public static void main(String[] args) {
		MyArrayList AL = new MyArrayList();
		/*
		AL.add(11);
		AL.add(12);
		AL.add(13);
		AL.add(14);
		AL.add(15);
		AL.printMyArray();
		System.out.println(AL.indexOf(12));
		System.out.println(AL.remove(2));
		System.out.println(AL.indexOf(13));
		System.out.println(AL.indexOf(14));
		System.out.println(AL.indexOf(15));
		AL.printMyArray();
		*/
		AL.printMyArray();
		AL.add(1,10);
		AL.add(1,10);
		
		AL.printMyArray();
		AL.remove(1);
		AL.printMyArray();
		AL.add(1,11);
		AL.add(1,12);
		AL.add(2,13);
		AL.add(1,14);
		AL.printMyArray();
		System.out.println("++++++");
		System.out.println(AL.remove(2));
		AL.printMyArray();
		System.out.println(AL.remove(1));
		AL.printMyArray();
		System.out.println(AL.remove(1));
		AL.printMyArray();
		System.out.println(AL.remove(1));
		AL.printMyArray();
		System.out.println(AL.remove(1));
		AL.printMyArray();
		System.out.println(AL.size());
		//
		//System.out.print();
	}
}
