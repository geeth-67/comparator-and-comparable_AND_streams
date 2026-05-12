package Streams;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Upul", 300000));
        employees.add(new Employee("saman", 30000));
        employees.add(new Employee("kamal", 80000));
        employees.add(new Employee("ajith", 400000));
        employees.add(new Employee("ramesh", 500000));

        // Filter employees with salary > 80000
        List<Employee> employeesFiltered = employees.stream()
                .filter(emp -> emp.getSalary() > 80000)
                .toList();

        // Get employee names starting with "r"
        List<String> employeeNames = employees.stream()
                .filter(emp -> emp.getEmpName().startsWith("r"))
                .map(employee -> employee.getEmpName())
                .distinct()
                .sorted()
                .toList();

        employeeNames.forEach(emp -> System.out.println(emp));
    }
}