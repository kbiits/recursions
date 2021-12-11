package nabiel.recursions;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(count("ABCD"));
    }

    public static void solve(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        for (int i = 0; i < unprocessed.length(); i++) {
            String left = unprocessed.substring(0, i);
            String right = unprocessed.substring(i + 1);
            solve(processed + unprocessed.charAt(i), left + right);
        }
    }

    public static int count(String string) {
        if (string.length() == 2) {
            return 2;
        }

        int result = 0;
        for (int i = 0; i < string.length(); i++) {
            String left = string.substring(0, i);
            String right = string.substring(i + 1);
            result += count(left + right);
        }

        return result;
    }
}
