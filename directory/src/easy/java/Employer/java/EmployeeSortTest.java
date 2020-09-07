package Employer.java;

import java.util.*;

/**
 * this program demonstartes the use of Comparable interface.
 * @version 1.0 2020-09-03
 * @author Lzzaya hu
 */

public class EmployeeSortTest {

    public static void main(String[] args){
        var staff = new Employee[3];
        staff[0] = new Employee("Harry Hacer", 35000, 2020, 9 ,3);
        staff[1] = new Employee("Carl Cracker", 75000, 2020, 9 ,3);
        staff[2] = new Employee("Tony Teester", 38000, 2020,9 ,3);

        Arrays.sort(staff);

        for(Employee e: staff){
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
        }
    }
}
