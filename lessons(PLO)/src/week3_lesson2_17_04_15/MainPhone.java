/*�������� ����� ���������.
 Phone(String number, boolean camera, int sideSize)
 Nokia, Samsung
 IPhone(int appleId),IPhone4, IPhone5
 ��� ����� ������:
  - call(Phone ph)
  - printModel()
  - printAppleId()// ��� �������
 MainPhone(������ ���������)
�������� ���� ��������� � �������� ������� ���� � ������.(Nokia, Samsung, IPhone4, IPhone5)
� ������� ������� 2 (�������)������ �������� � ������� ������ call  � ������ ����� �� ������.
��� ���� ��������� �� ������ ������� ����� printModel.
����� ��� ���� ���������, ��� ������� �������� ������� ����� printAppleId.*/

package week3_lesson2_17_04_15;
import java.util.ArrayList;
public class MainPhone {
	public static void main(String[] args){
	ArrayList<Phone> phones = new ArrayList<>();
	  phones.add(new Nokia("35"));
	  phones.add(new Nokia("36"));
	  //phones.add(new iPhone("37",12));
	  //phones.add(new iPhone("38",13));  
	  phones.add(new iPhone4("39",14));
	  phones.add(new iPhone4("40",15));  
	  phones.add(new iPhone5("41",16));
	  phones.add(new iPhone5("42",17));
	  phones.add(new Samsung("43"));
	  
	  int k1 = 1;
	  int k2 = 4;
	  phones.get(k1).call( phones.get(k2));
	  
	  System.out.println("\n������ ������� ���������:");
	  for( Phone phs:phones) phs.printModel();
	  System.out.println("\n������ ����:");
	  
	  for( Phone phs:phones) {
	   if(phs instanceof iPhone){
	    iPhone iphone = (iPhone)(phs);
	    iphone.printAppleId();
	   }
	  }
	 }
}
