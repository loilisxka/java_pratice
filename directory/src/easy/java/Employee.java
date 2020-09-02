import java.time.*;
import java.util.Objects;

/**
 * this class is an employee
 */

public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super();
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * (byPercent / 100);
        salary = raise + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Employee other = (Employee)obj;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(name, salary, hireDay);
    }

    public String toString(){
        return getClass().getName() + "[name=" + name + ",salary=" + salary + "hirdDay=" + hireDay + "]";
    }

    public static void main(String[] args){
        Employee hu = new Employee("hu", 10000, 2020, 9 ,2);
        System.out.println(hu.getSalary());
        hu.raiseSalary(100);
        System.out.println(hu.getSalary());
        System.out.println(hu);
    }
}