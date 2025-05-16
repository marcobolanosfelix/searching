import java.util.List;

import bsf.BreadthFirstSearch;
import dto.Country;

public class ApplicationMain {
  
  public static void main(String[] args) {
    
    List<Country> countries = List.of( 
      new Country("Romans Dawn"),
      new Country("Alabasta"),
      new Country("Dressrosa"),
      new Country("Drum")
     );

    BreadthFirstSearch bfs = new BreadthFirstSearch(countries.size());

    bfs.addEdge(countries.get(0), countries.get(1));
    bfs.addEdge(countries.get(0), countries.get(2));
    bfs.addEdge(countries.get(1), countries.get(2));
    bfs.addEdge(countries.get(2), countries.get(3));
    bfs.addEdge(countries.get(3), countries.get(3));

    System.out.println("Breadth First Traversal starting from " + countries.get(2).getName() + ": ");
    bfs.searchByBreadthFirst(countries.get(2));

  }

}