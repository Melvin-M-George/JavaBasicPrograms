public class CWH_35_Practice_Set {
    //Question -1
    static void multiplication_table(int n){

        int multi = 1;
        System.out.println("The multiplication table of "+n+ " is");
        for(int i=1;i<11;i++){
            multi = i * n;
            System.out.printf("%d x %d = %d\n",n,i,multi);
        }
    }
    public static void main(String[] args) {
        multiplication_table(10);


    }
}
