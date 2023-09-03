public class CWH_34_Recursion {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    static int factorial_iterative(int n){
        int factorial = 1;
        for(int i=n;i>0;i--){
            factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        int x=6;
        System.out.println("Factorial of x is : "+factorial(x));
        System.out.println("Factorial of x is : "+factorial_iterative(x));


    }
}
