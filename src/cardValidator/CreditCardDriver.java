package cardValidator;

import java.util.Scanner;

public class CreditCardDriver {
    public static void main(String[] args) {
        CreditCardValidator cardValidator = new CreditCardValidator();
        Scanner userInput = new Scanner(System.in);
        System.out.print("Hello, Kindly enter card details to verify: ");
        String userChoice = userInput.next();
        if (userChoice.length() <13){
            System.out.println("Card number too short");
            System.out.println("Enter card number again: ");
            userChoice = userInput.next();
        }
        if (userChoice.length() > 16){
            System.out.println("Card number too long");
            System.out.println("Enter card number again: ");
            userChoice = userInput.next();
        }
        System.out.println("Credit Card Type: " + cardValidator.cardType(userChoice));
        System.out.println("Credit card Number: " + userChoice);
        System.out.println("Credit Card Digit Length: " + cardValidator.checkNumberLength(userChoice));
        System.out.println("Credit Card Validity Status: " + cardValidator.checkCardNumberValidity(userChoice));
    }
}
