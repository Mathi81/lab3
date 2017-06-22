package laboratorio3;

import java.util.HashSet;

public class Grupos {

	private String nome;

	private HashSet<Aluno> listaDeAlunos = new HashSet<>();

	public void adicionarAlunos(String matricula) {

		Sistema listaAluno = new Sistema();

		Aluno aluno = listaAluno.getMapaMatriculaDeAlunos().get(matricula);

		this.listaDeAlunos.add(aluno);

	}

	public String getNome() {
		return nome;
	}

	public HashSet<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}
	
	

}
