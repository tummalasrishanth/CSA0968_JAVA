import java.util.*;

public class Q14 {
    public static void main(String[] args) {

        int arr[] = {16,18,27,16,23,21,19};

        double sum = 0;

        for(int n : arr)
            sum += n;

        double mean = sum / arr.length;

        Arrays.sort(arr);
        int median = arr[arr.length/2];

        int mode = arr[0];
        int maxCount = 0;

        for(int i=0;i<arr.length;i++) {
            int count = 0;

            for(int j=0;j<arr.length;j++) {
                if(arr[i] == arr[j])
                    count++;
            }

            if(count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("Mean = " + mean);
        System.out.println("Median = " + median);
        System.out.println("Mode = " + mode);
    }
}