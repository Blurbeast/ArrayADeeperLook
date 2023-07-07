package Arrayss;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class LearnMultiArrayTest {
    private LearnMultiArray learnMultiArray;
    @BeforeEach
    void setUp() {
        learnMultiArray = new LearnMultiArray();
    }
    @Test
    void objectExist(){assertNotNull(learnMultiArray);}
    @Test public void sizeOfArrayCanBeSetTest(){
        int[][] expected = {
                {0,0,0}
        };
        learnMultiArray.setLength(1,3);
        String actual = Arrays.deepToString(learnMultiArray.checkResult());
        assertEquals(Arrays.deepToString(expected),actual);
    }
    @Test public void sizeOfArrayCanBeSetAndAffirmedTest(){
        int[][] expected = {
                {0,0,0}, {0,0,0}
        };
        learnMultiArray.setLength(2,3);
        String actual = Arrays.deepToString(learnMultiArray.checkResult());
        assertEquals(Arrays.deepToString(expected),actual);
    }
    @Test public void arrayCanBePopulated(){
        int [][] actual = {{0,1,2},{0,1,2}};
        int[][] expected = {{0,1,2}, {0,1,2}};
        learnMultiArray.setLength(2,3);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.deepToString(learnMultiArray.checkResult());
        assertEquals(Arrays.deepToString(expected),actual1);
    }
    @Test public void arrayCanBePopulatedYetAgainTest(){
        int [][] actual = new int[2][4];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        int[][] expected = {{0,1,2,3}, {0,1,2,3}};
        learnMultiArray.setLength(2,3);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.deepToString(learnMultiArray.checkResult());
        assertEquals(Arrays.deepToString(expected),actual1);
    }
    @Test public void sumOfEachRowCanBeGottenTest(){
        int [][] actual = new int[1][4];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        int[] expected = {6};
        learnMultiArray.setLength(actual.length,4);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkRowsResult());
        assertEquals(Arrays.toString(expected),actual1);
    }
    @Test public void sumOfEachRowCanBeGottenTestAgain(){
        int [][] actual = new int[2][4];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        int[] expected = {6,6};
        learnMultiArray.setLength(actual.length,4);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkRowsResult());
        assertEquals(Arrays.toString(expected),actual1);
    }
    @Test public void averageOfRowCanBeGottenTest(){
        int [][] actual = new int[1][4];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        double[] expected = {1.5};
        learnMultiArray.setLength(actual.length,4);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkRowResultAverage());
        assertEquals(Arrays.toString(expected),actual1);
    }
    @Test public void averageOfRowCanBeGottenAgainTest(){
        int [][] actual = new int[3][7];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        double[] expected = {3, 3, 3};
        learnMultiArray.setLength(actual.length,4);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkRowResultAverage());
        assertEquals(Arrays.toString(expected),actual1);
    }
    @Test public void sumOfColumnCanBeGottenTest(){
        int [][] actual = new int[2][1];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        int[] expected = {1};
        learnMultiArray.setLength(actual.length,1);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkColumnResult());
        assertEquals(Arrays.toString(expected),actual1);
    }
    @Test public void sumOfColumnCanBeGottenAgainTest(){
        int [][] actual = new int[2][4];
        for (int index = 0; index < actual.length; index++) {
            for (int indexx = 0; indexx <actual[index].length; indexx++) {
                actual[index][indexx] = indexx;
            }
        }
        int[] expected = {0,2,4,6};
        learnMultiArray.setLength(actual.length,4);
        learnMultiArray.populateArray(actual);
        String actual1 = Arrays.toString(learnMultiArray.checkColumnResult());
        assertEquals(Arrays.toString(expected),actual1);
    }
}