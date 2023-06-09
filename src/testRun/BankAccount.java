package testRun;
import java.util.ArrayList;
import java.util.List;
public class BankAccount {
    private String accountNumber;
    private final List<Account> accounts = new ArrayList<>();
    public void registerCustomer(String firstName, String lastName, String password) {
        String accountNumber = "2233445566";
        this.accountNumber = accountNumber + accounts.size();
        Account account = new Account(firstName,lastName, password);
        account.setAccount(this.accountNumber);
        accounts.add(account);
    }
    public int size() {
        return accounts.size();
    }
    public void deposit(String accountNumber, int amount) {
        checkAccount(accountNumber);
        Account account = findAccountByAccountNumber(accountNumber);
        account.deposit(amount);
    }
    public Account findAccountByAccountNumber(String accountNumber){
        for (Account account : accounts) if (account.getAccountNumber().equals(accountNumber)) return account;
        throw new NullPointerException("Does not exist");
    }
    public int checkBalance(String accountNumber, String password) {
        Account account = findAccountByAccountNumber(accountNumber);
        return account.checkBalance(password);
    }
    public boolean isTrue(String accountNumber){
        for (Account account : accounts) if (account.getAccountNumber().equals(accountNumber)) return true;
        return false;
    }
    private void checkAccount(String accountNumber){
        if (isTrue(accountNumber)){ System.out.println("Account Confirmed");}
        if (!isTrue(accountNumber)) {
            System.out.println("Invalid Account");
        }
    }
    public void withdrawFromAccount(String accountNumber, int amount, String password) {
        checkAccount(accountNumber);
        Account account = findAccountByAccountNumber(accountNumber);
        if (checkBalance(accountNumber,password) >= amount && amount > 0) account.withdraw(password, amount);
        else {
            System.out.println("Invalid Amount");
            System.exit(1);
        }
    }
    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String password) {
        withdrawFromAccount(senderAccountNumber,amount, password);
        deposit(receiverAccountNumber,amount);
    }
    public String accountInfo(){
        return accountNumber;
    }
}
