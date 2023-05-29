package AllEnum.Stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackAgainTest {
    StackAgain myStack;
    @BeforeEach
    void setUp() {
        myStack = new StackAgain(5);
    }
    @Test
    public void objectIsNotEmpty(){
        assertNotNull(myStack);
    }
    @Test public void stackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }
    @Test public void stackISNotEmptyWhenPushed(){
        myStack.push("Stack 1");
        assertFalse(myStack.isEmpty());
    }
    @Test public void stackIsNotEmptyWhen_PushedTwiceAnd_PoppedOnce(){
        myStack.push("Stack 1");
        myStack.push("Stack 1");
        myStack.pop();
        assertFalse(myStack.isEmpty());
    }
    @Test public void stackIsEmpty_WhenPushedOnce_AndPoppedOnce(){
        myStack.push("Stack 1");
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test public void stackElementCanBeGottenWhenPushedOnce(){
        myStack.push("Stack 1");
        assertFalse(myStack.isEmpty());
        assertEquals("Stack 1", myStack.pop());
    }
    @Test public void stackPushedTwiceXY_PoppedOnceY_ExpectedX(){
        myStack.push("stack1");
        myStack.push("element");
        myStack.pop();
        assertEquals("stack1", myStack.pop());
    }
    @Test public void stackPushedX_PoppedX_PushedY(){
        myStack.push("Stack1");
        myStack.pop();
        myStack.push("dele");
        assertFalse(myStack.isEmpty());
        assertEquals("dele", myStack.pop());
    }
}