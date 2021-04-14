package ch.oester.robin.eth.events;

import ch.oester.robin.eth.Payment;
import ch.oester.robin.eth.User;

public class TeneroCamp implements Event {

  private final User jannis;
  private final User loris;
  private final User martin;
  private final User robin;

  public TeneroCamp() {
    this.jannis = new User("Jannis");
    this.loris = new User("Loris");
    this.martin = new User("Martin");
    this.robin = new User("Robin");
  }

  @Override
  public User[] getParticipants() {
    return new User[]{jannis, loris, martin, robin};
  }

  @Override
  public Payment[] getData() {
    return new Payment[] {
        new Payment(loris, 320, robin), //Anteil Wohung Robin
        new Payment(loris, 240, martin), //Anteil Wohnung Martin
        new Payment(jannis, 102.45, getParticipants()), //Vor-Oster Einkauf
        new Payment(robin, 24.7, getParticipants()), //Ostereinkauf
        new Payment(loris, 164, jannis, loris, robin), //Grosseinkauf
        new Payment(loris, 40, martin), //Grosseinkauf Anteil Martin
        new Payment(robin, 49.65, loris, jannis, robin), //Letzter Einkauf
        new Payment(robin, 50, loris, jannis, robin), //Pizza
        new Payment(loris, 52, getParticipants()), //Kurtaxe 4 Nächte
        new Payment(loris, 39, loris, jannis, robin) //Kurtaxe 3 Nächte
    };
  }
}
