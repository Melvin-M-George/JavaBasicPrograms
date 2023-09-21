class Base1 {
    Base1(){
        System.out.println("This is the constructor of Base1 Class");
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("This is the constructor of Derived1 Class");
    }
}
public class CWH_46_Constructors_in_Inheritance{
    public static void main(String[] args) {
        Base1 b = new Base1();
        Derived1 d = new Derived1();
    }
}