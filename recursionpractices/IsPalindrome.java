package recursionpractices;

public class IsPalindrome {
    public static void main(String[] args) {
        String inp="madam";
        System.out.println(isPalindrome(inp,0,inp.length()-1));

    }
    public static boolean isPalindrome(String str, int low, int high) {
        if (low >= high) {
            return true;
        }
        else if (str.charAt(low) == str.charAt(high)) {
            return isPalindrome(str, low + 1, high - 1);
        }
        else {
            return false;
        }
    }
}
