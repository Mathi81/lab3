package laboratorio3;

public class Aluno {

	private String nome;

	private String curso;

	private String matricula;
	
	public Aluno(String nome, String curso, String matricula) {
		this.nome = nome;
		this.curso = curso;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Aluno: " + matricula + " - " + this.nome + " - " + this.curso;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public String getCurso() {
		return curso;
	}

	public String getMatricula() {
		return matricula;
	}

}
