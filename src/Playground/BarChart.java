package Playground;

import java.util.Arrays;

public class BarChart {
    public static void main(String[] args) {
        int[][] grade = new int [5][5];
        for (int index =0; index<grade.length;index++){for (int i=0;i<grade[index].length;i++) grade[index][i] =i;}
        System.out.println(Arrays.deepToString(grade));
        int[] frequency = new int[6];
        for (int[] arr : grade){for (int g: arr) ++frequency[g/10];}
        for (int index=0; index<frequency.length;index++){
            if (index==10) System.out.printf("%7d: ",index*10);
            else {System.out.printf("%02d - %02d: ",index*10,9+index*10);}
            for (int star=0; star<frequency[index];star++) System.out.print("*");
            System.out.println();
        }
    }
}
