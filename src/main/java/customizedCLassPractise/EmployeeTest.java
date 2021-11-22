package customizedCLassPractise;

/**
 * @author rajnuz
 * @date 2021/11/21 22:17
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[2];
        staff[0] = new Employee("Carl",75000,1987,12,15);
        staff[1] = new Employee("tom",75000,1982,1,15);

        for (Employee e : staff){
            e.raiseSalary(5);
        }


        for (Employee e:staff
             ) {
            System.out.println("name=" + e.getName()+ ", salary = " + e.getSalary() + ",hireDay = " + e.getHireDay());
        }

        System.out.println("staff0 's nextID = " + staff[0].getNextId());
        System.out.println("staff1 's nextID = " + staff[1].getNextId());
        System.out.println("使用静态方法nextId=" + Employee.anotherGetNextId());//静态方法不需要实例对象
    }
}
