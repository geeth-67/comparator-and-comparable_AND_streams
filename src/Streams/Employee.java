package Streams;

public class Employee {

    private String empName;
    private double salary;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
