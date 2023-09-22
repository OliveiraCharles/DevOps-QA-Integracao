package integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AlunoTest {

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

  @Test
  public void testeQuantidadeCursos() {
    Aluno aluno = new Aluno();

    Curso curso01 = new Curso("Teste I");
    Curso curso02 = new Curso("Teste II");

    aluno.adquireCurso(curso01);
    aluno.adquireCurso(curso02);

    assertEquals(aluno.getCursos().size(), 2);
  }
}
