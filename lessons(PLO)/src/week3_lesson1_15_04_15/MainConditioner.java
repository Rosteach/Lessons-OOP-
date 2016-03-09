/*Task. Написать класс BlockConditioners, Conditioner и MainConditioners.
Класс BlockConditioners-это набор кондишнов.
В блоке управления 10 кондиционеров.
Делегирование.
Класс Conditioner: int temperature, setTemperature(int k), turnOn(),turnOff(), getTemperature(),?? getTurn()
Класс MainConditioner: консольное меню, где вызываются только методы объекта  BlockConditioners.  
Консольное меню:
1. Отобразить состояние всех кондиционеров
2. Включить кондиционер с индексом...
3. Выключить кондиционер с индексом...
4. Установить температуру для кондиционера с индексом...
5. Выход.*/

package week3_lesson1_15_04_15;

import java.util.Scanner;

public class MainConditioner {
	 private static 
	 String[] operationNames = {"1. Прийти","2. Уйти"
	          ,"3. Зайти","4. Выйти"};
	 public static void printMenu(){
	  for(String m:operationNames) System.out.println(m);
	 }
	 public static void main(String[] args) {
	  Scanner scan = new Scanner(System.in);
	  boolean runWhile = true;
	  while(runWhile){
	   printMenu();
	   System.out.println("Выберите операцию:");
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

