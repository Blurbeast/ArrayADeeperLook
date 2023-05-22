package Playground;

import java.util.Arrays;

public class ArrayInDepth {
    private static final int FINAL = 3;
    public static void main(String[] args) {
        boolean[][] array = new boolean[FINAL][3];
        //populating an array
        for (boolean[] booleans : array) {
            for (boolean aBoolean : booleans) {
                System.out.println(aBoolean);
            }
        }
        System.out.println(Arrays.deepToString(array));

        int[][] grades = {{87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65},
                {85, 75, 83},
                {91, 94, 100},
                {76, 72, 84},
                {87, 93, 73},
                {50, 44, 30},
                {57,66,24}};
        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d ", test + 1);
        }
        System.out.println();
        for (int[] grade : grades) {
            for (int i : grade) {
                System.out.printf("%5d ", i);
            }
            System.out.println();
        }
        int[] frequency = new int[11];
// for each grade in GradeBook, increment the appropriate frequency
        for (int[] studentGrades : grades) {
            System.out.println(Arrays.toString(studentGrades));
            for (int grade : studentGrades) {
                System.out.println(grade);
                ++frequency[grade/10];}
        }
        System.out.println(Arrays.toString(frequency));
        for (int index=0; index< frequency.length; index++){
            if (index == 10) System.out.printf("%7d: ", 10*index);
            else {System.out.printf("%02d - %02d: ",index * 10, 9 + index *10);}
            for (int i =0; i<frequency[index]; i++){System.out.print("*");}
            System.out.println();
        }

    }
}
