/* Написать метод, сортирующий массив сортировкой вставками.
 Вывести на экран пары индексов обмениваемых элементов
 public void sortInsertion(int[] vector)
 Пример:
 sortInsertion([3,1,2,3])
 0 1
 1 2*/

package hw5;
public class Vstavka {
	
	public static void sortInsertion(int[] vector){
		
		//System.out.print("sortInsertion : ");
		for(int i = 0; i < vector.length; i++){
			int curr = vector[i];
			boolean temp=false;
			int ji=0;
			for(int j=i-1;j>=0 && vector[j]>curr; j--){
				temp=true;
				vector[j+1]=vector[j];
				vector[j]=curr;
				ji=j;
			}
			
			if (temp)
			printChange(i,ji);
			
		}
		
		System.out.println("");
	}
	public static void printChange(int first, int second){
		//System.out.println(first+"="+second+"<-");
		for(int i = 0, out=first;i<first-second;i++){
			System.out.println(out+" "+--out);
		}
	}
	
	public static void printV(int []v)
	{
		System.out.print("[ ");
		for(int i=0; i<v.length; i++)
		{
			System.out.print(v[i]+" ");
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		int [] vect = new int[]{4,3,5,3,4,3};
		/*for(int i=0;i<vect.length;i++){
			vect[i] = (int)(100 * Math.random());
			System.out.print(vect[i]+",");
		}*/
		System.out.println("");
		sortInsertion(vect);
		
		printV(vect);
	}
}
