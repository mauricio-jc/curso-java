package entities;

public class Student {
	public String name;
	public double note1;
	public double note2;
	public double note3;
	public double average = 60;
	
	public double sumNotes() {
		return note1 + note2 + note3;
	}
	
	public double missing() {
		return this.average - this.sumNotes();
	}
	
	public String toString() {
		double calculate = this.sumNotes();
		
		if(calculate >= this.average) {
			return "Média final " + String.format("%.2f%n", calculate) + "Aprovado";
		}
		else {
			return "Média final " + String.format("%.2f%n", calculate) + "Reprovado\n" +
					"Faltou " + this.missing() + " pontos";
		}
	}
}
