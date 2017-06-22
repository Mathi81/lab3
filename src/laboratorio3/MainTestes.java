package laboratorio3;

public class MainTestes {

	public static void main(String[] args) {
		Sistema a = new Sistema();
		boolean  b = a.adicionarAlunos("222", "thiago", "cc");
		boolean  c = a.adicionarAlunos("111", "thiago", "cc");
		boolean  d = a.adicionarAlunos("222", "thiago", "cc");
		boolean  e = a.adicionarAlunos("111", "thiago", "cc");
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println(a.consultarAluno("222"));

	}

}
