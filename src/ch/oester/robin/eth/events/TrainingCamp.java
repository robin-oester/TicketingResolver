package ch.oester.robin.eth.events;

import ch.oester.robin.eth.Payment;
import ch.oester.robin.eth.User;

public class TrainingCamp implements Event {

  private User elia;
  private User robin;
  private User rafael;
  private User willy;

  public TrainingCamp() {
    elia = new User("Elia");
    robin = new User("Robin");
    rafael = new User("Rafael");
    willy = new User("Willy");
  }

  @Override
  public User[] getParticipants() {
    return new User[] { elia, robin, rafael, willy };
  }

  @Override
  public Payment[] getData() {
    return new Payment[] {
        new Payment(rafael, 23.9, elia, robin, rafael),
        new Payment(willy, 106.1, elia, robin, rafael, willy),
        new Payment(willy, 6.3, willy),
        new Payment(robin, 5.4, elia, robin, rafael, willy),
        new Payment(robin, 2.4, robin),
        new Payment(elia, 18.3, elia, robin, rafael, willy),
        new Payment(willy, 65.95, elia, robin, rafael, willy),
        new Payment(rafael, 45.2, elia, robin, rafael, willy),
        new Payment(robin, 172.3, elia, robin, rafael, willy),
        new Payment(rafael, 56.15, elia, robin, rafael),
        new Payment(willy, 18.85, elia, robin, rafael, willy),
        new Payment(willy, 22.1, willy),
        new Payment(willy, 81.85, elia, robin, rafael, willy),
        new Payment(willy, 17.45, rafael),
        new Payment(willy, 29.95, willy),
        new Payment(robin, 29.1, elia, robin, rafael, willy),
        new Payment(rafael, 15, willy),
        new Payment(rafael, 10, elia),
        new Payment(willy, 6, robin),
        new Payment(willy, 150, elia, robin, willy),
        new Payment(rafael, 1751.1, elia, robin, rafael, willy),
        new Payment(rafael, 50, elia, robin, willy),
        new Payment(rafael, 415, elia, robin, rafael, willy),
        new Payment(elia, 38, willy),
        new Payment(elia, 88, rafael)
    };
  }
}
