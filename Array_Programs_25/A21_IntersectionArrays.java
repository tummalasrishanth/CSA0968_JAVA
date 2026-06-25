import java.util.*;

public class A21_IntersectionArrays {
    public static void main(String[] args) {
        int[] a = {4, 9, 5, 1, 3};
        int[] b = {9, 4, 9, 8, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : a) map.put(x, map.getOrDefault(x, 0) + 1);
        List<Integer> intersection = new ArrayList<>();
        for (int x : b) { if (map.getOrDefault(x, 0) > 0) { intersection.add(x); map.put(x, map.get(x) - 1); } }
        System.out.println("Array A      : " + Arrays.toString(a));
        System.out.println("Array B      : " + Arrays.toString(b));
        System.out.println("Intersection : " + intersection);
    }
}
