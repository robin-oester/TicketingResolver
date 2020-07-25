package ch.oester.robin.eth;

public class User {
  private String name;

  public User(String name) {
    if(name == null) {
      throw new NullPointerException("Name should not be null");
    }
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
