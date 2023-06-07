package testRun;
import java.util.ArrayList;
import java.util.List;
public class BankAccount {
    private final List<Account> accounts = new ArrayList<>();
    public void registerCustomer(String firstName, String lastName, String password) {
        Account account = new Account(firstName,lastName, password);
        String accountNumber = "2233445566" + accounts.size();
        account.setAccount(accountNumber);
        accounts.add(account);
    }
    public int size() {
        return accounts.size();
    }
    public void deposit(String accountNumber, int amount) {
        Account account = findAccountByAccountNumber(accountNumber);
        account.deposit(amount);
    }
    public Account findAccountByAccountNumber(String accountNumber){
        for (Account account : accounts) if (account.getAccountNumber().equals(accountNumber)) return account;
        return null;
    }
    public int checkBalance(String accountNumber, String password) {
        Account account = findAccountByAccountNumber(accountNumber);
        return account.checkBalance(password);
    }
    public void withFromAccount(String accountNumber, int amount, String password) {
        Account account = findAccountByAccountNumber(accountNumber);
        account.withdraw(password, amount);
    }
    public void transfer(String senderAccountNumber, String receiverAccountNumber, int amount, String password) {
        withFromAccount(senderAccountNumber,amount, password);
        deposit(receiverAccountNumber,amount);
    }
}
