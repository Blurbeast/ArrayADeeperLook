package cardValidator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCardValidatorTest {
    CreditCardValidator cardValidator;
    @BeforeEach
    void setUp() {
        cardValidator = new CreditCardValidator();
    }
    @Test public void objectOfClassExist(){
        assertNotNull(cardValidator);
    }
    @Test public void lengthOfCardNumberIsMet(){
        String card = cardValidator.validateCard("4388576018402626");
        assertEquals("card valid", card);
    }
    @Test public void lengthOfCardNumberIsMetAndGotten(){
        String card = cardValidator.validateCard("438857602626");
        assertEquals("card invalid", card);
    }
    @Test public void getCardType(){
        String card = cardValidator.cardType("438857602626");
        assertEquals("Visa", card);
    }
    @Test public void cardType(){
        String card = cardValidator.cardType("37888999");
        assertEquals("America Express", card);
    }
    @Test public void cardTypeAgain(){
        String card = cardValidator.cardType("77888999");
        assertEquals("invalid card", card);
    }
    @Test public void isCardValid(){
        String card = cardValidator.checkCardNumberValidity("4388576018402626");
        assertEquals("Invalid", card);
    }
    @Test public void isCardValidAgain(){
        String card = cardValidator.checkCardNumberValidity("4388576018410707");
        assertEquals("Valid", card);
    }
    @Test public void checkCardNumberLength(){
        int card = cardValidator.checkNumberLength("4388576018410707");
        assertEquals(16, card);
    }
    @Test public void checkCardNumberLengthAgain(){
        int card = cardValidator.checkNumberLength("43885708107");
        assertEquals(11, card);
    }
}