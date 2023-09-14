class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is " + id + " and my name is "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        Employee melvin = new Employee(); // Instantiating a new Employee object
        Employee manav = new Employee(); // Instantiating a new Employee object

        //Setting attributes
        melvin.id = 2001;
        melvin.name = "Melvin M George";
        melvin.salary=50000;

        manav.id = 2005;
        manav.name = "Manav M George";
        //Printing Attributes
        //System.out.println(melvin.id);
        //System.out.println(melvin.name);
        melvin.printDetails();
        manav.printDetails();

        int salary = melvin.getSalary();
        System.out.println(salary);

    }
}
