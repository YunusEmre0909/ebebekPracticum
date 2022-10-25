package ebebekTestCase;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Employee employee=new Employee("Yunus Emre", 15000, 45, 2000);
		
		EmployeeManager employeeManager=new EmployeeManager(employee);
		
		employeeManager.toString();
		
		System.out.println("Vergi : "+employeeManager.tax()); 
		System.out.println("Bonus : "+employeeManager.bonus()); 
		System.out.println("Maaş Artışı : "+employeeManager.riseSalary());
		System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+employeeManager.salaryWithTaxesAndBonuses());
		System.out.println("Toplam Maaş : "+employeeManager.totalSalary());

	}

}
