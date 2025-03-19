package recursionpractices;

public class SkipACharacter {
    public static void main(String[] args) {
        System.out.println(skipAChar("abcda"));
    }
    public static String skipAChar(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch=='a'){
            return skipAChar(str.substring(1));
        }
        else {
            return ch+ skipAChar(str.substring(1));
        }
    }
}
