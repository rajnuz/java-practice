package arrayList;

import equals.Employee;

import java.util.ArrayList;

/**
 * @author rajnuz
 * @date 2021/12/19 23:47
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Employee> staff = new ArrayList<>();

        staff.add(new Employee("Carl",75000,1987,10,1));
        staff.add(new Employee("Harry Hacker",50000,1989,10,2));
        staff.add(new Employee("Tony",80000,1988,10,3));

        for (Employee e:staff
             ) {
            e.raiseSalary(5);
        }

        for (Employee e :staff
             ) {
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() +", hireDay = " + e.getHireDay());
        }
    }
}
