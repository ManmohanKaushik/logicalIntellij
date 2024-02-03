package importantlogical;

public class Employee {
    private Integer empId;
    private Integer age;
    private String empName;
    private Double salary;

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(Integer empId, Integer age, String empName, Double salary) {
        this.empId = empId;
        this.age = age;
        this.empName = empName;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", age=" + age +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
