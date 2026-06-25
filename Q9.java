import java.util.*;

public class Q9 {
    public static void main(String[] args) {

        String word = "MOSQUE";

        char arr[] = word.toCharArray();

        Arrays.sort(arr);

        System.out.print("Alphabetical Order: ");

        for(int i=arr.length-1;i>=0;i--)
            System.out.print(arr[i] + " ");
    }
}
