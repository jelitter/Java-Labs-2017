public class WaterTank {

  private static final int INITIAL_VOLUME = 5000;

  public static void main(String[] args) {

    int option = -1;
    int litres = 0;

    WaterTankView myView = new WaterTankView();
    WaterTankController myController = new WaterTankController(INITIAL_VOLUME);


    while (option != 4) {

      myView.printMenu();
      option = myView.readOption(); 

      switch (option) {
        case (1):
          litres = myView.addWater();
          if (myController.addWater(litres)) {
            myView.print(litres + " litres added to Tank"); 
          } else {
            myView.print("Couldn't add "+ litres + " litres, tank would overfill.");
          }
        break;

        case (2):
          litres = myView.removeWater();
          if (myController.removeWater(litres)) {
            myView.print(litres + " litres removed from Tank"); 
          } else {
            myView.print("Couldn't remove "+ litres + " litres, not enough water.");
          }
        break;

        case (3):
          litres = myController.checkWater();
          myView.print("There are " + litres + " litres in the tank");
        break;

        case (4):
          myView.exitApp();
        break;

        default:
        break;
      }
    }
  }
}
