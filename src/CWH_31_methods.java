public class CWH_31_methods {
     int logic(int x,int y){
        int z;
        if (x>y){
            z = x + y;
        }
        else{
            z = (x+y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
//        int c = logic(a,b);
        CWH_31_methods obj = new CWH_31_methods();
        int c = obj.logic(a,b);
        System.out.println(c);

    }
}
