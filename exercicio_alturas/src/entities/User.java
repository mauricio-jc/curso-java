package entities;

public class User {
	private String name;
	private int age;
	private double height;
	
	public User(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Dados da pessoa - Nome: " + this.getName() + "; " +
				"Idade: " + this.getAge() + "; " +
				"Altura: " + String.format("%.2f", this.getHeight());
	}
}
