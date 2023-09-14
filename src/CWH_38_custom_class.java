class Employee{
    int id;
    String name;
}
public class CWH_38_custom_class {
    public static void main(String[] args) {
        Employee melvin = new Employee(); // Instantiating a new Employee object
        melvin.id = 10931;
        melvin.name = "Melvin M George";
        System.out.println(melvin.id);
        System.out.println(melvin.name);

    }
}
