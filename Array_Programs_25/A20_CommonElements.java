import java.util.*;

public class A20_CommonElements {
    public static void main(String[] args) {
        int[] a = {1, 5, 3, 7, 9};
        int[] b = {2, 5, 6, 7, 8};
        Set<Integer> setA = new HashSet<>();
        for (int x : a) setA.add(x);
        List<Integer> common = new ArrayList<>();
        for (int x : b) if (setA.contains(x)) common.add(x);
        System.out.println("Array A        : " + Arrays.toString(a));
        System.out.println("Array B        : " + Arrays.toString(b));
        System.out.println("Common Elements: " + common);
    }
}
