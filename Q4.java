import java.util.*;

public class Q4 {
    public static void main(String[] args) {

        String names[] = {
            "Banana",
            "Carrot",
            "Radish",
            "Apple",
            "Jack"
        };

        Arrays.sort(names);

        System.out.println("Ascending Order:");

        for(String s : names)
            System.out.println(s);
    }
}
