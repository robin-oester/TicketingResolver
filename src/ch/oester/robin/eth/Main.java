package ch.oester.robin.eth;

import ch.oester.robin.eth.events.Event;
import ch.oester.robin.eth.events.TeneroCamp;

public class Main {

  public static void main(String[] args) {
    Event event = new TeneroCamp();

    Graph g = new Graph(event.getParticipants());
    g.addEdges(event.getData());
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
