package Chapter04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
 * route between two nodes.
 */
public class Problem01 {

  //enum State {Visited, Unvisited, Visiting};

  public boolean routeBetweenNodes(Graph g, Node start, Node end) {
    if (start == end) return true;

    Queue<Node> nodes = new LinkedList<>();
    for (Node n : g.nodes) {
      n.state = State.Unvisited;
    }

    start.state = State.Visiting;
    nodes.add(start);

    while (!nodes.isEmpty()) {
      Node currNode = nodes.remove();
      currNode.state = State.Visiting;
      if (currNode != null) {
        for (Node n : currNode.children) {
          if (n.state != State.Visited) {
            if (n == end) {
              return true;
            } else {
              n.state = State.Visiting;
              nodes.add(n);
            }
          }
        }
        currNode.state = State.Visited;
      }
    }
    return false;
  }

}
