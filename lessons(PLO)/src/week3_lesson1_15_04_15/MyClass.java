/*ѕровести исследование что запускаетс€ в какой последовательности.
¬ классе A:
 - конструктор по умолчанию
 - не статический блок инициализации
 - статический блок инициализации
¬ классе B extends A:
 - конструтор по умолчанию
 - не статический блок инициализации
 - статический блок инициализации
¬ классе MyClass:
 - создать 2 объекта класса ¬*/

package week3_lesson1_15_04_15;

public class MyClass {
	public static void main(String[] args){
	ClassB First = new ClassB();
	ClassB Second = new ClassB();
	System.out.println(First);
	System.out.println(Second);
	}
}
