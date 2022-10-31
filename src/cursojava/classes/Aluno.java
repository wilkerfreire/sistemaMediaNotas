package cursojava.classes;

import java.util.List;
import java.util.ArrayList;

public class Aluno {
	
	private String nome;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void adicionarDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
	
	public void removerDisciplina(Disciplina disciplina) {
		disciplinas.remove(disciplina);
	}
	
	public String toString() {
		return "Nome do aluno: "
				+ nome + "\n"
				+ "Informações sobre as disciplinas: \n";
	}
	
}