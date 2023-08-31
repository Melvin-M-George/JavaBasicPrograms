public class CWH_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning");
    }
    static void foo(int a){
        System.out.println("The time is about "+ a);
    }
    static void foo(int a, int b){
        System.out.println("The time is "+ a+":"+b);
    }
    static void change(int a){
        a = 98;
    }
    static void tellJoke(){
        System.out.println("Iam good at programming");
    }

    public static void main(String[] args) {

        //tellJoke();
        //int [] marks = {1,2,3,4,5};
        //int x = 45;
        //change(x);
        //System.out.println("The value of x after running change = " + x);
        foo();
        foo(4);
        foo(10,15);//Arguments are actual\





    }
}
