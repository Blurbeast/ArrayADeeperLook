package AllEnum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensional {
    public static void main(String[] args) {
        String[][] array = new String[3][2];
        array[0][0] = "Hi r0c0";
        array[0][1] = "Hi r0c1";
        array[1][0] = "Hi r1c0";
        array[1][1] = "Hi r1c1";
        array[2][0] = "Hi r2c0";
        array[2][1] = "Hi r2c1";

        Scanner userInput = new Scanner(System.in);
        String[] arrayChar = new String[5];
//        System.out.println(Arrays.toString(arrayChar));
//        for (String[] strings : array) {
//            System.out.println(Arrays.toString(strings));
//            for (int index = 0; index < arrayChar.length; ) {
//                System.out.println("Enter something");
//                String user = userInput.next();
//                if (user.equalsIgnoreCase("a") || user.equalsIgnoreCase("b")) {
//                    arrayChar[index] = user;
//                    index++;
//                } else System.out.println("Expect a or b");
//            }
//        }
        for (int index = 0; index < arrayChar.length;) {
            System.out.println(Arrays.toString(array[index]));
            System.out.println("Enter something");
            String user = userInput.next();
            if (user.equalsIgnoreCase("a") || user.equalsIgnoreCase("b")) {
                arrayChar[index] = user;
                index++;
            } else System.out.println("Expect a or b");
            if (index==array.length)break;
        }
    }
}
