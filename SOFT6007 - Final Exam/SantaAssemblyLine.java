
public class SantaAssemblyLine {

  

  public static void main(String[] args) {

    Interface santaInterface = new Interface();
    Assembly santaAssembly = new Assembly();
    int menuOption = 0;

    santaAssembly.initializeAssembly();

    while (menuOption != 5) {
      
      santaInterface.printMenu();
      menuOption = santaInterface.readOption();
      
      switch (menuOption)
      {
      case(1):
        // 1. Add toy to the assembly line
        if (santaAssembly.getToyNumber() < santaAssembly.NUMBER_ITEMS_ASSEMBLY) {
          String toy   = santaInterface.requestString("Enter toy name: ");
          String child = santaInterface.requestString("Enter child's name: ");
          santaAssembly.insertToy(toy, child);
          santaInterface.display("Toy added to assembly line. Line has now " + santaAssembly.getToyNumber() + " toys.");
        } else {
          santaInterface.display("Unable to add more toys. Assembly line is full.");
        }
      break;
      case(2):
        // 2. Show all toys in the assembly line.
        santaAssembly.showToys();
        break;
      case(3):
        // 3. Search a toy.
        santaAssembly.searchToy(santaInterface.requestString("Enter child name to search: "));
        break;
      case(4):
        // 4. Clear assembly line.
        santaAssembly.clear();
        santaInterface.display("Assembly line cleared.");
        break;
      case(5):
        // 5. Exit.
        santaInterface.display("Bye!");
        break;
      default:
        break;
      }
    }
  }
}