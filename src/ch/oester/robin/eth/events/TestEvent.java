package ch.oester.robin.eth.events;

import ch.oester.robin.eth.Payment;
import ch.oester.robin.eth.User;

public class TestEvent implements Event {

  private final User tester1;
  private final User tester2;
  private final User tester3;

  public TestEvent() {
    tester1 = new User("Tester 1");
    tester2 = new User("Tester 2");
    tester3 = new User("Tester 3");
  }

  @Override
  public User[] getParticipants() {
    return new User[] { tester1, tester2, tester3 };
  }

  @Override
  public Payment[] getData() {
    return new Payment[] {
        new Payment(tester2, 15, tester1),
        new Payment(tester3, 10, tester2)
    };
  }
}
