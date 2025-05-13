package bsf;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
  private int vertices;
  private LinkedList<Integer>[] adj; // Adjacency list representation

  public BreadthFirstSearch(int vertices) {
    this.vertices = vertices;
    adj = new LinkedList[vertices];

    for (int i=0; i<vertices; i++)
      adj[i] = new LinkedList<>();
  }

  // Add an edge to the graph
  public void addEdge(int v, int w) {
    adj[v].add(w);
    adj[w].add(v);
  }

  // Breadth-First Search traversal from a given source node 'source'
  public void searchByBreadthFirst(int source) {
    boolean[] visited = new boolean[this.vertices];
    Arrays.fill(visited, false);

    Queue<Integer> queue = new LinkedList<>();

    visited[source] = true;
    queue.offer(source);

    // Get all adjacent vertices of the dequeued vertex
    // If a neighbor has not been visited, then mark it as visited and enqueue it
    while (!queue.isEmpty()) {
      int current_node = queue.poll();
      System.out.print(current_node + " -> ");

      for (int neighbor : adj[current_node]) {
        if (!visited[neighbor]) {
          visited[neighbor] = true;
          queue.offer(neighbor);
        }
      }

    }

    System.out.println();
  }

}
