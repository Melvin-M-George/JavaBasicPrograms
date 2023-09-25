class Phone{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java in class phone");
    }
}
class Smartphone extends Phone{
    public void welcome(){
        System.out.println("Welcome");
    }
    @Override
    public void name(){
        System.out.println("My name is Java in class smartphone");
    }
}
public class CWH_49_Dynamic_method_dipatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone smobj = new Smartphone();
        //obj.name();

        Phone obj = new Smartphone(); //Allowed
        //Smartphone obj2 = new Phone(); // Not Allowed

    }
}
