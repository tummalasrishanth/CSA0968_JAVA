import java.util.*;

public class A13_UnionSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 3, 6, 7, 10};
        Set<Integer> union = new TreeSet<>();
        for (int x : a) union.add(x);
        for (int x : b) union.add(x);
        System.out.println("Array A : " + Arrays.toString(a));
        System.out.println("Array B : " + Arrays.toString(b));
        System.out.println("Union   : " + union);
    }
}
