package Bank;

import org.junit.jupiter.api.Test;

import static org.testng.Assert.*;

public class ArrayTTestTest {
    @Test public void duplicateNumbers(){
        int [] array = {2,2,2,5,5,6};
        assertEquals(3,ArrayTTest.duplicate(array));
    }
}