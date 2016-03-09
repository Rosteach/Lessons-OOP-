package week2_lesson1_08_04_15;

public class MainCar {
   // static Car car1,car2;
	public static void main(String[]args){
		Car car1 = new Car();
		Car car2 = new Car();
			car1.setColor("Black");
			car2.setColor("Red");
				car1.setMarka("Mazda");
				car2.setMarka("Mers");
					car1.printAboutMe();
					car2.printAboutMe();
    }
}
