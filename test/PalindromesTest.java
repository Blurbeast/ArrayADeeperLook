import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PalindromesTest {
    Palindromes reverseInput;
    @BeforeEach public void startWith(){
        reverseInput = new Palindromes();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(reverseInput);
    }
    @Test public void method_CanReverse_Input(){
        String result = reverseInput.checker("Tope");
        assertEquals("epot", result);
    }
    @Test public void method_CanReverse_InputAgain(){
        String result = reverseInput.checker("MADAM");
        assertEquals("madam", result);
    }
    @Test public void method_CanCheck_If_It_IsAPalindrome(){
        boolean result = reverseInput.isPalindromes("Tope");
        assertFalse(result);
    }
    @Test public void method_CanCheck_If_It_IsAPalindrome_Again(){
        boolean result = reverseInput.isPalindromes("MADAM");
        assertTrue(result);
    }
}