package bsf;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import dto.Country;

public class BreadthFirstSearch {
  private int vertices;
  private LinkedList<Country>[] adj; // Adjacency list representation

  public BreadthFirstSearch(int vertices) {
    this.vertices = vertices;
    adj = new LinkedList[vertices];

    for (int i=0; i<vertices; i++)
      adj[i] = new LinkedList<>();
  }

  // Add an edge to the graph
  public void addEdge(Country v, Country w) {
    adj[v.getId()].add(w);
    adj[w.getId()].add(v);
  }

  // Breadth-First Search traversal from a given source node 'source'
  public void searchByBreadthFirst(Country source) {
    boolean[] visited = new boolean[this.vertices];
    Arrays.fill(visited, false);

    Queue<Country> queue = new LinkedList<>();

    visited[source.getId()] = true;
    queue.offer(source);

    // Get all adjacent vertices of the dequeued vertex
    // If a neighbor has not been visited, then mark it as visited and enqueue it
    while (!queue.isEmpty()) {
      Country currentNode = queue.poll();
      System.out.print(currentNode.getId() + ".- " + currentNode.getName() + " -> ");

      for (Country neighbor : adj[currentNode.getId()]) {
        if (!visited[neighbor.getId()]) {
          visited[neighbor.getId()] = true;
          queue.offer(neighbor);
        }
      }

    }

    System.out.println();
  }

}
