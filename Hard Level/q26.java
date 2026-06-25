public class q26 {

    String[] words;

    public q26(String[] words) {
        this.words = words;
    }

    public int f(String pref, String suff) {
        int result = -1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref) &&
                    words[i].endsWith(suff)) {
                result = i; // largest index
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] words = { "apple", "apply", "ape" };

        q26 wf = new q26(words);

        System.out.println(wf.f("ap", "le"));
    }
}