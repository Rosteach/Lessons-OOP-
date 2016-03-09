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
import java.util.Scanner;
class Employee {
	private String nameEmp,surNameEmp,sexEmp,departmentEmp;
	private double wageRateEmp,personalCardAccEmp;
	private int entryYearEmp,entryMonthEmp;
	public Employee(String nE,String sNE,double wRE,double pCAE,int eYE,int eME,String sE,String dE){
		this.nameEmp=nE;this.surNameEmp=sNE;this.wageRateEmp=wRE;this.personalCardAccEmp=pCAE;
		this.entryYearEmp=eYE;this.entryMonthEmp=eME;this.sexEmp=sE;this.departmentEmp=dE;
	}
	
	public Employee(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the next data:");
		System.out.print("   Name: ");
		nameEmp = scan.nextLine();  
		System.out.print("   Sirname: ");
		surNameEmp = scan.nextLine();
		System.out.print("   sex: ");
		sexEmp=scan.nextLine();
		System.out.print("   department: ");
		departmentEmp=scan.nextLine();
		System.out.print("   wageRate: ");
		wageRateEmp=scan.nextDouble();
		System.out.print("   personalCardAcc: ");
		personalCardAccEmp=scan.nextDouble();
		System.out.print("   entryYear: ");
		entryYearEmp=scan.nextInt();
		System.out.print("   entryMonth: ");
		entryMonthEmp=scan.nextInt();
	}
	public double WRGet(){
		return this.wageRateEmp;
	}
	public double pCAccGet(){
		return this.personalCardAccEmp;
	}
	public void pCAccSet(double newbalance){
		this.personalCardAccEmp = newbalance; 
	}
	public int[] getDate(){
		int [] getStartDate = new int[]{this.entryYearEmp, this.entryMonthEmp};
		return getStartDate;
	}
	
	public void printEmp(){
		System.out.println(nameEmp+" "+surNameEmp+", ("+sexEmp+"), "+departmentEmp+", "
		+ " Wage:"+wageRateEmp+", ["+personalCardAccEmp+"], From YY.MM:"+entryYearEmp+"."+entryMonthEmp);
	}
	public void printEmpFinance(){
		System.out.println(nameEmp+" "+surNameEmp+": "+personalCardAccEmp);		
	}
}

