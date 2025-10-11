abstract class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    abstract double calculateSalary();
}

class PermanentEmployee extends Employee {
    PermanentEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary + 5000;
    }
}

class ContractEmployee extends Employee {
    ContractEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    double calculateSalary() {
        return baseSalary;
    }

    public static void main(String[] args) {
        Employee e1 = new PermanentEmployee("Soham", 30000);
        Employee e2 = new ContractEmployee("Sneha", 25000);

        System.out.println(e1.name + "'s Salary: " + e1.calculateSalary());
        System.out.println(e2.name + "'s Salary: " + e2.calculateSalary());
    }
}
