package laboratorio3;

import java.util.Scanner;

public class MainTestes {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Sistema sistema = new Sistema();
		
		boolean execucao = true;
		
		while (execucao) {

			System.out.println("(C)adastrar Aluno" + System.lineSeparator() + "(E)xibir Aluno" + System.lineSeparator()
					+ "(N)ovo Grupo" + System.lineSeparator() + "(A)locar Aluno no Grupo e Imprimir Grupos"
					+ System.lineSeparator() + "(R)egistrar Resposta de Aluno" + System.lineSeparator()
					+ "(I)mprimir Alunos que Responderam" + System.lineSeparator() + "(O)ra, vamos fechar o programa!" + System.lineSeparator());
					
			System.out.print("Opções> ");
			String opcoes = ler.nextLine();
			
			if (opcoes.equals("C")) {
				System.out.print("Matricula: ");
				String matricula = ler.next();
				
				
				System.out.print("Nome: ");
				String nome = ler.nextLine();
				
				System.out.println("Curso: ");
				String curso = ler.nextLine();
				
				String saidaMatricula = sistema.adicionarAlunos(matricula, nome, curso);
				
				System.out.println(saidaMatricula);
				
				
			} else if (opcoes.equals("E")) {
				
				System.out.print("Matricula");
				String numeroMatricula = ler.nextLine();
				System.out.println();
				
				String saidaConsultaAluno = sistema.consultarAluno(numeroMatricula);
				System.out.println(saidaConsultaAluno);
			
			} else if (opcoes.equals("A")) {
				
			}
		}
		
		

	}

}
