package laboratorio3;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema {

	private HashMap<String, Aluno> mapaMatriculaDeAlunos = new HashMap<>();

	private HashSet<Grupos> listaDeGrupos = new HashSet<>();

	public boolean adicionarAlunos(String matricula, String nome, String curso) {
		boolean saida = false;
		Object resultado = mapaMatriculaDeAlunos.put(matricula, new Aluno(nome,
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

	public void setMapaMatriculaDeAlunos(
			HashMap<String, Aluno> mapaMatriculaDeAlunos) {
		this.mapaMatriculaDeAlunos = mapaMatriculaDeAlunos;
	}

	
}
