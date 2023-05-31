package workout;

import static com.google.common.math.IntMath.pow;

public class ArmStrong {
    public static boolean testArmstrong(int number) {
        int occurrence = 0, realNumber = number, sum = 0;
        while (realNumber > 0){
            occurrence++;
            realNumber /= 10;
        }
        realNumber = number;
        while (realNumber > 0){
            sum += pow((realNumber % 10), occurrence);
            realNumber /= 10;
        }
        return sum == number;
    }
}
