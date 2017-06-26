package Teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import laboratorio3.Sistema;

public class SistemaTest {

	Sistema sistema = new Sistema();

	@Before
	public void setup() {

		for (int i = 0; i < 20; i++) {
			sistema.adicionarAlunos("" + i, "thiago: " + i, "Curso: " + i);
		}

		for (int y = 0; y < 10; y++) {
			sistema.adicionarGrupos("Grupo: " + y);

		}

		for (int i = 0; i < 10; i++) {
			sistema.alocarAlunoGrupo("" + i, "Grupo: 7");

		}
		for (int i = 1; i < 4; i++) {
			sistema.adicionarAlunoQuestao("" + i);

		}

	}

	@Test
	public void testAdicionarAlunos() {

		assertEquals("CADASTRO REALIZADO!", sistema.adicionarAlunos("22", "thiago", "informatica"));
		assertEquals("MATRÍCULA JÁ CADASTRADA!", sistema.adicionarAlunos("1", "thiago 1", "Curso: 1"));
		assertEquals("MATRÍCULA JÁ CADASTRADA!", sistema.adicionarAlunos("19", "thiago 1", "Curso: 1"));
		assertEquals("CADASTRO REALIZADO!", sistema.adicionarAlunos("20", "thiago", "informatica"));
	}

	@Test
	public void testConsultarAluno() {
		assertEquals("Aluno: 10 - thiago: 10 - Curso: 10", sistema.consultarAluno("10"));
		assertEquals("Aluno não cadastrado.", sistema.consultarAluno("20"));
		assertEquals("Aluno não cadastrado.", sistema.consultarAluno("100"));
	}

	@Test
	public void testAdicionarGrupos() {
		assertEquals("GRUPO JÁ CADASTRADO!", sistema.adicionarGrupos("Grupo: 5"));
		assertEquals("GRUPO JÁ CADASTRADO!", sistema.adicionarGrupos("Grupo: 9"));
		assertEquals("CADASTRO REALIZADO!", sistema.adicionarGrupos("Grupo: 10"));
		assertEquals("CADASTRO REALIZADO!", sistema.adicionarGrupos("Grupo: 100"));
	}

	@Test
	public void testAlocarAlunoGrupo() {
		assertEquals("ALUNO ALOCADO!", sistema.alocarAlunoGrupo("5", "Grupo: 5"));
		assertEquals("Grupo não cadastrado.", sistema.alocarAlunoGrupo("5", "Grupo: 20"));
		assertEquals("Aluno não cadastrado.", sistema.alocarAlunoGrupo("100", "Grupo: 6"));
		assertEquals("Grupo e aluno não cadastrado.", sistema.alocarAlunoGrupo("100", "Grupo: 20"));
	}

	@Test
	public void testImprimirGrupo() {
		assertEquals("Alunos do grupo Listas:" + System.lineSeparator() + "* Aluno: 1 - thiago: 1 - Curso: 1"
				+ System.lineSeparator() + "* Aluno: 2 - thiago: 2 - Curso: 2" + System.lineSeparator()
				+ "* Aluno: 3 - thiago: 3 - Curso: 3" + System.lineSeparator() + "* Aluno: 4 - thiago: 4 - Curso: 4"
				+ System.lineSeparator() + "* Aluno: 5 - thiago: 5 - Curso: 5" + System.lineSeparator()
				+ "* Aluno: 6 - thiago: 6 - Curso: 6" + System.lineSeparator() + "* Aluno: 7 - thiago: 7 - Curso: 7"
				+ System.lineSeparator() + "* Aluno: 8 - thiago: 8 - Curso: 8" + System.lineSeparator()
				+ "* Aluno: 9 - thiago: 9 - Curso: 9" + System.lineSeparator() + "* Aluno: 0 - thiago: 0 - Curso: 0"
				+ System.lineSeparator(), sistema.imprimirGrupo("Grupo: 7"));
	}

	@Test
	public void testAdicionarAlunoQuestao() {
		assertEquals("ALUNO REGISTRADO!", sistema.adicionarAlunoQuestao("1"));
		assertEquals("Aluno não cadastrado.", sistema.adicionarAlunoQuestao("200"));
	}

	@Test
	public void testImprimirAlunosQueRespondemQuestoes() {
		assertEquals(
				"Alunos:" + System.lineSeparator() + "1. Aluno: 1 - thiago: 1 - Curso: 1" + System.lineSeparator()
						+ "2. Aluno: 2 - thiago: 2 - Curso: 2" + System.lineSeparator()
						+ "3. Aluno: 3 - thiago: 3 - Curso: 3" + System.lineSeparator(),
				sistema.imprimirAlunosQueRespondemQuestoes());
	}

}
