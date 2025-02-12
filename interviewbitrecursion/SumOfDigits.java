package interviewbitrecursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234,0));
    }
    public static int sumOfDigits(int n,int ans){
        if(n==0){
            return n;
        }
        return n%10+sumOfDigits(n/10,ans);
    }
}
