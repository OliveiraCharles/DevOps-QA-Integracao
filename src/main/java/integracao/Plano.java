package integracao;

public class Plano {

  public Plano() {
    this.isPremium = false;
  }

  private boolean isPremium = false;

  public boolean isPremium() {
    return isPremium;
  }

  public void setPremium(boolean isPremium) {
    this.isPremium = isPremium;
  }
}
