import java.util.Arrays;

class SortData<T extends Comparable<T>> {

    T arr[];

    SortData(T arr[]) {
        this.arr = arr;
    }

    void sort() {
        Arrays.sort(arr);

        for(T x : arr)
            System.out.print(x + " ");
    }
}

public class Q54 {
    public static void main(String[] args) {

        Integer nums[] = {5,3,1,4,2};

        SortData<Integer> obj =
                new SortData<>(nums);

        obj.sort();
    }
}