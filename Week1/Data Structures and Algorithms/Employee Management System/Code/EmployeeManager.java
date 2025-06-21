import java.util.*;
import java.time.LocalDate;

public class EmployeeManager {
    private Map<String, Employee> employeeMap;
    private List<Employee> employeeList;

    public EmployeeManager() {
        employeeMap = new HashMap<>();
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getEmployeeId(), employee);
        employeeList.add(employee);
    }

    public Employee searchById(String id) {
        return employeeMap.get(id);
    }

    public void removeEmployee(String id) {
        Employee emp = employeeMap.remove(id);
        if (emp != null) {
            employeeList.remove(emp);
        }
    }

    public void updateDepartment(String id, String newDept) {
        Employee emp = employeeMap.get(id);
        if (emp != null) {
            emp.setDepartment(newDept);
        }
    }

    public void updateSalary(String id, double newSalary) {
        Employee emp = employeeMap.get(id);
        if (emp != null) {
            emp.setSalary(newSalary);
        }
    }

    public List<Employee> getAllEmployeesSortedByName() {
        List<Employee> sorted = new ArrayList<>(employeeList);
        sorted.sort(Comparator.comparing(Employee::getName));
        return sorted;
    }

    public List<Employee> getAllEmployeesSortedBySalary() {
        List<Employee> sorted = new ArrayList<>(employeeList);
        sorted.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        return sorted;
    }

    public List<Employee> getAllEmployeesSortedByDOJ() {
        List<Employee> sorted = new ArrayList<>(employeeList);
        sorted.sort(Comparator.comparing(Employee::getDateOfJoining));
        return sorted;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employeeList);
    }
}
