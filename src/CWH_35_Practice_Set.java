public class CWH_35_Practice_Set {
    //Question -1
    static void multiplication_table(int n){
        System.out.println("The multiplication table of "+n+ " is");
        for(int i=1;i<11;i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int sum_of_natural_numbers(int n){
        if(n==1){
            return 1;
        }else{
            return n + sum_of_natural_numbers(n-1);

        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>=i+1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static int nth_fibonacci(int n){
        if(n==1 ){
            return 0;
        } else if (n==2) {
            return 1;
        }
        else{
            return   nth_fibonacci(n-1) + nth_fibonacci(n-2);
        }

    }
    static float average(float ...arr){
        float sum = 0;
        for(float element:arr){
            sum = sum + element;
        }
        return sum/arr.length;
    }
    static float celsius_to_fahreheit(float c){
        //f = c * (9/5) + 32
        return c * (9f/5) + 32;

    }

    public static void main(String[] args) {
        //Question -1
        //multiplication_table(10);

        //Question -2
        //pattern1(5);


        //int x = 10;
        //System.out.println("The sum of first 10 natural numbers is " + sum_of_natural_numbers(x));

        //Question-4
        //pattern2(5);


        //int x = 6;
        //System.out.println("The 6th term in the fibonacci series is "+ nth_fibonacci(x));

        //Question-6
        //System.out.println("Th average of numbers is "+ average(1,2,3));

        //Question-9
        float x = 38;
        System.out.println("The temperature in fahrenheit is: "+ celsius_to_fahreheit(x));








    }
}
