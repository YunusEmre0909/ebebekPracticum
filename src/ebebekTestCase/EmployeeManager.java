package ebebekTestCase;


public class EmployeeManager {
	
	Employee employee;
	
	
	public EmployeeManager(Employee employee) {
		
		this.employee = employee;
	}
	
	public int tax() {
		
		if(employee.getSalary()>1000) {
			int vergi=employee.getSalary()*3/100;
			return vergi;
		}else {
			return 0;
		}
		
	}
	public int bonus() {
		if(employee.getWorkHours()>40) {
			int extraHours=employee.getWorkHours()-40;
			return extraHours*30;
		}else {
			return 0;
		}
		
	}
	public int riseSalary() {

		int netSalary =employee.getSalary()-tax()+bonus();
		int workingYear=2021-employee.getHireYear();
		
		if(workingYear<10) {
			return netSalary*5/100;
		}else if(workingYear>9 && workingYear<20) {
			return netSalary*10/100;
		}else if(workingYear>19) {
			return netSalary*15/100;
		}else {
			return 0;
		}
		
		
	}
	public int salaryWithTaxesAndBonuses() {
		return employee.getSalary()+bonus()-tax();
	}
	public int totalSalary() {
		return employee.getSalary()+bonus()+riseSalary();
	}
	public String toString() {
		System.out.println("Adı : "+employee.getName());
		System.out.println("Maaşı : "+employee.getSalary());
		System.out.println("Çalışma Saati : "+employee.getWorkHours());
		System.out.println("Başlangıç Yılı : "+employee.getHireYear());
		return "";
	}

}
