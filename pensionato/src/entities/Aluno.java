package entities;

public class Aluno {
	private String nome;
	private String email;
	
	public Aluno(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return this.getNome() + ", " + this.getEmail();
	}
}