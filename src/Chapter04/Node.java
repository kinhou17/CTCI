package Chapter04;

enum State {Visited, Unvisited, Visiting};


public class Node {
  public String name;
  // public Integer value;
  public Node[] children;
  public State state;

}
