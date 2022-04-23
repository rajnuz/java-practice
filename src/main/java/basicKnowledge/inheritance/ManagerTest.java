package basicKnowledge.inheritance;

/**
 * this program demonstrates inheritance
 * @author rajnuz
 * @date 2021/11/25 23:23
 */
public class ManagerTest {
    public static void main(String[] args) {
        //construct a Manager
        Manager boss = new Manager("Carl", 80000,1987 ,12,15);
        boss.setBonus(5000);

        Employee[] staff = new Employee[3];
        staff[0] = boss;
        staff[1] = new Employee("Jack",50000,1990,1 ,1);
        staff[2] = new Employee("Tom",40000,1991,2,3);

        //employee可以是一个Employee对象，也可以是Employee的子类Manager
        //employee.getSalary()可以根据employee是Employee还是Manager，选择使用哪个getSalary()方法 ----》多态性的体现
        for (Employee employee:staff
             ) {
            System.out.println("name = " + employee.getName() + ", salary = " + employee.getSalary());
        }
    }
}
