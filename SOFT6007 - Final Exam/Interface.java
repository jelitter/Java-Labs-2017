import java.util.Scanner;

public class Interface {

  Scanner keyboard = new Scanner(System.in);
  int menuOption = 0;
  
  public void printMenu() {
    display("\n\n\n");
    display("Santa's Assembly Line.");
    display("---------------------");
    display("1. Add toy to the assembly line.");
    display("2. Show all toys in the assembly line.");
    display("3. Search a toy.");
    display("4. Clear assembly line.");
    display("5. Exit.");
    display("---------------------");
    display("Enter menu option (1-5): ");
  }
  
  public int readOption() {
    int ret = 0;
    ret = keyboard.nextInt();
    return ret;
  }

  public String requestString(String message) {
    String ret = "";
    this.display(message);
    ret = keyboard.next();
    return ret;
  }
  
  public void display(String message) {
    System.out.println(" " + message);
  }
}
