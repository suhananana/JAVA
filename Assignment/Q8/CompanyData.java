import java.util.*;

public class CompanyData {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ravi");
        employees.add("Neha");

        HashSet<String> departments = new HashSet<>();
        departments.add("IT");
        departments.add("HR");

        HashMap<Integer, String> empMap = new HashMap<>();
        empMap.put(101, "Ravi");
        empMap.put(102, "Neha");

        System.out.println("Employees: " + employees);
        System.out.println("Departments: " + departments);
        System.out.println("Employee Map: " + empMap);
    }
}
