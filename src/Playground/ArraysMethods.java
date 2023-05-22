package Playground;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] array = new int[5];
        int[] filledArray = new int[10];
        Arrays.fill(filledArray, 2);
        System.out.println(Arrays.toString(filledArray));
        int [] arrayCopy = new int[array.length];
        System.out.println(arrayCopy.equals(array));
        System.out.println(arrayCopy.length == array.length);
        System.out.println(Arrays.binarySearch(filledArray, 2));
        System.out.println(Arrays.binarySearch(filledArray, 4));

        String[][] arrayNumber = new String [4][4];
        System.out.println(Arrays.deepToString(arrayNumber));
    }
}
