package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.AssertJUnit;

import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals(1000,myBank.checkBalanceViaBank("2334455660","1111"));
    }
    @Test public void twoAccountCanBeCreateWithBankAndCreditedWithCheckingTheirBalance(){
        myBank.registerNewCustomer("tola", "Shola", "2222");
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455661", 2000);
        assertEquals(2000, myBank.checkBalanceViaBank("2334455661","2200"));
    }
    @Test public void accountCreatedAccountCreatedAccountBalanceCannotBeAccessedWithWrongPassword(){
        try{
            myBank.registerNewCustomer("ope", "Odion", "2200");
            myBank.depositToAccount("2334455660", 2000);
            assertEquals(0, myBank.checkBalanceViaBank("2334455660","1111"));
        }catch (IllegalArgumentException ignored){}
//        assertEquals(0, myBank.checkBalanceViaBank("2334455660","1111"));
    }
    @Test public void bankCanCheckAccountBalance(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455660", 2000);
        assertEquals(2000, myBank.checkBalanceViaBank("2334455660","2200"));
    }
    @Test public void bankCanCheckAccountBalanceAgain(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.depositToAccount("2334455660", 4000);
        assertEquals(4000, myBank.checkBalanceViaBank("2334455660","2200"));
    }
    @Test public void createTwoAccountWithdrawFromTheOtherOneAndCheckBalance(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.depositToAccount("2334455661", 2000);
        myBank.withdrawFromAccount("2334455661", 500, "3030");
        assertEquals(1500, myBank.checkBalanceViaBank("2334455661","3030"));
    }
    @Test public void bankCanTransferAndDepositToAnotherAccountThroughAccount(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.depositToAccount("2334455661", 2000);
        myBank.transferFromAccount("2334455661", "2334455660", 500, "3030");
        assertEquals(500, myBank.checkBalanceViaBank("2334455660","2200"));
        assertEquals(1500, myBank.checkBalanceViaBank("2334455661","3030"));
        assertEquals(0, myBank.checkBalanceViaBank("2334455662","3030"));
    }
    @Test public void bankCanTransferAndDepositToAnotherAccountThroughAccountAgain(){
        myBank.registerNewCustomer("ope", "Odion", "2200");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.registerNewCustomer("ope", "Odion", "3030");
        myBank.depositToAccount("2334455661", 2000);
        myBank.transferFromAccount("2334455661", "2334455660", 500, "3030");
        assertEquals(500, myBank.checkBalanceViaBank("2334455660","2200"));
        assertEquals(1500, myBank.checkBalanceViaBank("2334455661","3030"));
        assertEquals(0, myBank.checkBalanceViaBank("2334455662","3030"));
    }
}
