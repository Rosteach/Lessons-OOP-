/*Создать класс Самолет на основе класса Крыло.
 Классы Plane и Wing.
 Самолет должен уметь:
 - Взлетать (это возможно если в обоих крыльях достаточно топлива для взлета, которое тратится при взлете, метод void takeoff())
 - Задавать маршрут (маршрут состоит из последовательности координат, метод void selectRoute(int[][] coordinates))
 - Вывести на экран маршрут, метод void printRoute()*/

package hw3_Plane;

public class Plane {
	private int [][] coordinates = new int [3][3];
	public Plane(){}
	public void takeoff(){
		Wing left = new Wing(1);
		Wing right = new Wing(1);
		if((left.getFuel()<=0)|(right.getFuel()<=0))
		System.out.println("One of the tanks is empty, plane can,t blast off!!");
		else System.out.println("The tanks has fuel , so plane blast off!!");
	}
	public void selectRoute(int[][] coordinates){
		this.coordinates=coordinates;
		int element = 0;
		for(int i=0;i<=coordinates.length;i++){
			for(int j=0;j<=coordinates[i].length;j++){
				 coordinates [i][j] = element++;
			}
		}
	}
	public void printRoute(){	
	}
}
