import java.util.ArrayList;

public class q30 {

    static ArrayList<Integer> ans = new ArrayList<>();

    static boolean solve(String s, int index) {

        if (index == s.length())
            return ans.size() >= 3;

        long num = 0;

        for (int i = index; i < s.length(); i++) {

            if (i > index && s.charAt(index) == '0')
                break;

            num = num * 10 + (s.charAt(i) - '0');

            if (num > Integer.MAX_VALUE)
                break;

            int size = ans.size();

            if (size >= 2) {
                long sum = (long) ans.get(size - 1) + ans.get(size - 2);

                if (num < sum)
                    continue;

                if (num > sum)
                    break;
            }

            ans.add((int) num);

            if (solve(s, i + 1))
                return true;

            ans.remove(ans.size() - 1);
        }

        return false;
    }

    public static void main(String[] args) {

        String num = "1101111";

        if (solve(num, 0))
            System.out.println(ans);
        else
            System.out.println("[]");
    }
}