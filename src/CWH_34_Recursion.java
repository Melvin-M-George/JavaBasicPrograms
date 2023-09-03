public class CWH_34_Recursion {
    static int factorial(int n){
//        if(n==0 || n==1){
//            return 1;
//        }
//        else{
//            return n*factorial(n-1);
//        }
        int factorial = 1;
        for(int i=n;i>0;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5 is : "+factorial(5));

    }
}
