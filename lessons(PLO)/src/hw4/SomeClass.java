package hw4;

public class SomeClass {
	    private int someValue;
	    public SomeClass[] masElem;
	    public static void main(String[] args){

	        SomeClass elementMass=new SomeClass();//объект массива элементов.
	        elementMass.masElem=new SomeClass[0];//инициализируем массив элементов.
	        SomeClass element1=new SomeClass();//новый элемент.
	        element1.someValue=1;//присваиваем первому элементу значение.
	        elementMass.addNewElem(element1);//добавляем новый элемент в массив.
	        System.out.println(elementMass.masElem.length);//проверяем количество элементов в массиве.
	        SomeClass element2=new SomeClass();//второй элемент.
	        element2.someValue=2;//присваиваем второму элементу значение.
	        elementMass.addNewElem(element2);//добавляем новый элемент в массив.
	        System.out.println(elementMass.masElem.length);//проверяем количество элементов в массиве.
	        SomeClass element3=new SomeClass();//третий элемент.
	        element3.someValue=3;//присваиваем третьему элементу значение.
	        elementMass.addNewElem(element3);//добавляем новый элемент в массив.
	        System.out.println(elementMass.masElem.length);//проверяем количество элементов в массиве.
	        System.out.println("-------------------------------------");
	        //удаляем второй елемент из массива
	        elementMass.removeElem(1);
	        System.out.println(elementMass.masElem.length);//проверяем количество элементов в массиве.
	        System.out.println("-------------------------------------");
	        //проверяем правильный ли элемент удалился
	        System.out.println(elementMass.masElem[0].someValue);
	        System.out.println(elementMass.masElem[1].someValue);
	    }
	    public void addNewElem(SomeClass novElem){
	        SomeClass[] el1=new SomeClass[masElem.length+1];    
	        for(int i=0;i<masElem.length;i++){
	            el1[i]=masElem[i];
	        }
	        el1[masElem.length]=novElem;
	        masElem=el1;
	    }

	    public void removeElem(int n){
	        int newI=0;
	        SomeClass[] el2=new SomeClass[masElem.length-1];
	        for(int i=0;i<masElem.length;i++){          
	            if(i!=n){
	                el2[newI]=masElem[i];
	                newI++;
	            }
	        }
	        masElem=el2;
	    }
	}

