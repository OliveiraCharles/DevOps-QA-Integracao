package integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CursoTest {

  Curso curso;

  @Test
  public void testCalcularAprovacao_ReprovacaoFrequencia() {
    curso = new Curso("Test");
    curso.setFrequencia(74);
    assertEquals(false, curso.calcularAprovacao());
  }

  @Test
  public void testCalcularAprovacao_ReprovacaoNota() {
    curso = new Curso("Test");
    curso.setFrequencia(75);
    curso.setNota1(29);
    curso.setNota2(30);
    assertEquals(false, curso.calcularAprovacao());
  }

  @Test
  public void testAprovacao_AprovacaoNota() {
    curso = new Curso("Test");
    curso.setFrequencia(75);
    curso.setNota1(70);
    curso.setNota2(70);
    assertEquals(true, curso.calcularAprovacao());
  }

  @Test
  public void testAprovacao_AprovacaoFinal() {
    curso = new Curso("Test");
    curso.setFrequencia(75);
    curso.setNota1(30);
    curso.setNota2(30);
    curso.setNotaFinal(70);
    assertEquals(true, curso.calcularAprovacao());
  }

  @Test
  public void testCalcularAprovacao_ReprovacaoFinal() {
    curso = new Curso("Test");
    curso.setFrequencia(75);
    curso.setNota1(30);
    curso.setNota2(30);
    curso.setNotaFinal(69);
    assertEquals(false, curso.calcularAprovacao());
  }

  @Test
  public void testGetNome() {
    curso = new Curso("Test");
    assertEquals("Test", curso.getNome());
  }
}
