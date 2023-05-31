package workout;

public class fibonacci {
    public static void fib(int occurrence){
        int number1 = 0;
        int number2 = 1;
        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        getMagic(occurrence, number1, number2);
    }

    private static void getMagic(int occurrence, int number1, int number2) {
        for (int index = 0; index < occurrence; index++) {
            int number3 = number2 + number1;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
    }

    public static void main(String[] args) {
        fib(10);
    }
}
