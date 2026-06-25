import java.util.TreeSet;

public class q6 {

    static TreeSet<String> set = new TreeSet<>();

    static void permute(char[] arr, int index) {
        if (index == arr.length) {
            set.add(new String(arr));
            return;
        }

        for (int i = index; i < arr.length; i++) {
            char temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

            permute(arr, index + 1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int num = 143; // Direct Input

        if (num <= 0) {
            System.out.println("Invalid Input");
            return;
        }

        String str = String.valueOf(num);

        permute(str.toCharArray(), 0);

        System.out.println("Permutations are:");
        for (String s : set) {
            System.out.println(s);
        }
    }
}