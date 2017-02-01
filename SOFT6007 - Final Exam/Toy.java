
public class Toy {
  
  public Toy() {
    this.name = "";
    this.owner = "";
  }
  
  public void delete() {
    this.name = "";
    this.owner = "";
  }
  
  private String name="";     // Toy name
  private String owner="";    // Child who owns the toy.
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getOwner() {
    return owner;
  }
  public void setOwner(String owner) {
    this.owner = owner;
  }
  public void setToy(String name, String owner) {
    System.out.println("setToy called");
    this.name = name;
    this.owner = owner;   
  }
}
