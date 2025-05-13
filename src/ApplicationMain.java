import bsf.BreadthFirstSearch;

public class ApplicationMain {
  
  public static void main(String[] args) {
    BreadthFirstSearch bfs = new BreadthFirstSearch(4);
    bfs.addEdge(0, 1);
    bfs.addEdge(0, 2);
    bfs.addEdge(1, 2);
    bfs.addEdge(2, 0);
    bfs.addEdge(2, 3);
    bfs.addEdge(3, 3);

    int source = 2;
    System.out.println("Breadth First Traversal starting from vertex " + source + ": ");
    bfs.searchByBreadthFirst(source);

  }

}