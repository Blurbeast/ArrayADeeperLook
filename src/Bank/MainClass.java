package Bank;

import java.util.Scanner;

public class MainClass {
    private  static final Scanner userInput = new Scanner(System.in);
    private static final Bank bank = new Bank();
    public static void main(String[] args) {
        entryPoint();
    }
    public static void entryPoint(){
        depositing();
    }
    private static void depositing(){
        displayMessage("Enter account number: ");
        String accountNumber = input(userInput);
        displayMessage("Enter amount: ");
        String amount = input(userInput);
        bank.depositToAccount(accountNumber, Integer.parseInt(amount));
    }
    private static void withdraw(){
        displayMessage("Enter account number: ");
        String accountNumber = input(userInput);
        displayMessage("Enter amount to withdraw: ");
        String amount = input(userInput);
        displayMessage("Enter withdrawal pin: ");
        String pin = validatePin();
        bank.withdrawFromAccount(accountNumber,Integer.parseInt(amount),pin);
    }
    private static String validatePin(){
        String pin = input(userInput);
        while (pin.length() != 4){
            displayMessage("Incorrect Entry, Pin Should be 4 digits long\n");
            displayMessage("Enter pin: ");
            pin = input(userInput);
        }
        return pin;
    }
    private static void displayMessage(String message){System.out.printf("%s", message);}
    private static String input(Scanner userInput){return userInput.nextLine();}
}
