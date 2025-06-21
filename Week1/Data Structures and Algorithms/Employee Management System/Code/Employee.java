import java.time.LocalDate;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private LocalDate dateOfJoining;
    private double salary;

    public Employee(String employeeId, String name, String department, LocalDate dateOfJoining, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.dateOfJoining = dateOfJoining;
        this.salary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + employeeId + ", Name: " + name + ", Dept: " + department +
                ", DOJ: " + dateOfJoining + ", Salary: $" + salary;
    }
}
