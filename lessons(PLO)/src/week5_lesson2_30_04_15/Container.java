package week5_lesson2_30_04_15;

public class Container<T> {
	private T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	public void print(){
		System.out.println("тип ="+value.getClass().getName());
	}	
}
