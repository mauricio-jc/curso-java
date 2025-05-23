package entities;

public class Funcionario {
	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return this.id;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setSalario(double percentage) {
		double valorAumento = this.salario * (percentage / 100);
		this.salario = this.salario + valorAumento;
	}
	
	public double getSalario() {
		return this.salario;
	}

	@Override
	public String toString() {
		return this.getId() + ", " + this.getNome() + ", " + String.format("%.2f", this.getSalario());
	}
}
