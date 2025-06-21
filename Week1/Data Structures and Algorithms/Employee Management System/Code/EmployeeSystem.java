import java.time.LocalDate;
import java.util.List;

public class EmployeeSystem {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        manager.addEmployee(new Employee("E101", "Ravi", "HR", LocalDate.of(2021, 5, 21), 60000));
        manager.addEmployee(new Employee("E102", "Meena", "Finance", LocalDate.of(2022, 2, 14), 75000));
        manager.addEmployee(new Employee("E103", "Arjun", "IT", LocalDate.of(2020, 11, 3), 90000));
        manager.addEmployee(new Employee("E104", "Divya", "Marketing", LocalDate.of(2023, 1, 10), 58000));

        System.out.println("All Employees:");
        print(manager.getAllEmployees());

        System.out.println("\nSorted by Name:");
        print(manager.getAllEmployeesSortedByName());

        System.out.println("\nSorted by Salary:");
        print(manager.getAllEmployeesSortedBySalary());

        System.out.println("\nSorted by Date of Joining:");
        print(manager.getAllEmployeesSortedByDOJ());

        System.out.println("\nSearching for Employee E102:");
        Employee found = manager.searchById("E102");
        if (found != null) {
            System.out.println(found);
        }

        System.out.println("\nUpdating salary of E103...");
        manager.updateSalary("E103", 95000);
        System.out.println(manager.searchById("E103"));

        System.out.println("\nRemoving Employee E101...");
        manager.removeEmployee("E101");
        print(manager.getAllEmployees());
    }

    private static void print(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
