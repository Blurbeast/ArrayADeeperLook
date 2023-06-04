package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AccountTest {
    Account myAccount;
    @BeforeEach void startWith() {myAccount = new Account("Oladele", "Banjo", "1111");}
    @Test public void objectOfClassExist(){
        assertNotNull(myAccount);
    }
    @Test public void accountBalanceCanBeCheckedWhenIDeposit(){
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.checkBalance("1111"));
    }
    @Test public void accountBalanceCannotBeAccessedIfWrongPasswordIsInputted(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        assertEquals(0, myAccount.checkBalance("1221"));
    }
    @Test public void accountCanTakeDepositWhenAmountIsDeposited(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.checkBalance("1111"));
    }
    @Test public void accountCanTakeDeposit(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(500);
        assertEquals(500, myAccount.checkBalance("1111"));
    }
    @Test public void accountCanTakeTwoAtOnce(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(100);
        myAccount.deposit(300);
        assertEquals(400, myAccount.checkBalance("1111"));
    }
    @Test public void accountDepositCantTakeAmountLessThanZero(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(-100);
        assertEquals(0, myAccount.checkBalance("1111"));
    }
    @Test public void withdrawalCanBeMadeFromTheAccount(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        myAccount.withdraw("1111", 500);
        assertEquals(500, myAccount.checkBalance("1111"));
    }
    @Test public void withdrawalFromAccountWithAmountLessThanZeroShouldNotBeAllowed(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        myAccount.withdraw("1111", -500);
        assertEquals(1000, myAccount.checkBalance("1111"));
    }
    @Test public void withdrawCannotBeMadeWithAmountGreaterThanTheBalance(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        myAccount.withdraw("1111", 5000);
        assertEquals(0, myAccount.checkBalance("1111"));
    }
    @Test public void withdrawalCannotBeMadeInAccountIfThePasswordIsWrong(){
        assertEquals(0, myAccount.checkBalance("1111"));
        myAccount.deposit(1000);
        myAccount.withdraw("1221", 500);
        assertEquals(0, myAccount.checkBalance("1111"));
    }
}
