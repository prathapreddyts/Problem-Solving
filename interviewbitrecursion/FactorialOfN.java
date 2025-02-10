package interviewbitrecursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println("fac ---> "+fac(5));
    }
    public static int fac(int n){
        if(n==0){
            return 1;
        }
        return fac(n-1)*n;
    }
}
