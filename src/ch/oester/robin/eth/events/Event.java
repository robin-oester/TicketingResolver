package ch.oester.robin.eth.events;

import ch.oester.robin.eth.Payment;
import ch.oester.robin.eth.User;

public interface Event {
  User[] getParticipants();
  Payment[] getData();
}
