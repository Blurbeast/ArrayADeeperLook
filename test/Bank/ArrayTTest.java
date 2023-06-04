package Bank;

public class ArrayTTest {
    public static int duplicate(int[] array) {

        int occurrence = 0;
        int occurred = 0;
        for (int index = 0; index < array.length; index++) {
            int counter = 1;
            for (int inde = index +1; inde < array.length; inde++) {
                if (array[index] == array[inde]) counter++;
            }
            if (counter > occurrence) occurrence = counter;
            occurred = array[index];
        }
        return occurred;
    }
}