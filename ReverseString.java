package nabiel.recursions;

// resource : https://leetcode.com/problems/reverse-string/
public class ReverseString {
    public static void main(String[] args) {
        String str = "bla";
        System.out.println(reverse(str.toCharArray(), 0, str.length() - 1));
    }

    public static String reverse(char[] str, int left, int right) {
        if (left > right) {
            return String.valueOf(str);
        }
        char temp = str[left];
        str[left] = str[right];
        str[right] = temp;
        return reverse(str, left + 1, right - 1);
    }
}
