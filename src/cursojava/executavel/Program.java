package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		Aluno aluno = new Aluno(nomeAluno);
		
		System.out.print("Digite o numero de disciplinas: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite o nome da disciplina " + (i+1) + ": ");
			sc.nextLine();
			String nomeDisciplina = sc.nextLine();
			System.out.print("Digite a primeira nota: ");
			double nota1 = sc.nextDouble();
			System.out.print("Digite a segunda nota: ");
			double nota2 = sc.nextDouble();
			
			Disciplina disciplina = new Disciplina(nomeDisciplina, nota1, nota2);
			aluno.getDisciplinas().add(disciplina);
			System.out.println();
		}
		
		System.out.println(aluno);
		
		for(Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.print(disciplina);
		}
		
		sc.close();
	}
}