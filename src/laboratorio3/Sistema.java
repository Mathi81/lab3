package laboratorio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

	private HashMap<String, Aluno> mapaMatriculaDeAlunos = new HashMap<>();

	private HashMap<String, Grupo> listaDegrupos = new HashMap<>();

	private ArrayList<Aluno> listaDeQuestoes = new ArrayList<>();
	
	
	public String adicionarAlunos(String matricula, String nome, String curso) {

		Object resultado = this.mapaMatriculaDeAlunos.put(matricula, new Aluno(nome, curso, matricula));
		if (resultado != null)
			return "MATRÍCULA JÁ CADASTRADA!";
		else
			return "CADASTRO REALIZADO!";
	}

	public String consultarAluno(String matricula) {
		try {
			String tostringAluno = this.mapaMatriculaDeAlunos.get(matricula).toString();

			return "Matrícula: " + matricula + System.lineSeparator() + tostringAluno;

		} catch (NullPointerException e) {

			return "Matrícula: " + matricula + System.lineSeparator() + "Aluno não cadastrado.";

		}

	}

	public String adicionarGrupos(String nome) {

		Object resultado = this.listaDegrupos.put(nome.toLowerCase(), new Grupo(nome));
		if (resultado != null)
			return "GRUPO JÁ CADASTRADO!";
		else
			return "CADASTRO REALIZADO!";
	}

	public String alocarAlunoGrupo(String matricula, String nomeGrupo) {

		Grupo grupo = this.listaDegrupos.get(nomeGrupo.toLowerCase());

		Aluno aluno = this.mapaMatriculaDeAlunos.get(matricula);

		if (grupo == null)
			return "Grupo não cadastrado.";
		else if (aluno == null)
			return "Aluno não cadastrado.";
		else {

			if (grupo.getListaDeAlunos().contains(aluno)) {
				return null;
			} else {
				grupo.adicionarAlunos(aluno);

				return "ALUNO ALOCADO!";

			}

		}

	}

	public String imprimirGrupo(String nomeGrupo) {

		String listaAlunos = "";

		Grupo grupo = this.listaDegrupos.get(nomeGrupo.toLowerCase());

		if (grupo == null)
			return "Grupo não cadastrado.";
		else {

			HashSet<Aluno> listaAlunosGrupo = grupo.getListaDeAlunos();

			for (Aluno aluno : listaAlunosGrupo) {
				listaAlunos += "* " + aluno.toString() + System.lineSeparator();
			}

			return "Alunos do grupo Listas:" + System.lineSeparator() + listaAlunos;
		}
	}

	public HashMap<String, Grupo> getListaDegrupos() {
		return listaDegrupos;
	}

	public HashMap<String, Aluno> getMapaMatriculaDeAlunos() {
		return mapaMatriculaDeAlunos;
	}

	public String adicionarAlunoQuestao(String matricula) {
		
		Aluno aluno = this.mapaMatriculaDeAlunos.get(matricula);
		
		if (aluno != null) {
			
			this.listaDeQuestoes.add(aluno);
			
			return "ALUNO REGISTRADO!";
		} else
			return "Aluno não cadastrado.";
			
		
	}
	
	public String imprimirAlunosQueRespondemQuestoes () {
		String alunos = "";
		int i = 0;
		for (Aluno aluno : this.listaDeQuestoes) {
			
			alunos += i++ + "." + aluno.toString() +System.lineSeparator();
			
		}
		return "Alunos:" + alunos;
	}
}
