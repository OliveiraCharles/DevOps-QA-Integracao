package integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {
	
	Aluno aluno;


	@Test
	public void testCalcularAprovacao_ReprovacaoFrequencia(){

		aluno = new Aluno();
		aluno.setFrequencia(74);
		assertEquals(false, aluno.calcularAprovacao());
	}

	@Test
	public void testCalcularAprovacao_ReprovacaoNota() {
		aluno = new Aluno();
		aluno.setFrequencia(75);
		aluno.setNota1 (29);
		aluno.setNota2 (30);
		assertEquals(false, aluno.calcularAprovacao());
	}

	@Test
	public void testAprovacao_AprovacaoNota(){
		aluno = new Aluno();
		aluno.setFrequencia(75);
		aluno.setNota1 (70);
		aluno.setNota2 (70);
		assertEquals(true, aluno.calcularAprovacao());
	}

	@Test
	public void testAprovacao_AprovacaoFinal(){
		aluno = new Aluno();
		aluno.setFrequencia(75);
		aluno.setNota1 (30);
		aluno.setNota2 (30);
		aluno.setNotaFinal (70);
		assertEquals(true, aluno.calcularAprovacao());
	}

	@Test
	public void testCalcularAprovacao_ReprovacaoFinal(){
		aluno = new Aluno();
		aluno.setFrequencia(75);
		aluno.setNota1 (30);
		aluno.setNota2 (30);
		aluno.setNotaFinal (69);
		assertEquals(false, aluno.calcularAprovacao());


	}
	
	@Test
	public void testAlunoPlanoPremiumCom12CursosOuMais() {
		// Arrange
		aluno = new Aluno();
		
		// Act
		for (int i = 1; i <= 12; i++) {
			aluno.adquireCurso("Java " + i);
		}

		// Assertion	
		assertEquals(12, aluno.getCursos().size());
		assertEquals("Premium", aluno.getPlano());
	}
	

	@Test
	public void testAlunoPlanoFreeComMenosDe12Cursos() {
		// Arrange
		aluno = new Aluno();
		
		// Act
		for (int i = 1; i <= 11; i++) {
			aluno.adquireCurso("Java " + i);
		}
			
		// Assertion
		assertEquals(11, aluno.getCursos().size());
		assertEquals("Free", aluno.getPlano());
	}

}
