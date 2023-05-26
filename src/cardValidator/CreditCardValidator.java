package cardValidator;

public class CreditCardValidator {
    public String validateCard(String cardNumber) {
        if (cardNumber.length()<13 || cardNumber.length()>16){
            return "card invalid";
        }
        else return "card valid";
    }

    public String cardType(String cardNumber) {
        if (cardNumber.startsWith("4")) return "Visa";
        else if (cardNumber.startsWith("5")) return "Master Card";
        else if (cardNumber.startsWith("37")) return "America Express";
        else if (cardNumber.startsWith("6")) return "Discover card";
        else return "invalid card";
    }

    public String checkCardNumberValidity(String cardNumber) {
        int sumOfProductAndSum =0;
        String productOfNumber = "";
        String numberOnOddPosition = "";
        int sumOfProduct =0;
        int sumOfOddPosition=0;
        productOfNumber = getProductOfNumber(cardNumber, productOfNumber);
        numberOnOddPosition = getNumberOnOddPosition(cardNumber, numberOnOddPosition);

        int integerOfProductNumber = Integer.parseInt(productOfNumber);
        sumOfProduct = getSumOfProduct(productOfNumber, sumOfProduct, integerOfProductNumber);
        int integerOfOddPosition = Integer.parseInt(numberOnOddPosition);
        sumOfOddPosition = getSumOfOddPosition(numberOnOddPosition, sumOfOddPosition, integerOfOddPosition);
        sumOfProductAndSum = sumOfProduct + sumOfOddPosition;
        if (sumOfProductAndSum % 10 == 0) return "Valid";
        else return "Invalid";
    }

    private static int getSumOfOddPosition(String numberOnOddPosition, int sumOfOddPosition, int integerOfOddPosition) {
        for (int i = 0; i< numberOnOddPosition.length(); i++){
            int remainder = integerOfOddPosition %10;
            sumOfOddPosition += remainder;
            integerOfOddPosition /=10;
        }
        return sumOfOddPosition;
    }

    private static int getSumOfProduct(String productOfNumber, int sumOfProduct, int integerOfProductNumber) {
        for (int i = 0; i < productOfNumber.length(); i++){
            int remainder = integerOfProductNumber %10;
            int summation = remainder*2;
            if (summation > 9){
                for (int j=0; j<2;j++) {
                    int remain = summation % 10;
                    sumOfProduct += remain;
                    summation /= 10;
                }
            }
            else sumOfProduct += summation;
            integerOfProductNumber /= 10;
        }
        return sumOfProduct;
    }

    private static String getNumberOnOddPosition(String cardNumber, String numberOnOddPosition) {
        for (int index = cardNumber.length() -1; index>=0; index-=2){
            numberOnOddPosition = numberOnOddPosition + cardNumber.charAt(index);}
        return numberOnOddPosition;
    }

    private static String getProductOfNumber(String cardNumber, String productOfNumber) {
        for (int index = cardNumber.length()-2; index >= 0; index-=2) {
            productOfNumber = productOfNumber + cardNumber.charAt(index);}
        return productOfNumber;
    }

    public int checkNumberLength(String cardNumber) {
        return cardNumber.length();
    }
}
