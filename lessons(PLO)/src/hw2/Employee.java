/*Написать класс фирма (hw2.Firm), содержащий имя, адрес, зарплатный счет (сумма), сотрудников.
У каждого сотрудника (hw2.Employee) есть имя, фамилия, ставка зарплаты (сумма),
его личный карточный счет (сумма), год поступления на работу, месяц поступления на работу, пол, отдел.
Класс фирма должен выполнять следующие функции:
- Вывести всех сотрудников фирмы на экран (метод void printAllEmployees())
- Выдать всем сотрудникам зарплату (перевести на карточный счет каждого сотрудника,
сумму равную зарплате сотрудника, с главного счета фирмы) (метод void giveSalaryForAll())
- Пересчитать всем сотрудникам дни отпуска (всем кто проработал больше 6 месяцев,
по 2 дня за каждый отработанный месяц) (метод void calcVocations())*/

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

