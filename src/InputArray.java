import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputArray {
    public static void main(String[] args) {
        ArrayList<Integer > element = new ArrayList<>();
        int[] array = {10, 25};
        for (int index = 0; index < array.length; index++) {
            int k = array[index];
            int firstNumber =0;
            while (k != 0){
                firstNumber = k % 10;
                k /= 10;
                int secondNumber = k %10;
                k/=10;
                element.add(secondNumber);
                element.add(firstNumber);
            }
        }
        System.out.println(element);
    }
}
