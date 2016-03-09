/*Написать собственную реализацию динамического массива MyArrayList,
содержащего целые числа. Реализовать следующие методы:
Добавление элемента в конец списка, void add(int value)
Получение элемента по индексу, int get(int index)
Замена элемента, boolean set(int index, int value)
Вставка элемента, boolean add(int index, int value)
Поиск элемента, int indexOf(int value)
Получение размера списка, int size()
Удаление элемента по индексу, int remove(int index)*/

package hw4;
public class MyArrayList{
	private int size;
	private int [] mass= new int [10];
	
	public MyArrayList(){
		this.size=0;
	}
	public void add(int value)
	{	
		mass[size++] = value;
	}
	public int get(int index){
		if(index>=size) {
			System.out.print("Index out of Bounds"); return -1;
		}
		else
		return mass[index];
	}
	public boolean set(int index, int value){
		if(index>=size) {
			return false;
		}
		else{	
			mass[index]=value;
			return true;
		}
	}
	public boolean add(int index, int value){
		if(index>size||index<0) {
			return false;
		}
		else{
			for(int i = size; i > index; i--){
				mass[i]=mass[i-1];
			}
			mass[index]=value;
			size++;
			return true;
		}	
	}
	public int indexOf(int value){
		//System.out.println("Zhopa"); return 15;
		for(int i = 0; i<size;i++){
			if(mass[i]==value){
				return i;
			}	
		}	
		return -1;
	}
	public int size(){
		return size;
	}
	public int remove(int index){
		//index--;
		if(index>size||index<0)
		{
			return -1;
		}
		else{
			int rem = mass[index];
			for(int i = index ; i < size; i++){
				mass[i]=mass[i+1];
			}
			size--;
			return rem;
		}
	}
	public void printMyArray(){
		for(int i=0; i<size; i++)
		{
			//System.out.println();
			System.out.print(mass[i]+" ");
		}
		System.out.println(" ["+size+"]");   
		
	}
}

