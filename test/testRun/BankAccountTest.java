package testRun;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.testng.Assert.assertThrows;

public class BankAccountTest {
    BankAccount bankAccount;
    @BeforeEach void setUp(){bankAccount = new BankAccount();}
    @Test public void objectOfClassExist(){
        assertNotNull(bankAccount);
    }
    @Test public void bankCanBeCreateAccount(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        assertEquals(1, bankAccount.size());
    }
    @Test public void multipleBankAccountCanBeCreated(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.registerCustomer("firstName", "lastName","password");
        assertEquals(2, bankAccount.size());
    }
    @Test public void depositCanBeMadeToAccountThroughBank(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.deposit("22334455660", 3000);
        assertEquals(3000, bankAccount.checkBalance("22334455660", "password"));
    }
    @Test public void depositCanBeMadeToAccountThroughBankAgain(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.deposit("22334455660", 4000);
        assertEquals(4000, bankAccount.checkBalance("22334455660", "password"));
    }
    @Test public void accountBalanceCannotBeAccessedWithWrongPassword(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.deposit("22334455660", 4000);
        assertEquals(0, bankAccount.checkBalance("22334455660", "2222"));
        assertThrows(NullPointerException.class, ()->bankAccount.deposit("1233",56));
    }
    @Test public void withdrawFromAccountThroughBank(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.deposit("22334455660", 4000);
        bankAccount.withdrawFromAccount("22334455660", 3000, "password");
        assertEquals(1000, bankAccount.checkBalance("22334455660", "password"));
    }
    @Test public void transferCanBeMadeFromOneExistingAccountToAnother(){
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.registerCustomer("firstName", "lastName","password");
        bankAccount.deposit("22334455661", 4000);
        bankAccount.transfer("22334455661", "22334455660", 1500, "password");
        assertEquals(1500, bankAccount.checkBalance("22334455660", "password"));
        assertEquals(2500, bankAccount.checkBalance("22334455661","password"));
    }
}
