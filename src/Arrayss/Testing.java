package Arrayss;

import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        int[] letget = {4,5,6,7,0,2,1,3};
        get("codeleet", letget);

    }
    private static void get(String in, int[] array){
//        String[] arrayString = new String[in.length()];
        String getIt ="";
        for (int index = 0; index < in.length(); index++) {
//            arrayString[index] = String.valueOf(in.charAt(index));
            getIt += in.charAt(array[index]);
        }
//        for (int index = 0; index < array.length; index++) {
//            int i = 0;
//            i = array[index];
//            getIt += arrayString[i];
//        }
        System.out.println(getIt);
    }
}
