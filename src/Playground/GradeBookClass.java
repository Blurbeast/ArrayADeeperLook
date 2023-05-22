package Playground;

import java.util.Arrays;

public class GradeBookClass {

    public void barChart(int [][] array){
        int [] frequency = new int[11];
        testHeader(array);
        //populating the array
        for (int[] ints : array){System.out.println(Arrays.toString(ints));for (int i : ints) {++frequency[i / 10];}}
        System.out.println();
        for (int index = 0; index < frequency.length; index++) {
            if (index==10)System.out.printf("%7d: ", index*10);
            else {System.out.printf("%02d - %02d: ", index*10, 9+index*10);}
            for (int stars = 0; stars < frequency[index]; stars++) {System.out.print("*");}
            System.out.println();
        }
    }
    private static void testHeader(int[][] array) {
        for (int index = 0; index< array[0].length; index++){System.out.printf("Test%d ", index+1);}
        System.out.println();
    }
    public void average(int [][] array){
        int total = 0;
        total = totalAverage(array, total);
        int average = total/ array.length;
        System.out.printf("%s%d", "Average is ", average);
    }
    private static int totalAverage(int[][] array, int total) {
        for (int [] arr: array){
            total = totalFromArray(total, arr);
        }
        return total;
    }
    private static int totalFromArray(int total, int[] arr) {
        for (int number : arr){total = total + number;}
        return total;
    }

    public void minimumNumber(int [][] array){
        int minimumNumber = array[0][0];
        for (int[] minNumber: array) {for (int mini: minNumber) {if (mini < minimumNumber) minimumNumber = mini;}}
        System.out.printf("%s%d", "Minimum number in the grade is ", minimumNumber);
    }
    public void maximumNumber(int [][] array){
        int maxNumber = array[0][0];
        populateMaxMethodArray(array, maxNumber);
        System.out.printf("%s%d","Max number in the grade is ", maxNumber);
    }
    private static void populateMaxMethodArray(int[][] array, int maxNumber) {
        for (int[] ints : array) {maxNumber = getMaxFromEachElement(maxNumber, ints);}
    }
    private static int getMaxFromEachElement(int maxNumber, int[] ints) {
        for (int i = 0; i < ints.length; i++) {if (i > maxNumber) maxNumber = i;}
        return maxNumber;
    }
}
