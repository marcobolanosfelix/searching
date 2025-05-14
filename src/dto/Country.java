package dto;

public class Country {
  private int id;
  private static int counter = 0;
  private String name;

  public Country(String name) {
    this.name = name;
    this.id = counter++;
  }

  public int getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

}
