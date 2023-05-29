package chichi.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ListImplementationTest {
    ListImplementation listImplementation;
    @BeforeEach public void setUp(){
        listImplementation = new ListImplementation(5);
    }
    @Test public void checkThat_ObjectOf_ExistingClass_Exist(){
        assertNotNull(listImplementation);
    }
    @Test public void listIsEmpty(){
        assertTrue(listImplementation.isEmpty());
    }
    @Test public void listIs_NotEmpty_WhenAddedToIt(){
        String[] nameArray = {"ope", "Dele"};
        listImplementation.add(nameArray);
        assertFalse(listImplementation.isEmpty());
    }
    @Test public void getSizeOfListWhenPushedOnce(){
        String[] nameArray = {"ope", "Dele"};
        listImplementation.add(nameArray);
        assertFalse(listImplementation.isEmpty());
        assertEquals(1, listImplementation.size());
    }
    @Test public void getAnotherSizeOFListWhenElementAddedTwice(){
        String[] nameArray = {"ope", "Dele"};
        String[] nameArray1 = {"ope", "Dele"};
        listImplementation.add(nameArray);
        listImplementation.add(nameArray1);
        assertFalse(listImplementation.isEmpty());
        assertEquals(2, listImplementation.size());
    }
//    @Test public void elementOfAListCanBeGottenAfterAddingToIt(){
//        String[] nameArray = {"ope", "Dele"};
//        listImplementation.add(nameArray);
//        assertFalse(listImplementation.isEmpty());
//        assertEquals("[nameArray]", listImplementation.get(1));
//    }
    @Test public void listIsEmptyWhenClearIsUsedOnIt(){
        String[] nameArray = {"ope", "Dele"};;
        listImplementation.add(nameArray);
        assertFalse(listImplementation.isEmpty());
        listImplementation.clear();
        assertTrue(listImplementation.isEmpty());
    }
    @Test public void listSizeCanChangeWhenInvokeRemoveMethod(){
        String[] nameArray = {"ope", "Dele"};;
        listImplementation.add(nameArray);
        assertFalse(listImplementation.isEmpty());
        listImplementation.clear();
        assertTrue(listImplementation.isEmpty());
    }
}
