package interviewbitrecursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int result = sumOfNumber(5);
        System.out.println("Result ---> "+result);
    }
    public static int sumOfNumber(int n){
        if(n==1){
            return 1;
        }
        return sumOfNumber(n-1)+n;
    }
}
