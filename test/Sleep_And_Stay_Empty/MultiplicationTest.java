package Sleep_And_Stay_Empty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MultiplicationTest {
    @Test public void function_Can_MultiplyTwo_Numbers_WithItBuiltIn_Methods(){
        int product = Multiplication.productOfTwoNumbers(2,2);
        assertEquals(4,product);
    }
    @Test public void function_Can_MultiplyTwo_Numbers_WithItBuiltIn_Method(){
        int product = Multiplication.productOfTwoNumbers(2,-7);
        assertEquals(-14,product);
    }
    @Test public void function_Can_Multiply_Negative_Values(){
        int product = Multiplication.productOfTwoNumbers(-2, -5);
        assertEquals(10, product);
    }
}
