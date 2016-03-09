package week2_lesson1_08_04_15;

public class Car {
	private String color;
	private String marka;
	private static int count;
	// Проводим инкапсуляцию(get,set методы) для доступных только
	//внутри класса (обозначение private) полей color & marka.
	public String getColor(){
		return color;
	}
		public String getMarka(){
			return marka;
		}
			public void setColor(String color){ 
				this.color = color;
			}
				public void setMarka(String marka){
					this.marka = marka;
				}
					public Car(){
					}
						/*public Car(String color,String marka){
							this.color=color;
							this.marka=marka;
							//or   this.color=color;
						}*/
							public void printAboutMe(){
								System.out.println("Color & Marka of Car: "+"["+color+"]"+" , "+"["+marka+"]");
							}
}

