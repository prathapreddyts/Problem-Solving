package interviewbitrecursion;

public class Palindrome {
    public static void main(String[] args) {
        String usr="racecar";
        System.out.println(isPalindrom("madam",0,usr.length()-1));
    }

    public static boolean isPalindrom(String usrStr, int start, int end) {
        if (start >= end) {
            return true;
        }
        return usrStr.charAt(start) == usrStr.charAt(end) && isPalindrom(usrStr, start + 1, end - 1);
    }


}
