package hw4;

//import java.util.ArrayList;

public class MainLinkList {
	public static void main(String[] args) {
		/*
		LinkList el = new LinkList();
		//LinkList e2 = new LinkList();
        //e2=el;
		
		el.add(10);
		el.add(11);
		el.add(12);
		el.add(13);
		el.add(14);
		el.add(15);
		el.print();
		System.out.println("Size="+el.size());
		el.remove(2);
		el.print();
		el.swapFirstLast();
		el.print();
		el.swapFirstLast();
	    el.print();
		
	    System.out.println();
		System.out.println("zhopa");
		*/
		
		LinkList LL = new LinkList();
		LL.add(11);
		LL.add(12);
		LL.add(13);
		//LL.add(14);
		//LL.add(15);
		
		//LL.revert();
		//LL.print();
		LL.remove(0);
		LL.print();
		LL.remove(0);
		LL.print();
		LL.remove(0);
		LL.print();
		

		LL.add(11);
		LL.add(12);
		LL.add(13);
		LL.add(14);
		LL.add(15);
		LL.add(16);

		LL.print();
		LL.revert();
		LL.print();
		
		
	}
}
