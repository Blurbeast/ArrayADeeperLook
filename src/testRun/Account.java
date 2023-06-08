package testRun;

public class Account {
    private int amount;
    private String firstName;
    private String lastName;
    private final String password;
    private String accountNumber;
    public Account(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }
    public void deposit(int amount) {
        if (amount > 0) this.amount += amount;
    }
    public int checkBalance(String password) {
        if (this.password.equals(password)) return amount;
        return 0;
    }

    public void withdraw(String pin,int amount) {
        if (this.amount >= amount && amount > 0) if (password.equals(pin)) this.amount -= amount;
        else throw new IllegalArgumentException("Amount to be withdrawn not allowed");
    }

    public void setAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
