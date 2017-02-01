public class WaterTankController {

  public final int MAX_VOLUME = 10000;
  private int volume = 0;
  
  public WaterTankController(int l) {
    volume = l;
  }
  
  public boolean addWater(int n) {
    if ((volume+n) < MAX_VOLUME) {
      volume += n;
      return true; // Added correctly.
    } else {
      return false; // Couldn't add over the limit.
    }
  }
  
  public boolean removeWater(int n) {
    if ((volume-n) >= 0) {
      volume -= n;
      return true; // Water removed correctly.
    } else {
      return false; // Couldn't remove, not enough water.
    }
  }
  
  public int checkWater() {
    return volume;
  } 
}
