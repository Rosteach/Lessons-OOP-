package hw4;

public class SomeClass {
	    private int someValue;
	    public SomeClass[] masElem;
	    public static void main(String[] args){

	        SomeClass elementMass=new SomeClass();//������ ������� ���������.
	        elementMass.masElem=new SomeClass[0];//�������������� ������ ���������.
	        SomeClass element1=new SomeClass();//����� �������.
	        element1.someValue=1;//����������� ������� �������� ��������.
	        elementMass.addNewElem(element1);//��������� ����� ������� � ������.
	        System.out.println(elementMass.masElem.length);//��������� ���������� ��������� � �������.
	        SomeClass element2=new SomeClass();//������ �������.
	        element2.someValue=2;//����������� ������� �������� ��������.
	        elementMass.addNewElem(element2);//��������� ����� ������� � ������.
	        System.out.println(elementMass.masElem.length);//��������� ���������� ��������� � �������.
	        SomeClass element3=new SomeClass();//������ �������.
	        element3.someValue=3;//����������� �������� �������� ��������.
	        elementMass.addNewElem(element3);//��������� ����� ������� � ������.
	        System.out.println(elementMass.masElem.length);//��������� ���������� ��������� � �������.
	        System.out.println("-------------------------------------");
	        //������� ������ ������� �� �������
	        elementMass.removeElem(1);
	        System.out.println(elementMass.masElem.length);//��������� ���������� ��������� � �������.
	        System.out.println("-------------------------------------");
	        //��������� ���������� �� ������� ��������
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

