package Playground;

import java.util.ArrayList;
import java.util.Arrays;

public class EnumClass {
    public static void main(String[] args) {
        Enum j=Enum.LOST;
        System.out.println(j.getPrice());

       //Enum[] e = Enum.values();
        for (Enum a : Enum.values()){
           // System.out.print(a +" ");
            System.out.print(a.name()+" ");
            //System.out.println(a.getPrice());
            System.out.println(a);
        }
    }
}
