package AllEnum;

import java.util.Arrays;

public class Testing {
//    public static void main(String[] args) {
//        String number = "4388576018402626";
//        int total =0;
//        long num = Long.parseLong(number);
//        String collect = "";
//        String cardType ="";
//        String oddPos = "";
//        int sum1 =0;
//        int sum2=0;
//        String [] arr = new String[2];
//        for (int index = number.length()-2; index >= 0; index-=2) {
//            collect = collect + number.charAt(index);
//        }
//        for (int index = 0; index < number.length(); index++) {
//            cardType = cardType + number.charAt(index);
//            if (cardType == "4") break;
//        }
//
//        System.out.println(collect);
//        for (int index = number.length() -1; index>=0; index-=2){
//            oddPos = oddPos + number.charAt(index);
//        }
//        int convert = Integer.parseInt(collect);
//        System.out.println(convert);
//        for (int i = 0; i < collect.length(); i++) {
//            int remainder = convert%10;
//            if (i >0 && i <=3) System.out.println("* "+i);
//            System.out.println(remainder);
//            int summation = (remainder *2);
//            System.out.println(summation);
//            if (summation >9) {
//                for (int j = 0; j < 2; j++) {
//                    remainder = summation%10;
//                    sum1 += remainder;
//                    summation/=10;
//                }
//                remainder = summation%10;
//                sum1 += remainder;
//            }
//            else sum1+=summation;
//        }
//        for (int i =0; i < collect.length();i++){
//            int remainder = convert%10;
//            System.out.println(remainder);
//            int summation = remainder*2;
//            System.out.println("rem "+ summation);
//            if (summation>9){
//                for (int j=0; j<2;j++) {
//                    int remain = summation % 10;
//                    sum1 += remain;
//                    summation /= 10;
//                }
//            }
//            else sum1 += summation;
//            convert /= 10;
//        }
//        int oddT = Integer.parseInt(oddPos);
//        for (int i=0; i<oddPos.length(); i++){
//            int remainder = oddT%10;
//            sum2 += remainder;
//            System.out.println("sum 2 "+sum2);
//            oddT/=10;
//        }
//        System.out.println(sum1);
//        System.out.println(oddPos);
//        int get = Integer.parseInt(oddPos);
//        for (int index=0;index<oddPos.length();index++){
//
//        }
//        int n = (int) ((int) num/Math.pow(10,number.length()-1));
//        for (int index =0; index < 2; index++){
//            cardType += number.charAt(index);
//            if (index==0) {
//                if (cardType.equalsIgnoreCase("4")) break;
//                if (cardType.equalsIgnoreCase("5")) break;
//                if (cardType.equalsIgnoreCase("6")) break;
//            }StringBuilder doubleSecondDigit = new StringBuilder();
//        int doubleSecondDigitInteger = Integer.parseInt(doubleSecondDigit.toString());
//        int totalSumOfTheDoubledSecondDigit = 0;
//        StringBuilder numbersOnOddPosition = new StringBuilder();
//        int numbersOnOddPositionInteger = Integer.parseInt(numbersOnOddPosition.toString());
//        int totalSumOfNumbersOnOddPosition = 0;
//        for (int index = number.length()-2; index >= 0; index-=2) {
//            doubleSecondDigit.append(cardNumber.charAt(index));
//        }
//        for (int index = cardNumber.length() -1; index>=0; index-=2){
//            numbersOnOddPosition.append(cardNumber.charAt(index));
//        }
//        for (int index =0; index < doubleSecondDigit.length();index++){
//            int remainder = doubleSecondDigitInteger%10;
//            int productOfRemainder = remainder*2;
//            if (productOfRemainder > 9){
//                for (int indexIndex=0; indexIndex<2;indexIndex++) {
//                    int remain = productOfRemainder % 10;
//                    totalSumOfTheDoubledSecondDigit += remain;
//                    productOfRemainder /= 10;
//                }
//            }
//            else totalSumOfTheDoubledSecondDigit += productOfRemainder;
//            doubleSecondDigitInteger /= 10;
//        }
//        for (int i=0; i<numbersOnOddPosition.length(); i++){
//            int remainder = numbersOnOddPositionInteger%10;
//            totalSumOfNumbersOnOddPosition += remainder;
//            numbersOnOddPositionInteger/=10;
//        }
//        }
//        if (cardType.equals("34")) System.out.println("America Express");
//        System.out.println(cardType.length());
//        System.out.println(cardType);
//        System.out.println(Arrays.toString(arr));


//    }
}
