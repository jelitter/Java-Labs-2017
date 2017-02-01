import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class AssemblyTest {

  Assembly testAssembly = new Assembly();
  
  
  @Test
  public void tests() {
    Random rng = new Random();
    
    // Number of toys in assembly line must be less than maximum allowed.
    assert(testAssembly.getToyNumber() < testAssembly.NUMBER_ITEMS_ASSEMBLY);
    
    // After initialization no item in assembly line must be non-empty.
    testAssembly.initializeAssembly();
    Assert.assertEquals(true, testAssembly.assembly[rng.nextInt(testAssembly.NUMBER_ITEMS_ASSEMBLY)].getName().equals(""));
  }
}
