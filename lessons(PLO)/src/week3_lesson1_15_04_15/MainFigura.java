package week3_lesson1_15_04_15;
//import java.util.Scanner;
public class MainFigura {
	public static void main(String[] args){	
		Triangle T = new Triangle(2,3,4,5);
		System.out.println("Square of Triangle=["+T.getSquare()+"] ; "+"Perimetr of Triangle=["+T.getPerimetr()+"]");
		Circle C = new Circle(2,3,4,5);
		System.out.println("Square of Circle=["+C.getSquare()+"] ; "+"Perimetr of Circle=["+C.getPerimetr()+"]");
		Square S = new Square(2,3,4);
		System.out.println("Square of Square=["+S.getSquare()+"] ; "+"Perimetr of Sqaure=["+S.getPerimetr()+"]");
		Rectangle R = new Rectangle(2,3,4,5);
		System.out.println("Square of Rectangle=["+R.getSquare()+"] ; "+"Perimetr of Rectangle=["+R.getPerimetr()+"]");
	}
}
