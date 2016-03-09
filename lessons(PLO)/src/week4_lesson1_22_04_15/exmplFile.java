package week4_lesson1_22_04_15;
import java.io.File;
import java.util.Arrays;

public class exmplFile {
 public static void main(String[] args) throws Exception {
  File f = new File("D:/ros/Book");
  
  File[] files = f.listFiles();
  
  System.out.println(Arrays.toString(files));
  System.out.println("/"+f.getCanonicalPath());
  System.out.println(f.getParent());
  System.out.println(f.getAbsoluteFile());
  System.out.println(File.separatorChar);
  if(f.isDirectory()) System.out.println("Это директория");
  if(!f.exists()) f.createNewFile();
 }
}