package integracao;

public class Main {

  public static void main(String[] args) {
    Aluno aluno = new Aluno();

    Curso curso01 = new Curso("Teste I");
    Curso curso02 = new Curso("Teste II");

    aluno.adquireCurso(curso01);
    aluno.adquireCurso(curso02);

    curso01.setNota1(100);
    curso01.setNota2(60);
    curso01.setNotaFinal(50);
    curso01.setFrequencia(100);

    aluno.showCursos();
  }
}
