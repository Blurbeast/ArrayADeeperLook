package Sleep_And_Stay_Empty;

public class DoubleArray {
    public static int[] doubleArray(int[] array){
        int[] newArray = new int[array.length * 2];
        for (int index = 0; index < array.length; index++) {
            newArray[index] = array[index];
        }
        return newArray;
    }
}
