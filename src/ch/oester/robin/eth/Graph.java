package ch.oester.robin.eth;

public class Graph {

  private User[] users;
  private double[][] matrix;

  public Graph(User... users) {
    this.users = users;
    this.matrix = new double[users.length][users.length];
  }

  public void addEdges(Payment... payments) {
    for(Payment p : payments) {
      User from = p.getFrom();
      double value = p.getPerPerson();
      for(User to : p.getToUsers()) {
        if(from != to) {
          matrix[getUserIndex(to)][getUserIndex(from)] += value;
        }
      }
    }
  }

  public void resolve() {
    int[] path;
    while((path = findPathOfLengthTwo()) != null) {
      int u1 = path[0];
      int u2 = path[1];
      int u3 = path[2];
      double val1 = matrix[u1][u2];
      double val2 = matrix[u2][u3];
      if(val1 < val2) {
        matrix[u1][u3] += val1;
        matrix[u2][u3] -= val1;
        matrix[u1][u2] = 0;
      } else {
        matrix[u1][u2] -= val2;
        matrix[u1][u3] += val2;
        matrix[u2][u3] = 0;
      }
      matrix[u1][u1] = 0;
      matrix[u2][u2] = 0;
      matrix[u3][u3] = 0;
    }
  }

  public void printDepts() {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix.length; j++) {
        if(matrix[i][j] != 0) {
          double val = matrix[i][j];
          double printVal = Math.round(val * 20) / 20.0;
          System.out.println(getUser(i).getName() + " owes " + getUser(j).getName() + " exactly " + printVal + ".-");
        }
      }
    }
  }

  public int[] findPathOfLengthTwo() {
    for(int i = 0; i < matrix.length; i++) {
      for(int j = 0; j < matrix.length; j++) {
        for (int k = 0; k < matrix.length; k++) {
          if (matrix[i][j] != 0 && matrix[j][k] != 0) {
            return new int[]{i, j, k};
          }
        }
      }
    }
    return null;
  }

  private int getUserIndex(User u) {
    for(int i = 0; i < users.length; i++) {
      if(users[i] == u) {
        return i;
      }
    }
    throw new IllegalArgumentException("User with name " + u.getName() + " is not registered");
  }

  private User getUser(int index) {
    if(index < 0 || index >= users.length) {
      throw new IndexOutOfBoundsException("User index is out of bounds");
    }
    return users[index];
  }
}
