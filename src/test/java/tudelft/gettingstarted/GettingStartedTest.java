package tudelft.gettingstarted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25, result);
    }

   @Test
   public void addFiveToZero() {
       int result = new GettingStarted().addFive(0);
       Assertions.assertEquals(5, result);
   }

   @Test
   public void addFiveToMinus20() {
       int result = new GettingStarted().addFive(-20);
       Assertions.assertEquals(-15, result);
   }

   @Test
   public void addFiveToOneThousand() {
       int result = new GettingStarted().addFive(1000);
       Assertions.assertEquals(1005, result);
   }

   @Test
   public void addFiveToAsciiValueA() {
       int result = new GettingStarted().addFive('A');  // ASCII: A = 65
       Assertions.assertEquals(70, result);
   }
}
