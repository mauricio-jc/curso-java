package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary = this.grossSalary + (this.grossSalary * (percentage / 100)); 
	}
	
	public String toString() {
		return "Funcionário: " + this.name + 
				", Salário: R$ " + String.format("%.2f", this.netSalary());
	}
}
