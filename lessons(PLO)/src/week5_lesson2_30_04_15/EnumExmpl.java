package week5_lesson2_30_04_15;

public class EnumExmpl {
	 public static void main(String[] args) {
		  MyEnum obj = MyEnum.Red;
		  String s = obj.toString();
		  MyEnum obj1 = MyEnum.valueOf(s);
		  MyEnum[] vector = MyEnum.values();
		  MyEnum.myMethod();
		  
	} 
}
