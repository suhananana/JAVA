//Program: Parameterized Constructor
public class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void show() {
        System.out.println("Name: " + name + ", ID: " + id);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Ravi", 101);
        e.show();
    }

}
