package ch.oester.robin.eth;

public class Payment {

  private User from;
  private double amount;
  private User[] toUsers;

  public Payment(User from, double amount, User... toUsers) {
    this.from = from;
    this.amount = amount;
    this.toUsers = toUsers;
  }

  public double getPerPerson() {
    if(toUsers == null || toUsers.length == 0) {
      return 0.0;
    }
    return amount / toUsers.length;
  }

  public User getFrom() {
    return from;
  }

  public User[] getToUsers() {
    return toUsers;
  }
}
