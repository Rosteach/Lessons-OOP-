package week5_lesson2_30_04_15;

public class Test {
	 public static <T> void swap (T[] a, int x, int y) {
	        T t = a[x];
	        a[x] = a[y];
	        a[y] = t;
	    }
	 public static void main(String[] args) {
	     String[] a1 = new String[10];
	     Test.<String> swap (a1, 1, 2);
	     System.out.println(a1);
	     Integer[] a2 = new Integer[10];
	     Test.<Integer> swap (a2, 1, 2);
	     System.out.print(a2);
	 }
}

