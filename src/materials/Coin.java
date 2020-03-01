package materials;

import java.util.Random;

public class Coin {

  private CoinState coinState;

  /**
   * Change l'état de la pièce.
   * 50% de probabilité d'obtenir HEADS, 50% de probabilité d'obtenir TAILS
   */
  public void throwCoin() {
    // TODO : Votre code ici
    Random random = new Random();
    if(random.nextInt(2) == 0){
      coinState = CoinState.HEADS;
    } else {
      coinState = CoinState.TAILS;
    }
  }

  public CoinState getState() {
    return coinState;
  }


}
