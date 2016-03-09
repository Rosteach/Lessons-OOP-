package week6_lesson1_06_05_15;
import java.util.Comparator;
public class priceSortProduct implements Comparator<Product>{
	 @Override
	 public int compare(Product pr1, Product pr2) {
	  //return (int)(pr1.getPrice() - pr2.getPrice());
	  return  (int)(100*pr1.getPrice()) - (int)(100*pr2.getPrice());
	 } 
}
