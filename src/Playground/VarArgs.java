package Playground;

import java.util.Scanner;

public class VarArgs {
    public double runMultipleArguments(int... number){
        double total =0;
        return averageOfSumOfNumber(total, number);
    }

    private static double averageOfSumOfNumber(double total, int[] number) {
        int lengthOfNumber = number.length;
        for (int num : number) total +=num;
        return total / lengthOfNumber;
    }

    public static void main(String[] args) {
        VarArgs get = new VarArgs();
        System.out.println(get.runMultipleArguments(4, 4, 4,5,8));
    }
}
