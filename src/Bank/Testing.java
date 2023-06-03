package Bank;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Testing {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        SecureRandom random = new SecureRandom();
        String accountNo = "38";
        String name = "";
        char bit = 'A';
            for (int index = 0; index < 8; index++) {
                int rand = random.nextInt(10);
                accountNo += (rand);
                name += bit++;
            }
            names.add(name);
        numbers.add(accountNo);
        System.out.println(names.get(0));
        System.out.println(numbers.get(0));
        System.out.println(names);
        System.out.println(numbers);
    }
}
