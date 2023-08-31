public class CWH_32_method_overloading {
    static void change(int a){
        a = 98;
    }
    static void tellJoke(){
        System.out.println("Iam good at programming");
    }

    public static void main(String[] args) {
        //tellJoke();
        int [] marks = {1,2,3,4,5};
        int x = 45;
        change(x);
        System.out.println("The value of x after running change - " + x);


    }
}
