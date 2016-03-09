/*
 ****
 
public class Test1Exception {
 public static void main(String[] args) {
  int x = 10;
  //int y = 0;
  double y = 0;
  double res = x/y;
  System.out.println(res);
 }
}
***
public class Test2Exception {
 public static void main(String[] args) {
  int x = 10;
  //int y = 0;
  double y = 0;
  try{
  double res = x/y;
  System.out.println(res);
  } catch (Exception e){
   System.out.println("������ !!!!");
   System.out.println(e.getMessage());
   e.printStackTrace();
  }
 }
}
***
public class Test3Exception {
 public static void main(String[] args) {
  throw new ArithmeticException("��! ��! ��!");
 }
}
***
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test4Exception {
 public static void f() throws FileNotFoundException {
  FileReader fr = new FileReader("file1.txt");
 }
 public static void main(String[] args) {
  try {
   f();
  } catch (FileNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
 } 
}
***
public class Test5Exception {
 public static void main(String[] args) {
  int k = (int)(2*Math.random());
     try {
         int[] a = new int[2];
         a[0] = 22 / 2;
         a[1] = 33 / 3;
         a[2] = 33 / k;
     } catch (ArithmeticException ex) {
         System.out.println("������� �� 0!");
     } catch (ArrayIndexOutOfBoundsException ex) {
         System.out.println("����� �� ������� �������!");
     } catch (Exception ex) {
         System.out.println("����� ������!");
     }
 }
}
**
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
*/