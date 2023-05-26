package chichi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static chichi.DoubleArray.doubleArray;
import static org.junit.jupiter.api.Assertions.*;

class DoubleArrayTest {
    DoubleArray arrayS;
    @BeforeEach
    void setUp() {
        arrayS = new DoubleArray();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(arrayS);
    }
    @Test public void methodCanReturnDoubleSize(){
        int [] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 2;

        assertEquals("[1, 2, 2, 0, 0, 0]", Arrays.toString(doubleArray(array)));
    }
}