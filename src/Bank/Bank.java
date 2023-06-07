package Bank;
import java.util.ArrayList;
import java.util.List;
public class Bank {
    private final List<Account> accounts = new ArrayList<>();
    public void registerNewCustomer(String firstName, String lastName, String withdrawalPin) {
        String accountNumber = "233445566" + accounts.size();
        Account account = new Account(firstName.toUpperCase(), lastName.toUpperCase(), withdrawalPin);
        account.setAccountNumber(accountNumber);
        accounts.add(account);
    }
    public int sizeOfCustomers() {
        return accounts.size();
    }
    public void depositToAccount(String accountNumber, int amount) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {account.deposit(amount);}
        }
    }
    private Account findAccountByAccountNumber(String accountNumber){
        for (Account account : accounts) if (account.getAccountNumber().equals(accountNumber)) return account;
        return null;
    }
    public void withdrawFromAccount(String accountNumber, int amount, String pin) {
        for (Account account : accounts) if (account.getAccountNumber().equals(accountNumber)) account.withdraw(pin, amount);
    }
    public void transferFromAccount(String senderAccountNum, String receiverAccountNum, int amount, String pin) {
        withdrawFromAccount(senderAccountNum, amount, pin);
        depositToAccount(receiverAccountNum, amount);
    }
    public int checkBalanceViaBank(String accountNumber, String password) {
        Account account = findAccountByAccountNumber(accountNumber);
        assert account != null;
        return account.checkBalance(password);
    }
}
//    private String checkIfAccountExist(String receiverAccount){
//        for (Account account : accounts) if (account.getAccountNumber().equals(receiverAccount))
//        return null;
//        return receiverAccount;
//    }