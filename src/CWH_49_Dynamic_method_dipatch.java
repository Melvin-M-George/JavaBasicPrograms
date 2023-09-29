class Phone{
    public void show_Time(){
        System.out.println("10:15");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing Music");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone.....");
    }
}
public class CWH_49_Dynamic_method_dipatch {
    public static void main(String[] args) {
        //Phone obj = new Phone();
        //Smartphone smobj = new Smartphone();
        //obj.name();

        Phone obj = new Smartphone(); //Allowed
        //Smartphone obj2 = new Phone(); // Not Allowed
        obj.show_Time();
        obj.on();
        //obj.music(); // Not allowed


    }
}
