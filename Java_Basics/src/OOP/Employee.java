package OOP;

import java.text.NumberFormat;

public class Employee {
    final private int id;
    final private String firstName;
    final private String lastName;
    public double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getAnnualSalary() {
        NumberFormat annualSalary = NumberFormat.getCurrencyInstance();
        return annualSalary.format(salary * 12);
    }

    public String raisSalary(int raisPercent) {
        double rais = (double) raisPercent / 100;
        NumberFormat newSalary = NumberFormat.getCurrencyInstance();
        salary = (rais+1) * salary;
        return newSalary.format(salary);
    }

    public void employeeToString() {
        System.out.println("Employee's ID: " + id);
        System.out.println("Employee's name: " + firstName + " " + lastName);
        NumberFormat employeeSalary = NumberFormat.getCurrencyInstance();
        System.out.println("Employee's salaray: " + employeeSalary.format(salary));
    }
}
