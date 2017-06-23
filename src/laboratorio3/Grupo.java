package laboratorio3;

import java.util.HashSet;

public class Grupo {

	private String nome;

	private HashSet<Aluno> listaDeAlunos = new HashSet<>();

	public Grupo(String nome) {
		
		this.nome = nome;
	}

	public boolean adicionarAlunos(Aluno aluno) {

		this.listaDeAlunos.add(aluno);
		return true;

	}

	public String getNome() {
		return nome;
	}

	public HashSet<Aluno> getListaDeAlunos() {
		return listaDeAlunos;
	}
	
	

}
