/*Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()*/

package hw3_Plane;

public class Wing {
	private int fuel;
	public int getFuel(){
		return fuel;	
	}
	public Wing(int fuel){
		this.fuel=fuel;
	}
}
