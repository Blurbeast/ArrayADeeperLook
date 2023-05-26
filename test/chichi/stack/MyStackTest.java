package chichi.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    MyStack myStack;
    @BeforeEach void startWith(){
        myStack = new MyStack(5);
    }
    @Test public void check_That_Object_Of_A_Class_Exist(){
        assertNotNull(myStack);
    }
    @Test public void check_That_Stack_Is_Empty(){
        assertTrue(myStack.isEmpty());
    }
    @Test public void check_That_Stack_Is_Not_Empty_When_Push(){
        myStack.push("Ede");
        assertFalse(myStack.isEmpty());
    }
    @Test public void check_That_It_Empty_When_Nothing_Was_Pushed(){
        assertTrue(myStack.isEmpty());
    }
    @Test public void stackIsNot_Empty_When_Pushed_And_Popped(){
        myStack.push("Ade");
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }
    @Test public void stack_Can_ShowElement(){
        myStack.push("Ede");
        assertEquals("Ede", myStack.pop());
    }
    @Test public void pushXY_PopY_Can_ShowElement(){
        myStack.push("Ope");
        myStack.pop();
        myStack.push("Epe");
        assertEquals("Epe",myStack.pop());
    }
    @Test public void pushXY_PopY_Can_ShowElement_Test(){
        myStack.push("Ope");
        myStack.push("Epe");
        String stack = myStack.pop();
        assertEquals("Epe",stack);
    }
}