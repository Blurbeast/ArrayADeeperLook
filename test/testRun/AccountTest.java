package testRun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
public class AccountTest {
    Account account;
    @BeforeEach void setUp(){
        account = new Account("firstName", "lastName", "1111");
    }
    @Test public void objectExist(){
        assertNotNull(account);
    }
    @Test public void checkBalanceAfterDepositWasMAde(){
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("1111"));
    }
    @Test public void checkDepositYetAgain(){
        account.deposit(2000);
        assertEquals(2000,account.checkBalance("1111"));
    }
    @Test public void negative_AmountForDeposit_NotAllowed(){
        account.deposit(-2000);
        assertEquals(0,account.checkBalance("1111"));
    }
    @Test public void confirm_It_AllowsMultipleDeposit(){
        account.deposit(200);
        account.deposit(200);
        assertEquals(400, account.checkBalance("1111"));
    }
    @Test public void wrong_PasswordCannotBeUSedTo_CheckPassword(){
        account.deposit(3000);
        assertEquals(0, account.checkBalance("2222"));
    }
    @Test public void withdrawalCanBeMadeFromAccount(){
        account.deposit(3000);
        account.withdraw("1111",300);
        assertEquals(2700, account.checkBalance("1111"));
    }
    @Test public void withdrawalCanBeTriedAgain(){
        account.deposit(3000);
        account.withdraw("1111",1000);
        assertEquals(2000, account.checkBalance("1111"));
    }
    @Test public void multipleWithdrawalCanBeMade(){
        account.deposit(3000);
        account.withdraw("1111",1000);
        account.withdraw("1111",1500);
        assertEquals(500, account.checkBalance("1111"));
    }
    @Test public void withdrawalCannot_BeMadeWithWrongPassword(){
        account.deposit(3000);
        account.withdraw("2222",1500);
        assertEquals(3000, account.checkBalance("1111"));
    }
    @Test public void withdrawalCannot_BeMadeWithWrongPasswordCanBeDoneAgain(){
        account.deposit(3000);
        account.withdraw("2222",1500);
        account.withdraw("1111",1500);
        assertEquals(1500, account.checkBalance("1111"));
    }
}

