package integracao;

import java.util.ArrayList;

public class Aluno {

  private Plano plano = new Plano();
  private ArrayList<Curso> cursos = new ArrayList<Curso>();

  public void adquireCurso(Curso curso) {
    this.cursos.add(curso);

    if (this.getCursos().size() > 11) {
      plano.setPremium(true);
    }
  }

  public String getPlano() {
    if (plano.isPremium()) {
      return "Premium";
    }

    return "Free";
  }

  public ArrayList<Curso> getCursos() {
    return cursos;
  }

  public void showCursos() {
    for (Curso curso : cursos) {
      curso.show();
      System.out.println("");
    }
  }
}
