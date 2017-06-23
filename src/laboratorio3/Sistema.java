package laboratorio3;

import java.util.HashMap;

public class Sistema {

	private HashMap<String, Aluno> mapaMatriculaDeAlunos = new HashMap<>();

	private HashMap<String, Grupos> listaDegrupos = new HashMap<>();

	public boolean adicionarAlunos(String matricula, String nome, String curso) {
		boolean saida = false;
		Object resultado = this.mapaMatriculaDeAlunos.put(matricula, new Aluno(nome,
				curso, matricula));
		if (resultado != null)
			return saida;
		else
			return saida = true;
	}

	public String consultarAluno(String matricula) {
		try {
			String tostringAluno = this.mapaMatriculaDeAlunos.get(matricula)
					.toString();

			return "Matrícula: " + matricula + System.lineSeparator()
					+ tostringAluno;

		} catch (NullPointerException e) {

			return "Matrícula: " + matricula + System.lineSeparator()
					+ "Aluno não cadastrado.";

		}

	}

	public HashMap<String, Aluno> getMapaMatriculaDeAlunos() {
		return mapaMatriculaDeAlunos;
	}

	public boolean adicionarGrupos(String nome) {
		boolean saida = false;
		Object resultado = this.listaDegrupos.put(nome, new Grupos(nome));
		if (resultado != null)
			return saida;
		else
			return saida = true;
	}
	
	public String alocarAlunoGrupo(String matricula, String nomeGrupo) {
		
		Grupos grupo = this.listaDegrupos.get(nomeGrupo);
		
		Aluno aluno = this.mapaMatriculaDeAlunos.get(matricula);
		
		return "";
		
	}

	
}
