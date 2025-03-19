package recursionpractices;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println(productOfNumbers(4,4));
    }
    public static int productOfNumbers(int num,int k){
        if(k==0){
            return 0;
        }
        return num+productOfNumbers(num,k-1);
    }
}
