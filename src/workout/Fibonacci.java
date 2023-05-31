package workout;

public class Fibonacci {
    //it is of the idea to sum the two previous number to get the new number

    public static void fibonacci(int occurrence){
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        for (int index = 0; index < occurrence; index++) {
            int sum = firstNumber + secondNumber;
            System.out.print(sum+ " ");
            firstNumber = secondNumber;
            secondNumber = sum;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
