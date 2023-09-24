package OOP;

public class TestEmployee {
    public static void main(String[] args) {
        Employee worker1 = new Employee(1, "Pesho", "Peshev", 1000.12);
        System.out.println(worker1.getName());
        System.out.println(worker1.getAnnualSalary());
        System.out.println(worker1.raisSalary(15));
        worker1.employeeToString();
    }
}
