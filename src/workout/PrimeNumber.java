package workout;

public class PrimeNumber {
    //the idea is to get number only divisible by itself and 1

    public static String primeNumber(int number){
        int countOfZero = 0;
        if (number <= 1) return "not prime number";
        else {
            for (int index = 1; index <= number; index++) if (number % index == 0) countOfZero++;
        }
        if (countOfZero <= 2) return String.format("%d%s",number," is a prime number");
        return String.format("%d%s", number, " is not a prime number");
    }
    public static void main(String[] args) {
        System.out.println(primeNumber(9));
    }
}
