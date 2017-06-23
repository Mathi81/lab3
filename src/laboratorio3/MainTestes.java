package laboratorio3;

public class MainTestes {

	public static void main(String[] args) {
		Sistema a = new Sistema();
		String  b = a.adicionarAlunos("222", "thiago", "cc");
		String  c = a.adicionarAlunos("111", "thiago", "cc");
		String  d = a.adicionarAlunos("222", "thiago", "cc");
		String  e = a.adicionarAlunos("111", "thiago", "cc");
		
		String x = a.adicionarGrupos("lista");
		String y = a.alocarAlunoGrupo("222", "lista");
		String z = a.alocarAlunoGrupo("222", "lista");
		String h = a.alocarAlunoGrupo("111", "lista");
		String j = a.alocarAlunoGrupo("111", "lista");
		
		String f = a.imprimirGrupo("lista");
		
		System.out.println(f);
		
		System.out.println(a.imprimirAlunosQueRespondemQuestoes());

	}

}
