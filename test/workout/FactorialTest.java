package workout;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;
    @BeforeEach
    void setUp() {
        factorial = new Factorial();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(factorial);
    }
    @Test public void canGetFactorialOf4(){
        int factor = Factorial.getFactorial(4);
        assertEquals(24, factor);
    }
    @Test public void canGetFactorialOf3(){
        int factor = Factorial.getFactorial(3);
        assertEquals(6, factor);
        int factor1 = Factorial.getFactorial(5);
        assertEquals(120, factor1);
    }
}