package entities;

public class BankAccount {
	private static final double RATE = 5.00; 
	private int number;
	private String name;
	private double balance = 0;

	public BankAccount(int number, String name) {
		this.number = number;
		this.name = name;
		this.deposit(0);
	}
	
	public BankAccount(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.deposit(balance);
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void deposit(double value) {
		this.balance = this.balance + value;
	}
	
	public void withdraw(double value) {
		this.balance = this.balance - (value + RATE); 
	}
	
	@Override
	public String toString() {
		return "Dados da conta - Número: " + this.getNumber() + "; " + 
				"Títular: " + this.getName() + "; " +
				"Saldo: R$ " + String.format("%.2f", this.getBalance());
	}
}
