package Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static final Scanner userInput = new Scanner(System.in);
    static Bank bank = new Bank();
    public static void main(String[] args) {
        entryPoint();
    }
    private static void displayMessage(String message){
        out.printf("%s", message);
    }
    private static void entryPoint(){
        bankingNote();
        periodOfDay();
        date_Time_And_Day_Of_The_Week();
        out.println();
        bankingFirm();
    }
    private static void bankingFirm(){
        displayMessage("""
                1 -> Register account
                2 -> Cash Transaction
                """);
        String regAccount = input(userInput);
        switch (regAccount) {
            case "1" -> registerUser();
            case "2" -> bankingOption();
            default -> bankingFirm();
        }
        bankingOption();
    }
    private static void registerUser(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("Kindly fill in the prompts below.\n");
        displayMessage("Enter first name: ");
        String firstName = input(userInput);
        displayMessage("Enter last name: ");
        String lastName = input(userInput);
        String withdrawalPin = validateWithdrawalPin();
        bank.registerNewCustomer(firstName, lastName, withdrawalPin);
        displayMessage("===Welcome ");
        collectName(firstName.toUpperCase()+ "!==="+"\n");
    }
    private static String validateWithdrawalPin() {
        displayMessage("Set Withdrawal Pin: ");
        String withdrawalPin = input(userInput);
        withdrawalPin = validateWithdrawalPinLength(withdrawalPin);
        return withdrawalPin;
    }
    private static String validateWithdrawalPinLength(String withdrawalPin) {
        while (withdrawalPin.length() != 4) {
            displayMessage("Pin should be 4 digit long\n");
            displayMessage("Set Withdrawal Pin: ");
            withdrawalPin = input(userInput);
        }
        return withdrawalPin;
    }
    private static void collectName(String option){
        displayMessage(option);
    }
    private static void bankingOption(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("""
                \n
                1 -> Deposit
                2 -> Withdraw
                3 -> Transfer
                4 -> Check Balance
                """);
        String option = input(userInput);
        switch (option){
            case "1": depositing();
            case "2": withdrawal();
            case "3": transferring();
            case "4": checkBalance();
            default: {
                displayMessage("You entered an invalid input");
                bankingOption();
            }
        }
    }
    private static void checkBalance(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("Enter your Account Number: ");
        String accountDetails = input(userInput);
        displayMessage("Enter Access Pin: ");
        String pin = input(userInput);
        bank.checkBalanceViaBank(accountDetails,pin);
    }
    private static void depositing(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("Enter your account number: ");
        String accountDetails = input(userInput);
        displayMessage("Enter depositing amount: ");
        String amount = input(userInput);
        bank.depositToAccount(accountDetails,Integer.parseInt(amount));
        checkBalance();
    }
    private static void depositCheckBalance(){

    }
    private static void withdrawal(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("Enter your Account Number: ");
        String accountDetails = input(userInput);
        displayMessage("Enter Amount to Withdraw: ");
        String amount = input(userInput);
        displayMessage("Enter Withdrawal Pin: ");
        String pin = input(userInput);
        bank.withdrawFromAccount(accountDetails,Integer.parseInt(amount), pin);
    }
    private static void transferring(){
        date_Time_And_Day_Of_The_Week();
        displayMessage("Enter your Account Number: ");
        String accountDetails = input(userInput);
        displayMessage("Enter Receiver Account Number: ");
        String receiverAccount = input(userInput);
        displayMessage("Enter Amount to Withdraw: ");
        String amount = input(userInput);
        displayMessage("Enter Withdrawal Pin: ");
        String pin = input(userInput);
        bank.transferFromAccount(accountDetails,receiverAccount,Integer.parseInt(amount), pin);
    }
    private static String input(Scanner userInput) {
        return userInput.nextLine();
    }
    private static void bankingNote() {
        displayMessage("""
                \n
                ************************************************
                ================================================
                Welcome to Wizard Bank, We are here to serve you
                ================================================
                ************************************************
                """);
    }
    private static void date_Time_And_Day_Of_The_Week() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy hh:mm:ssa \n");
        LocalDateTime current = LocalDateTime.now();
        displayMessage("Today is ");
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
//        greetingOptions(greet);
        return greet;
    }
//    private static void greetingOptions(String greet) {
//        switch (greet) {
//            case "Good morning!" -> System.out.println("How are you doing today?");
//            case "Good Afternoon!" -> System.out.println("How is your day going?");
//            case "Good Evening!" -> System.out.println("How was your day?");
//        }
//    }
}
