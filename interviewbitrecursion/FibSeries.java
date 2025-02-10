package interviewbitrecursion;

public class FibSeries {
    public static void main(String[] args) {
        System.out.println(fibSeries(5));
    }
    public static int fibSeries(int n){
        if(n<=1){
            return n;
        }
        return fibSeries(n-1)+fibSeries(n-2);
    }
}
