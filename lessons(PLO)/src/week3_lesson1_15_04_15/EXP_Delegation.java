package week3_lesson1_15_04_15;

public class EXP_Delegation {
	 public class Hands {
	     public void clap() {
	         System.out.println("Хлопать в ладоши");
	     }
	 }

	 public class Legs {
	     public void jump() {
	         System.out.println("Прыгать");
	     }
	 }

	 public class Man {
	     private Hands hands = new Hands();
	     private Legs legs = new Legs();
	    
	     public void clap() {
	         hands.clap();
	     }
	    
	     public void jump() {
	         legs.jump();
	     }
	 }
}
