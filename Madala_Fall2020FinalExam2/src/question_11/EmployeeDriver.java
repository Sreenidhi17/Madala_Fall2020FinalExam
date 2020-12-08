package question_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author Sreenidhi Madala
 */
public class EmployeeDriver {

    public static void main(String[] args) {
//        creating a new employee object and adding the vaues to new object
        Employee emp1 = new Employee(1, "sreenidhi", 2000);
        Employee emp2 = new Employee(2, "sam", 2800);
        Employee emp3 = new Employee(3, "sree", 1200);
        Employee emp4 = new Employee(4, "nidhi", 2300);
        Employee emp5 = new Employee(5, "sreehi", 2080);
// creating a list employee and adding the employee objects to list
        List<Employee> empl = new ArrayList<Employee>();
        empl.add(emp1);
        empl.add(emp4);
        empl.add(emp2);
        empl.add(emp5);
        empl.add(emp3);
// foreach loop for Printing the list entered
        System.out.println("Printing the list as is ");
        for (Employee employee : empl) {
            System.out.println(employee);
        }
// sorting the list in order
        Collections.sort(empl);
// Printing the list after the sort
        System.out.println("\n" + "Printing the list after the sort");
        for (Employee employee : empl) {
            System.out.println(employee);
        }
// sorting using the salary Sorter
        Collections.sort(empl, new SalarySorter());
// Printing the list after sort using salary sorter
        System.out.println("\n" + "Printing the list after sort using salary sorter");
        for (Employee employee : empl) {
            System.out.println(employee);
        }
// sorting using name sorter
        Collections.sort(empl, new NameSorter());
// Printing the list after sort using name sorter
        System.out.println("\n" + "Printing the list after sort using name sorter");
        for (Employee employee : empl) {
            System.out.println(employee);
        }

    }

}
