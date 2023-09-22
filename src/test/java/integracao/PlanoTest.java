package integracao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlanoTest {

  private Plano plano = new Plano();

  @Test
  public void verificaPlanoPremium() {
    plano.setPremium(true);

    assertEquals(true, plano.isPremium());
  }
}
