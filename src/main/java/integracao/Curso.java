package integracao;

public class Curso {

  private int frequencia;
  private float nota1;
  private float nota2;
  private float notaFinal;

  private String nome;

  public String getNome() {
    return nome;
  }

  public Curso(String nome) {
    this.nome = nome;
    this.frequencia = 0;
    this.nota1 = 0;
    this.nota2 = 0;
    this.notaFinal = 0;
  }

  public float getNotaFinal() {
    return notaFinal;
  }

  public int getFrequencia() {
    return frequencia;
  }

  public void setFrequencia(int frequencia) {
    this.frequencia = frequencia;
  }

  public float getNota1() {
    return nota1;
  }

  public void setNota1(float nota1) {
    this.nota1 = nota1;
  }

  public float getNota2() {
    return nota2;
  }

  public void setNota2(float nota2) {
    this.nota2 = nota2;
  }

  public void setNotaFinal(float notaFinal) {
    this.notaFinal = notaFinal;
  }

  public boolean calcularAprovacao() {
    float media;
    if (getFrequencia() < 75) {
      return false;
    } else {
      media = (getNota1() + getNota2()) / 2;
      // System.out.println("Media: " + media);
      if (media < 30) {
        // System.out.println("Reprovado: Media < 30!" + media);
        return false;
      } else {
        if (media >= 70) {
          // System.out.println("Aprovado: Media >= 70!");
          return true;
        } else {
          if ((media + getNotaFinal()) / 2 >= 50) {
            // System.out.println("Aprovado: Media2 >= 50!");
            return true;
          } else {
            // System.out.println("Reprovado: Media2 < 50!");
            return false;
          }
        }
      }
    }
  }
}
