package importantlogical;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeImpl {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, 30, "RamChander", 10000.00);
        Employee e2 = new Employee(102, 45, "Chander", 50000.00);
        Employee e3 = new Employee(103, 35, "Inder", 25000.00);
        Employee e4 = new Employee(104, 32, "Mahender", 20000.00);
        List<Employee> list = List.of(e1, e2, e3, e4);
        Employee employee = list.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1)
                .findFirst()
                .get();
        System.out.println("The second Highest Salary is = " + employee);
        System.out.println("Sorted by Age is(Ascending Order/Natural Order ) ------> ");
         list.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);
        System.out.println("Sorted by ID is (Descending Order/Reversed Order )------->");
        list.stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed()).forEach(System.out::println);
        System.out.println(" ");
        List<Employee> salary = list.stream().map(e -> {
            if (e.getAge() > 33) {
                e.setSalary(e.getSalary() * 1.10);
            }
            return e;
        }).collect(Collectors.toList());
        System.out.println("Increased salary of Employees is = "+salary);
    }
}
