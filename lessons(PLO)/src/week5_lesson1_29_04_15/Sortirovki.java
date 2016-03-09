package week5_lesson1_29_04_15;

import java.util.Arrays;

public class Sortirovki {
	//public int [] mass = new int [50];
	
	public static void buble(int [] arr){
		System.out.print("Sortirovka buble : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}				
			}
			System.out.print(arr[i]+",");
		}	
	}
	
	public static void viborom(int[] arr){
		int min=0;
		System.out.print("Sortirovka viborom : ");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j])
					min = arr[i];
				else min = arr[j];
			}
			System.out.print(arr[i]+",");
		}
	}

	public static void vstavka(int[] arr){
		System.out.print("Sortirovka vstavka : ");
		for(int i = 0; i < arr.length; i++){
			int currElem = arr[i];
		    int j = i - 1;
		    while(j > 0 && arr[j] > currElem){
		    	arr[j+1] = arr[j];
		        arr[j] = currElem;
		                j--;
		    }
		System.out.print(arr[i]+",");
		}
	}
	public static void printV(int []v)
	{
		System.out.print("[ ");
		for(int i=0; i<v.length; i++)
		{
			System.out.print(v[i]+" ");
		}
		System.out.print("]");
	}
	
	public void BinarniPoisk(){	
	}
	
	public static void main(String[] args){
		int [] mass = new int [5];
		for(int i=0;i<mass.length;i++){
			mass[i] = (int)(100 * Math.random());
			System.out.print(mass[i]+",");
		}
		System.out.println(" ");
		//System.out.println();
		//int [] arrTemp=Arrays.copyOf(mass, mass.length);
		
		printV(mass);
		int [] arrTemp=Arrays.copyOf(mass, mass.length);
		
		long t1 = System.nanoTime();
		buble(mass);
		long t2 = System.nanoTime();
		long diff1 = t2 - t1;
		System.out.println(" ");
		System.out.print(" /// Time of buble : " + diff1*Math.pow(10,-9));
		System.out.println(" ");

		printV(arrTemp);
		
		long t3 = System.nanoTime();
		viborom(arrTemp);
		long t4 = System.nanoTime();
		long diff2 = t4 - t3;
		System.out.println(" ");
		System.out.println(" /// Time of viborom : " + diff2*Math.pow(10,-9));
		

		printV(arrTemp);
		
		long t5 = System.nanoTime();
		vstavka(mass);
		long t6 = System.nanoTime();
		long diff3 = t6 - t5;
		System.out.println(" ");
		System.out.print(" /// Time of vstavka : " + diff3*Math.pow(10,-9));

		
		
	}
}
