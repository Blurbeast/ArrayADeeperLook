package Arrayss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
class LearnArrayTest {
    private LearnArray learnArray;
    @BeforeEach
    void setUp() {
        learnArray = new LearnArray();
    }
    @Test void objectExist(){
        assertNotNull(learnArray);
    }
    @Test void arrayLengthCanBeGottenTest(){
        int[] expected = {0, 0};
        learnArray.assignSize(2);
        assertEquals(Arrays.toString(expected), Arrays.toString(learnArray.checkResult()));
//        int[] expected = {0, 1, 2, 3, 4};
//        assertEquals(expected, learnArray.check);
    }
    @Test void arraySizeCanBeChangedToAnyLengthTest(){
        int[] expected = {0,0,0,0,0};
        learnArray.assignSize(5);
        assertEquals(Arrays.toString(expected), Arrays.toString(learnArray.checkResult()));
    }
    @Test void arrayCanBePopulatedTest(){
        int[] actual = {0,1,2};
        int[] expected = {0,1,2};
        learnArray.assignSize(3);
        learnArray.populateArray(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(learnArray.checkResult()));
    }
    @Test void arrayCanBePopulatedInAnotherWayTest(){
        int[] actual = {0,2,4,6,8};
        int[] expected = {0,2,4,6,8};
        learnArray.assignSize(5);
        learnArray.populateArray(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(learnArray.checkResult()));
    }
    @Test void arrayCanBePopulatedTestA(){
        int[] actual = new int[10];
        for (int index = 0; index < actual.length; index+=3) {
            actual[index] = index;
        }
        int[] expected = new int[actual.length];
        for (int index = 0; index < actual.length; index+=3) {
            expected[index] = index;
        }
        learnArray.assignSize(actual.length);
        learnArray.populateArray(actual);
        assertEquals(Arrays.toString(expected), Arrays.toString(learnArray.checkResult()));
    }
    @Test void sumOfAllElementCanBeGottenTest(){
        int[] actual = {0,1,2};
        int expected =3;
        learnArray.assignSize(3);
        learnArray.populateArray(actual);
        assertEquals(expected, learnArray.sumOfArray());
    }
    @Test void sumOfAllElementsCanBegottenAgainTest(){
        int[] actual = {0,2,4,6};
        int expected = 12;
        learnArray.assignSize(actual.length);
        learnArray.populateArray(actual);
        assertEquals(expected, learnArray.sumOfArray());
    }
    @Test void averageOfAllElementsCanBeGottenTest(){
        int[] actual = {0,2,4,6};
        double expected = 3.0;
        learnArray.assignSize(actual.length);
        learnArray.populateArray(actual);
        assertEquals(expected, learnArray.getElementsAverage());
    }
    @Test void averageCanBeGottenYetAgainTest(){
        int[] actual = {0,2,4,6,8,10};
        double expected = 5.0;
        learnArray.assignSize(actual.length);
        learnArray.populateArray(actual);
        assertEquals(expected, learnArray.getElementsAverage());
    }
}