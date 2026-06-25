import java.util.HashSet;

public class q28 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2 };

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int or = 0;
            for (int j = i; j < arr.length; j++) {
                or |= arr[j];
                set.add(or);
            }
        }

        System.out.println(set.size());
    }
}