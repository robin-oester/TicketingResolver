package ch.oester.robin.eth;

public class Main {

  public static void main(String[] args) {
    User elia = new User("Elia");
    User robin = new User("Robin");
    User rafael = new User("Rafael");
    User willy = new User("Willy");

    Payment[] payments = new Payment[] {
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

    Graph g = new Graph(elia, robin, rafael, willy);
    g.addEdges(payments);
    System.out.println("Running Ticket Resolver");
    System.out.println("-------------------------");
    System.out.println("At the beginning we have:");
    g.printDepts();
    System.out.println("-------------------------");
    g.resolve();
    System.out.println("After resolving we get:");
    g.printDepts();
    System.out.println("-------------------------");
  }
}
