
public class Assembly {
  
  public final int NUMBER_ITEMS_ASSEMBLY = 10;
  public Toy[] assembly = new Toy[NUMBER_ITEMS_ASSEMBLY];
  private int toyNumber = 0; // Represents number of toys in the assembly line.

  public void initializeAssembly() {
    // Creates a new toy in each assembly position with empty toy and child names.
    for (int i=0; i<assembly.length; i++) {
      assembly[i] = new Toy();
    }
  }

  public int insertToy(String name, String child) {
    assembly[toyNumber].setToy(name, child);
    return (++toyNumber);
  }
  
  public void showToys() {
    for (int i=0; i<assembly.length; i++) {
      // Only showing non-empty assembly positions.
      if (!assembly[i].getName().equals("")) {
        System.out.println(" " + assembly[i].getName() + " for " + assembly[i].getOwner());
      }
    }
  }
  
  public void searchToy(String child) {
    System.out.println("Searching for: " + child);
    for (int i=0; i<assembly.length; i++) {
      if (assembly[i].getOwner().equals(child)) {
        System.out.println(" " + child + " is getting a  " + assembly[i].getName());
        return;
      }
    }
    System.out.println(" " + child + " is not getting anything for now :(");
  }

  public int getToyNumber() {
    return toyNumber;
  }

  public void clear() {
    for (int i=0; i<assembly.length; i++) {
      assembly[i].delete();
    }
    toyNumber = 0;
  }
}
