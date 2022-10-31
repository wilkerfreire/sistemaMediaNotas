package cursojava.classes;

public class Disciplina {

	private String nomeDisciplina;
	private double nota1;
	private double nota2;
	
	public Disciplina() {
	}
	
	public Disciplina(String nomeDisciplina, double nota1, double nota2) {
		this.nomeDisciplina = nomeDisciplina;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double mediaNotas() {
		return (nota1 + nota2) / 2;
	}
	
	public String toString() {
		return "Média de " + nomeDisciplina + " : " + String.format("%.2f%n", mediaNotas());
	}
}
