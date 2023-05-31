package workout;

public class Factorial {
    public static int getFactorial(int factorNum) {
        int factorial = factorNum;
        for (int index = factorNum - 1; index > 0; index--) {
            factorNum--;
            factorial *= factorNum;
        }
        return factorial;
    }
}
