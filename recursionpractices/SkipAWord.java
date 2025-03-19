package recursionpractices;

public class SkipAWord {
    public static void main(String[] args) {
        System.out.println(skipAWord("absapplehe","apple"));
    }
    public static String skipAWord(String str,String target){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith(target)){
            return skipAWord(str.substring(target.length()),target);
        }else{
            return str.charAt(0)+skipAWord(str.substring(1),target);
        }

    }
}
