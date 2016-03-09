/*�������� ����� ����� (hw2.Firm), ���������� ���, �����, ���������� ���� (�����), �����������.
� ������� ���������� (hw2.Employee) ���� ���, �������, ������ �������� (�����),
��� ������ ��������� ���� (�����), ��� ����������� �� ������, ����� ����������� �� ������, ���, �����.
����� ����� ������ ��������� ��������� �������:
- ������� ���� ����������� ����� �� ����� (����� void printAllEmployees())
- ������ ���� ����������� �������� (��������� �� ��������� ���� ������� ����������,
����� ������ �������� ����������, � �������� ����� �����) (����� void giveSalaryForAll())
- ����������� ���� ����������� ��� ������� (���� ��� ���������� ������ 6 �������,
�� 2 ��� �� ������ ������������ �����) (����� void calcVocations())*/

package hw2;

public class Firm {
	static Employee emp1;
	private String nameFirm;
	private String adressFirm;
	private double salaryAccountFirm;
	private int[] DATE = new int[]{2015,4}; 
	public Employee [] employeesFirm = new Employee[3];
	
	public Firm(String nF,String aF,double sAF){
		this.nameFirm=nF;
		this.adressFirm=aF;
		this.salaryAccountFirm=sAF;
		employeesFirm[0] = new Employee("Mike","Simmons",1,10000,1997,07,"male","carpenter"); 
		for(int i = 1; i<employeesFirm.length;i++){
			employeesFirm[i]=new Employee();
		}	
	} 
	public void printAllEmployees(){
		for(int i=0;i<employeesFirm.length;i++){
			employeesFirm[i].printEmp();
		}			
	}
	public void printAllEmployeesFinance(){
		for(int i=0;i<employeesFirm.length;i++){
			employeesFirm[i].printEmpFinance();
		}
	}
	public void giveSalaryForAll(){
		for(int i=0;i<employeesFirm.length;i++){
			this.salaryAccountFirm -= employeesFirm[i].WRGet(); 
			employeesFirm[i].pCAccSet(employeesFirm[i].pCAccGet()+employeesFirm[i].WRGet());
		}
	}
	public void calcVacations(){
		int MonthEnd = (DATE[0]*12+DATE[1]);
		for(int i=0;i<employeesFirm.length;i++){
			int MonthStart	=((employeesFirm[i].getDate())[0]*12+((employeesFirm[i].getDate())[1]));
			if(MonthEnd-MonthStart>6){
			System.out.println("Vacation is: " + (MonthEnd-MonthStart)*2+" days");
			} else {System.out.println("No vacation");}
		}
	}
	public static void main(String[] args){
		Employee E1 = new Employee("Mike","Simmons",3000,1111133333,1997,7,"male","carpenter");
		E1.printEmp();
		//Employee E2 = new Employee();
		//E2.printEmp();
		Firm firm1 = new Firm("Star","Drag44",10000000);
		firm1.printAllEmployeesFinance();
		firm1.giveSalaryForAll();
		firm1.printAllEmployeesFinance();
	}
}


