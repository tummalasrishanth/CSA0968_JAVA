import java.util.ArrayList;
import java.util.Collections;

public class q29 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 1, 1, 1, 1 };
        int[] arr2 = { 1, 0, 1 };

        ArrayList<Integer> result = new ArrayList<>();

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0)
                sum += arr1[i--];
            if (j >= 0)
                sum += arr2[j--];

            result.add(Math.abs(sum) % 2);
            carry = -(sum >> 1);
        }

        while (result.size() > 1 &&
                result.get(result.size() - 1) == 0) {
            result.remove(result.size() - 1);
        }

        Collections.reverse(result);
        System.out.println(result);
    }
}