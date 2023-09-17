class MyMainEmployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {

        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
    public MyMainEmployee(){
        id = 49;
        name = "Your_name";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        name = myName;
    }
}

public class CWH_42_Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("CodeWithHarry",143);
        //harry.setName("CodeWithHarry");
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
