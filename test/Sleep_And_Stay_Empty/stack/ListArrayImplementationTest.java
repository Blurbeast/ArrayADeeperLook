package Sleep_And_Stay_Empty.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListArrayImplementationTest {
    ListArrayImplementation listArrayImplementation;
    @BeforeEach
    void setUp() {
        listArrayImplementation = new ListArrayImplementation(5);
    }
    @Test public void objectOfClassExist(){
        assertNotNull(listArrayImplementation);
    }
    @Test public void listOfElementsIsEmpty(){
        assertTrue(listArrayImplementation.isEmpty());
    }
    @Test public void listOfElementsIsNotEmptyWhenAnElementISAdded(){
        listArrayImplementation.add(0, "OOP");
        assertFalse(listArrayImplementation.isEmpty());
    }
    @Test public void elementCanBeAddedTheListWithoutTheIndexAndListNotEmpty(){
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
    }
    @Test public void sizeOFElementIncreaseAfterAdding(){
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(1, listArrayImplementation.size());
    }
    @Test public void sizeIncreaseMoreThanOneAfterAddingTwice(){
        listArrayImplementation.add("Ope");
        listArrayImplementation.add(0, "OOP");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(2, listArrayImplementation.size());
    }
    @Test public void sizeOfListDecreasesWhenRemovedFromTheLIst(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.remove(0);
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(0, listArrayImplementation.size());
    }
    @Test public void sizeOfListDecreasesWhenRemoveFromTheListWithTheElement(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add(0, "Tayo");
        listArrayImplementation.remove("Tayo");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(1, listArrayImplementation.size());
    }
    @Test public void elementInTheListCanBeObtained(){
        listArrayImplementation.add(0, "OOP");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals("OOP", listArrayImplementation.get(0));
    }
    @Test public void elementInTheListCanBeObtainedFromElements(){
        listArrayImplementation.add(0, "Tayo");
        listArrayImplementation.add(1, "OOP");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals("Tayo", listArrayImplementation.get(0));
    }
    @Test public void elementInTheListCanBeGottenAgain(){
        listArrayImplementation.add(1, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals("Dele", listArrayImplementation.get(1));
    }
    @Test public void elementInTheListCanBeUpdated(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        listArrayImplementation.set(1, "Samuel");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals("Samuel", listArrayImplementation.get(1));
    }
    @Test public void getElementsInTheListAfterRemoving(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        listArrayImplementation.remove(1);
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals("[OOP, Ope, null, null]", Arrays.toString(listArrayImplementation.getListElement()));
    }
    @Test public void getElementsInTheListAfterRemovingWithIndexTest(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        listArrayImplementation.remove(0);
        assertFalse(listArrayImplementation.isEmpty());
        String[] array = listArrayImplementation.getListElement();
        assertEquals("[Dele, Ope, null, null]", Arrays.toString(array));
    }
    @Test public void getElementsInTheListAfterRemovingWithElementTest(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        listArrayImplementation.remove("Dele");
        assertFalse(listArrayImplementation.isEmpty());
        String[] array = listArrayImplementation.getListElement();
        assertEquals("[OOP, Ope, null, null]", Arrays.toString(array));
    }
    @Test public void indexOfAnElementCanBeGottenInAList(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(1, listArrayImplementation.indexOf("Dele"));
    }
    @Test public void indexOfAnElementCanBeGottenInAListTest(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertEquals(0, listArrayImplementation.indexOf("OOP"));
    }
    @Test public void aListCanBeCheckedIfItContainsAnElement(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertTrue(listArrayImplementation.contains("OOP"));
    }
    @Test public void aListCanBeCheckedIfItContainsAnElementTest(){
        listArrayImplementation.add(0, "OOP");
        listArrayImplementation.add("Dele");
        listArrayImplementation.add("Ope");
        assertFalse(listArrayImplementation.isEmpty());
        assertFalse(listArrayImplementation.contains("Tayo"));
    }
}