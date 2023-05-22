package estore;

public class CardCVV {
    private String expireMonthAndYear;
    private String cardNumber;
    private String cardOwnerName;
    private  CardType cardType;

    public CardCVV(String expireMonthAndYear, String cardNumber, String cardOwnerName, CardType cardType) {
        this.expireMonthAndYear = expireMonthAndYear;
        this.cardNumber = cardNumber;
        this.cardOwnerName = cardOwnerName;
        this.cardType = cardType;
    }

    public String getExpireMonthAndYear() {return expireMonthAndYear;}
    public void setExpireMonthAndYear(String expireMonthAndYear) {this.expireMonthAndYear = expireMonthAndYear;}
    public String getCardNumber() {return cardNumber;}
    public void setCardNumber(String cardNumber) {this.cardNumber = cardNumber;}
    public String getCardOwnerName() {return cardOwnerName;}
    public void setCardOwnerName(String cardOwnerName) {this.cardOwnerName = cardOwnerName;}
    public CardType getCardType() {return cardType;}
    public void setCardType(CardType cardType) {this.cardType = cardType;}
    @Override
    public String toString() {
        return "CardCVV{" +
                "expireMonthAndYear='" + expireMonthAndYear + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cardOwnerName='" + cardOwnerName + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
