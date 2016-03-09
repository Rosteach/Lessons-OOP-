/*Задача Телефон: 
 создать класс Phone с полями:
 static Phone[] numbers, String myNumber
 при создании нового объекта-телефона, он вносится в базу номеров numbers. 
 c методами: 
 - isNumberExist(String number) - проверяет наличие телефона в базе
 - call(String number) - выводит на экран "телефон такой-то звонит такому-то"
 - sendSms(String number, String text) - выводит на экран сообщение и кому адрессовано
 
Ограничение в 10 телефонов.*/

package week2_lesson1_08_04_15;


public class Phone {
	private static Phone [] numbers = new Phone[10];
    private String myNumber;
    
    public Phone[] getNumbers(){
    	return numbers;
    }
    public void setNumbers(Phone[] numbers){
    	this.numbers=numbers;
    }
	
	public void isNumberExist(){
		
	}
	public void call(String number){
		
	}
	public void sendSms(String number,String text){
		
	}
}
