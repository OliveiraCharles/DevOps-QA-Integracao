package integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlanoTest {

  Aluno aluno;

  @Test
  public void testAlunoPlanoPremiumCom12CursosOuMais() {
    // Arrange
    aluno = new Aluno();

    // Act
    for (int i = 1; i <= 12; i++) {
      aluno.adquireCurso(new Curso("Teste"));
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
      aluno.adquireCurso(new Curso("Teste"));
    }

    // Assertion
    assertEquals(11, aluno.getCursos().size());
    assertEquals("Free", aluno.getPlano());
  }
}
