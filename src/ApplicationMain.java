import bsf.BreadthFirstSearch;
import dto.Country;

public class ApplicationMain {
  
  public static void main(String[] args) {
    
    Country country01 = new Country("Romans Dawn");
    Country country02 = new Country("Alabasta");
    Country country03 = new Country("Dressrosa");
    Country country04 = new Country("Drum");
    BreadthFirstSearch bfs = new BreadthFirstSearch(4);

    bfs.addEdge(country01, country02);
    bfs.addEdge(country01, country03);
    bfs.addEdge(country02, country03);
    bfs.addEdge(country03, country04);
    bfs.addEdge(country04, country04);

    System.out.println("Breadth First Traversal starting from " + country03.getName() + ": ");
    bfs.searchByBreadthFirst(country03);

  }

}