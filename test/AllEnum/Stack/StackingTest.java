package AllEnum.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackingTest {
    Stacking stacking;
    @BeforeEach void startWith(){
        stacking = new Stacking();
    }
    @Test public void objectOfClassIsNotEmpty(){
        assertNotNull(stacking);
    }
    @Test public void stackIsEmptyByDefault(){
        assertTrue(stacking.isEmpty());
    }
    @Test public void stackIsNotEmptyWhenSomethingIsPush(){
        stacking.push(2);
        assertFalse(stacking.isEmpty());
    }
    @Test public void numberInAStackCanBeGottenAfterWhenPushed(){
        stacking.push(2);
        assertEquals(1, stacking.getNumberOfElementsInTheStack());
    }
    @Test public void numberInAStackShouldBeTwiceItDefaultStateWhenPushed(){
        stacking.push(1);
        stacking.push(4);
        assertEquals(2, stacking.getNumberOfElementsInTheStack());
    }
    @Test public void elementInTheStackCanBeGottenAfterPushing(){
        stacking.push(2);
        assertEquals(2, stacking.getPushedElement());
    }
    @Test public void elementsInTheStackCanBeGottenAfterPushing(){
        stacking.push(5);
        assertEquals(5, stacking.getPushedElement());
    }
    @Test public void elementCanB(){
        stacking.push(2);
        stacking.push(99);

    }
}
