package entities;

public class User {
	private String nome;
	private int idade;
	
	public User(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return this.nome;
	}

	public int getIdade() {
		return this.idade;
	}
	
	@Override
	public String toString() {
		return "Dados da pessoa - Nome: " + this.getNome() + "; " +
				"Idade: " + this.getIdade();
	}
}
