package workout;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class ArmStrongTest {
    @Test
    public void checkIfItIsAnArmStrong(){
        assertTrue(ArmStrong.testArmstrong(3));
    }
    @Test
    public void checkIfItIsAnArmStrong_again(){
        assertFalse(ArmStrong.testArmstrong(125));
    }
}
