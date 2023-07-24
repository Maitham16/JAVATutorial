import java.io.File;
import java.io.FileNotFoundException;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Employee {
    private String id;
    private String name;
    private double salary;

    // Constructor
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setter
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    // toString
    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + '}';
    }

    // method to read data from file csv
    public Map<String, Employee> readEmployeesFromFile(String filePath) throws FileNotFoundException {

        Map<String, Employee> employees = new HashMap<>();

        try (Scanner scanner = new Scanner(new File(filePath)) ) {
            while ( scanner.hasNextLine()) {
                String[] data = scanner.nextLine().split(",");
                Employee employee = new Employee(data[0], data[1], Double.parseDouble(data[2]));

                employees.put(employee.getId(), employee);
            }
        }

        return employees;
    }

    // method that filters out employees with a salary above a certain threshold
    public Map<String, Employee> filterBySalary(Map<String, Employee> employees, double threshold) {
        return employees.entrySet().stream()
                .filter(entry -> entry.getValue().getSalary() <= threshold)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    // write the filtered data to a database
    public void writeToDB(Map<String, Employee> employees) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/employeedb";
        String user= "root";
        String pw = "4335";

        try (Connection connection = DriverManager.getConnection(url, user, pw)) {
            for (Employee employee : employees.values()) {

            String query = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";

            try (PreparedStatement statement = connection.prepareStatement(query)) {
                    statement.setString(1, employee.getId());
                    statement.setString(2, employee.getName());
                    statement.setDouble(3, employee.getSalary());

                    statement.executeUpdate();
                }
            }
        }
    }

    // main method
    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Employee employee = new Employee("id", "name", 0);
        String filePath = "Example/src/Employee.csv";
        double threshold = 55000;

        Map<String, Employee> employees = employee.readEmployeesFromFile(filePath);

        Map<String, Employee> filteredEmployees = employee.filterBySalary(employees, threshold);

        employee.writeToDB(filteredEmployees);
    }
}