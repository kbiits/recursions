package nabiel.recursions;

// resource : https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
public class FirstUppercaseLetter {
    public static void main(String[] args) {
        System.out.println(solve("asdjbaLWoi", 0));
    }

    public static String solve(String letters, int idx) {
        if (idx == letters.length()) {
            return "";
        }
        int codePoint = letters.codePointAt(idx);
        if (codePoint >= 'A' && codePoint <= 'Z') {
            return letters.substring(idx, idx + 1);
        }

        return solve(letters, idx + 1);
    }
}
