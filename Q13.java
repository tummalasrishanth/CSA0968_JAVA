import java.util.*;

public class Q13{
    public static void main(String[] args) {

        int arr1[] = {1,3,4,5};
        int arr2[] = {2,4,6,8};

        ArrayList<Integer> list = new ArrayList<>();

        for(int x : arr1)
            list.add(x);

        for(int x : arr2)
            list.add(x);

        Collections.sort(list);

        System.out.println(list);
    }
}