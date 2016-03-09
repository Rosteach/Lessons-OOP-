package week6_lesson1_06_05_15;
import java.util.Scanner;

public class Test6Exception {
 public class MyException extends Exception{
  public MyException(String message){
   super(message);
  }
     @Override
     public String getMessage() {
         return "MyException: " + super.getMessage();
     }
 }
}
