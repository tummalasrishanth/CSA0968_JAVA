import java.util.ArrayList;

public class q12 {
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 2, 4, 5, 6, 7 };

        ArrayList<Integer> common = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !common.contains(arr1[i])) {
                    common.add(arr1[i]);
                }
            }
        }

        System.out.println(common);
    }
}