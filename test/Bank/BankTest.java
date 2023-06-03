package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
    Bank myBank;
    @BeforeEach void startWith(){
        myBank = new Bank();
    }
    @Test
    public void objectOfClaasBankExistHere(){
        AssertJUnit.assertNotNull(myBank);
    }
    @Test public void bankCanCreateAccount(){
        myBank.registerNewCustomer("FirstName", "LastName", "WithdrawalPin");
        assertEquals(1, myBank.sizeOfCustomers());
    }
    @Test public void accountCreatedShouldBeThreeWhenICreatedThreeAccount(){
        myBank.registerNewCustomer("FirstName", "LastName", "WithdrawalPin");
        myBank.registerNewCustomer("FirstName", "LastName", "WithdrawalPin");
        myBank.registerNewCustomer("FirstName", "LastName", "WithdrawalPin");
        assertEquals(3, myBank.sizeOfCustomers());
    }
    @Test public void bankAllowsDepositToAccount(){
        myBank.registerNewCustomer("FirstName", "LastName", "1111");
        myBank.depositToAccount("2334455660", 1000);
        Account account = myBank.findAccountByAccountNumber("2334455660");
        assertEquals(1000,account.checkBalance("1111"));
    }
    @Test public void twoAccountCanBeCreateWithBankAndCreditedWithCheckingTheirBalance(){
        myBank.registerNewCustomer("tola", "Shola", "2222");
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455661", 2000);
        Account account = myBank.findAccountByAccountNumber("2334455661");
        assertEquals(2000, account.checkBalance("2200"));
    }
    @Test public void accountCreatedAccountCreatedAccountBalanceCannotBeAccessedWithWrongPassword(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455660", 2000);
        Account account = myBank.findAccountByAccountNumber("2334455660");
        assertEquals(0, account.checkBalance("1111"));
    }
    @Test public void withdrawalCanBeMadeInAccountThroughBank(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455660", 2000);
        myBank.withdrawFromAccount("2334455660", 1000, "2200");
        Account account = myBank.findAccountByAccountNumber("2334455660");
        assertEquals(1000, account.checkBalance("2200"));
    }
    @Test public void createTwoAccountWithdrawFromTheOtherOneAndCheckBalance(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.depositToAccount("2334455661", 2000);
        myBank.withdrawFromAccount("2334455661", 500, "3030");
        Account account = myBank.findAccountByAccountNumber("2334455661");
        assertEquals(1500, account.checkBalance("3030"));
    }
    @Test public void bankCanTransferAndDepositToAnotherAccountThroughAccount(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.depositToAccount("2334455661", 2000);
        myBank.transferFromAccount("2334455661", "2334455660", 500, "3030");
        Account account1 = myBank.findAccountByAccountNumber("2334455661");
        Account account = myBank.findAccountByAccountNumber("2334455660");
        assertEquals(500, account.checkBalance("2200"));
        assertEquals(1500, account1.checkBalance("3030"));
    }
}
