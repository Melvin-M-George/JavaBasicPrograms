class Base1 {
    Base1(){
        System.out.println("This is the constructor of Base1 Class");
    }
    Base1(int a ){
        System.out.println("This is an overloaded constructor of Base1 Class with value:"+a);
    }
    Base1(int a ,int b){
        System.out.println("This is an overloaded constructor of Base1 Class with value:"+a*b);
    }
}

class Derived1 extends Base1{
    Derived1(){
        super(2,4);
        System.out.println("This is the constructor of Derived1 Class");
    }
    Derived1(int a,int b){
        super(a);
        System.out.println("This is an overloaded constructor of Derived1 Class with value:"+a*b);
    }
}

class Derived_Child extends Derived1{
    Derived_Child(){
        super();
        System.out.println("This is the constructor of Derived_Child");
    }
    Derived_Child(int a,int b,int c){
        super(3,5);
        System.out.println("This is the constructor of Derived_Child with value:"+a*b*c);
    }
}
public class CWH_46_Constructors_in_Inheritance{
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d = new Derived1(5,6);
        Derived_Child cd = new Derived_Child(1,2,3);
    }
}