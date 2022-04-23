package basicKnowledge.customizedCLassPractise;

/**
 * @author rajnuz
 * @date 2021/11/22 22:13
 */
public class ParamTest {
    public static void main(String[] args) {
        Employee harry = new Employee("harry",5000,1987,10,12);
        tripleSalary(harry);
        System.out.println("harry's salary is " + harry.getSalary());


        Employee a =new Employee("Tom",5000,1987,10,12);
        Employee b = new Employee("James",5000,1987,10,12);
        System.out.println("Before: a is " + a.getName());
        System.out.println("Before: b is " + b.getName());
        swap(a,b);
        System.out.println("After: a is" + a.getName());
        System.out.println("After: b is" + b.getName());
    }

    private static void tripleSalary(Employee x) {
        x.raiseSalary(200);
    }

    private static void swap(Employee x, Employee y){
        Employee temp = x;
        x=y;
        y=temp;
        System.out.println("x is" + x.getName());
        System.out.println("y is" + y.getName());
    }
}
