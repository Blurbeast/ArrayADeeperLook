package Sleep_And_Stay_Empty;

public class Multiplication {
    public static int productOfTwoNumbers(int firstNumber, int secondNumber) {
        int sum = 0;
        if (firstNumber < 0 && secondNumber < 0){
            for (int index = secondNumber; index <0 ; index++) {
                sum -= firstNumber;
            }
        }
        else if (firstNumber < 0){
            for (int index = 0; index < secondNumber ; index++) {
                sum += firstNumber;
            }
        }
        else if (secondNumber < 0) {
            for (int index = 0; index < firstNumber; index++) {
                sum += secondNumber;
            }

        } else {
            for (int index = 0; index < secondNumber; index++) {
                sum += firstNumber;
            }
        }
        return sum;
    }
}
