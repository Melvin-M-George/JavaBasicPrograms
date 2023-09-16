class MyEmployee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i ){
        id = i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_40_Access_modifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        //harry.id = 45;
        //harry.name = "COdeWithHarry";--> Throws error due to private access modifier
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());
        harry.setId(69);
        System.out.println(harry.getId());



    }
}
