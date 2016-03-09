package week2_lesson2_09_04_15;

public class Car {
	 String number;
	 String color;
	 Boolean start;
	 Boolean move;
	 	 
	 public void printAbout() {
	  System.out.println(number + " " + color);
	 }

	 public void start() {
	  
	  if (start == true) {
	   System.out.println("Авто з номером=" + number + " завелося");
	  } else {
	   System.out.println("Авто з номером=" + number + " не завелося");
	  }
	 }

	 public void move() {
	  if (start == true && move ==true) {
	   System.out.println("Авто з номером=" + number + " поїхало");
	  } else if (start == false && move ==true) {
	   System.out.println("Авто з номером=" + number + " не може поїхати бо воно не завелося");
	   
	  } else {
	   System.out.println("Авто з номером=" + number + " не поїхало");
	  }
	 }

	 public void stop() {
	  if (start == false) {
	   System.out.println("Авто з номером=" + number + " не може зупинитися бо воно не завелося");
	  } else if (move == false) {
	   System.out.println("Авто з номером=" + number + "  не може зупинитися бо воно не їхало");
	  }else {
	   System.out.println("Авто з номером=" + number + " зупинилося");
	  }
	 }
}
