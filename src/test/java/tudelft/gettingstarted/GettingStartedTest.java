package tudelft.gettingstarted;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        Assertions.assertEquals(25,result);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-5);
        Assertions.assertEquals(0,result);
    }
}
