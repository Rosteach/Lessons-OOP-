package week2_lesson2_09_04_15;
	import java.util.Scanner;

	public class ConsoleMenuExmple {
	 private static 
	 String[] operationNames = {"1. ������","2. ����"
	          ,"3. �����","4. �����"};
	 public static void printMenu(){
	  for(String m:operationNames) System.out.println(m);
	 }
	 public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  boolean runWhile = true;
	  while(runWhile){
	   printMenu();
	   System.out.println("�������� ��������:");
	   int k = scan.nextInt();
	   switch (k){
	    case 1:f1();break;
	    case 2:f2();break;
	    case 3:f3();break;
	    case 4:runWhile = false;
	   }
	  }
	  scan.close();
	 }
	 public static void f1(){
	  System.out.println("Method1");
	 }
	 public static void f2(){
	  System.out.println("Method2");
	 }
	 public static void f3(){
	  System.out.println("Method3");
	 }
	 
}

