package testRun;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class Main {
    private  static final Scanner userInput = new Scanner(System.in);
    private static final BankAccount bank = new BankAccount();
    public static void main(String[] args) throws InterruptedException {
        entryPoint();
    }
    private static void bankingFirm() throws InterruptedException {
        displayMessage("""
                1 -> Register account
                2 -> Cash Transaction
                3 -> Quit
                """);
        displayMessage("Input choice here: ");
        String option = input(userInput);
        switch (option.charAt(0)) {
            case '1' -> registerCustomer();
            case '2' -> insideBank();
            case '0' -> System.exit(99);
            default -> bankingFirm();
        }
    }
    private static void insideBank() throws InterruptedException {
        date_Time_And_Day_Of_The_Week();
        displayMessage("""
                \n
                1 -> Deposit
                2 -> Withdraw
                3 -> Transfer
                4 -> Check Balance
                0 -> Previous Menu
                9 -> Quit
                """);
        String option = input(userInput);
        switch (option.charAt(0)) {
            case '1' -> depositing();
            case '2' -> withdraw();
            case '3' -> transferring();
            case '4' -> balanceOfAccount();
            case '0' -> bankingFirm();
            case '9' -> System.exit(9);
            default -> insideBank();
        }
    }
    public static void entryPoint() throws InterruptedException {
        bankingNote();
        periodOfDay();
        date_Time_And_Day_Of_The_Week();
        bankingFirm();
    }
    private static void registerCustomer() throws InterruptedException {
        generateDelay();
        date_Time_And_Day_Of_The_Week();
        displayMessage("\n===New Customer Window===\n");
        displayMessage("Enter first name: ");
        String firstName = input(userInput);
        displayMessage("Enter last name: ");
        String lastName = input(userInput);
        displayMessage("Enter a strong password: ");
        String password = validatePin();
        bank.registerCustomer(firstName,lastName, password);
        displayMessage("Account created Successfully!\n");
        displayMessage("Your Account Number is: " + bank.accountInfo());
        displayMessage("\n");
        insideBank();
//        continuity();
    }
    public static void continuity() throws InterruptedException {
        displayMessage("\nWould you like to continue? \n");
        displayMessage("""
                1 -> Yes
                2 -> No
                """);
        String option = input(userInput);
        switch (option.charAt(0)){
            case '1' -> insideBank();
            case '2' ->{
                displayMessage("Session Ended");
                System.exit(22);
            }
            default -> bankingFirm();
        }
    }
    public static void transferring() throws InterruptedException {
        try {
            generateDelay();
            date_Time_And_Day_Of_The_Week();
            displayMessage("\n===Transfer Window===\n");
            displayMessage("Enter Your Account Number: ");
            String accountNumber = contains();
            senderAndReceiverChecker(accountNumber);
            displayMessage("Transfer Successful");
            continuity();
        }catch (NumberFormatException exception) {System.out.println("Amount must be integers");}
        catch (NullPointerException exception) {System.out.println("Invalid Account, Check Account properly then try again");}
    }

    private static void senderAndReceiverChecker(String accountNumber) throws InterruptedException {
        if (checker(accountNumber)) {
            displayMessage("Enter the Receiver Account Number: ");
            String receiverAccountNumber = contains();
            if (checker(receiverAccountNumber)) {
                receiverChecker(accountNumber, receiverAccountNumber);
            }else {
                displayMessage("Receiver Account Number is Incorrect\n");
                displayMessage("Back to main menu\n");
                generateDelay();
                displayMessage("\n");
                bankingFirm();
            }
        }else {
            displayMessage("Your Account Number is Incorrect\n");
            displayMessage("Back to main menu\n");
            generateDelay();
            displayMessage("\n");
            bankingFirm();
        }
    }
    private static void receiverChecker(String accountNumber, String receiverAccountNumber) throws InterruptedException {
        displayMessage("Enter Amount: ");
        String amount = contains();
        displayMessage("Enter pin: ");
        String pin = validatePin();
        bank.transfer(accountNumber, receiverAccountNumber, Integer.parseInt(amount), pin);
    }
    private static void depositing() throws InterruptedException {
        try {
            generateDelay();
            date_Time_And_Day_Of_The_Week();
            displayMessage("\n===Let Get Your Account Credited===\n");
            displayMessage("Enter account number: ");
            String accountNumber = contains();
            boolean check = checker(accountNumber);
            if (check) {
                displayMessage("Enter amount: ");
                String amount = contains();
                bank.deposit(accountNumber, Integer.parseInt(amount));
                displayMessage("Deposit Successful");
                continuity();
            }else {
                displayMessage("account no dy, no stress me\n");
                displayMessage("Back to main menu\n");
                generateDelay();
                displayMessage("\n");
                bankingFirm();
            }
        }catch (NullPointerException exception) {System.out.println("Account does not exist");}
        catch (NumberFormatException exception) {System.out.println("Amount should be integers");}
    }
    private static String contains() throws InterruptedException {
        String number = input(userInput);
        emptyInput(number);
        assert number != null;
        containAlphabet(number);
        return number;
    }
    private static void containAlphabet(String number) throws InterruptedException {
        for (char num : number.toCharArray())if (!Character.isDigit(num)) {
            System.out.println("Input Contains Alphabet");
            displayMessage("Back to main menu\n");
            entryPoint();
        }
    }
    private static void emptyInput(String number) throws InterruptedException {
        if (number == null || number.isEmpty()){
            displayMessage("Empty input\n");
            displayMessage("Back to main menu\n");
            entryPoint();
        }
    }
    private static void generateDelay() throws InterruptedException {
        displayMessage("Loading, please wait");
        for (int index = 0; index < 3; index++) {
            Thread.sleep(1000);
            System.out.print(".");
            Thread.sleep(1000);
        }
    }
    private static void withdraw() throws InterruptedException {
        try {
            generateDelay();
            date_Time_And_Day_Of_The_Week();
            displayMessage("\n===Withdrawal Window===\n");
            displayMessage("Enter account number: ");
            String accountNumber = contains();
            boolean check = checker(accountNumber);
            if (check) {
                displayMessage("Enter amount to withdraw: ");
                String amount = contains();
                displayMessage("Enter withdrawal pin: ");
                String pin = validatePin();
                bank.withdrawFromAccount(accountNumber, Integer.parseInt(amount), pin);
                displayMessage("Withdrawal Successful");
                continuity();
            }else {
                displayMessage("account no dy, no stress me\n");
                displayMessage("Back to main menu\n");
                generateDelay();
                displayMessage("\n");
                bankingFirm();
            }
        }catch (NumberFormatException exception) {System.out.println("Amount should be integers");}
        catch (NullPointerException exception) {System.out.println("Account does not exist");}
    }
    private static boolean checker(String accountNumber){
        return bank.isTrue(accountNumber);
    }
    private static String validatePin() {
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
    private static void bankingNote() {
        displayMessage("""
                \n
                ************************************************
                ================================================
                Welcome to the Wizards, We are here to serve you
                ================================================
                ************************************************
                """);
    }
    private static void date_Time_And_Day_Of_The_Week() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy hh:mm:ssa \n");
        LocalDateTime current = LocalDateTime.now();
        displayMessage("\nToday is ");
        displayMessage(formatter.format(current));
    }
    private static void periodOfDay() {
        Date date = new Date();
        int hour = date.getHours();
        String greet = hourDecider(hour);
        displayMessage(greet);
    }
    private static String hourDecider(int hour) {
        String greet = "";
        if (hour <= 12) greet ="Good morning! ";
        if (hour >= 12) greet = "Good Afternoon! ";
        if (hour >= 17) greet = "Good Evening! ";
        return greet;
    }
    private static void balanceOfAccount() throws InterruptedException {
        try {
            displayMessage("Enter account number: ");
            String accountNumber = input(userInput);
            boolean check = checker(accountNumber);
            if (check) {
                displayMessage("Enter password: ");
                String password = contains();
                displayMessage("Balance is " + bank.checkBalance(accountNumber, password));
                continuity();
            } else {
                displayMessage("account no dy, no stress me\n");
                displayMessage("Back to main menu\n");
                generateDelay();
                displayMessage("\n");
                bankingFirm();
            }
        }catch (NullPointerException exception) {System.out.println("Account does not exist");}
        catch (NumberFormatException exception) {System.out.println("Amount should be integers");}
    }
}
