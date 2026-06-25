import java.util.*;

public class Q47 {
    public static void main(String[] args) {

        String paragraph =
            "Ram hit a ball the hit ball flew far after it was hit";

        String banned = "hit";

        String words[] = paragraph.toLowerCase().split(" ");

        HashMap<String,Integer> map = new HashMap<>();

        for(String word : words) {

            if(!word.equals(banned)) {

                map.put(word,
                        map.getOrDefault(word,0)+1);
            }
        }

        String result = "";
        int max = 0;

        for(String key : map.keySet()) {

            if(map.get(key) > max) {
                max = map.get(key);
                result = key;
            }
        }

        System.out.println(result);
    }
}