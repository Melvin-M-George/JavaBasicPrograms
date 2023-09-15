class Employee {
    int salary;
    String name;


    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class CWH_39_Ch8_PS {
    public static void main(String[] args) {
        //Question-1
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

    }
}
