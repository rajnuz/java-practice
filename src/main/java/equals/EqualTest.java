package equals;

/**
 * @author rajnuz
 * @date 2021/12/7 23:19
 */
public class EqualTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice", 75000, 1989,10,20);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice", 75000,1989,10,20);
        Employee bob = new Employee("bob",50000,1989,10,10);

        System.out.println("alice1 == alice2: " + (alice1==alice2));
        System.out.println("alice1 == alice3: " + (alice1==alice3));

        System.out.println("alice1.equals(alice3):" + alice1.equals(alice3));

        System.out.println("alice1.equals(bob)" + alice1.equals(bob));

        Manager carl =  new Manager("carl",80000,1982,10,1);
        Manager boss =  new Manager("carl",80000,1982,10,1);//同样的参数，不同名
        boss.setBonus(5000);

        System.out.println("boss.toString(): " + boss );
        System.out.println("carl.equals(boss): "+ carl.equals(boss));

        System.out.println("alice1.hashCode(): "+ alice1.hashCode());
        System.out.println("alice3.hashCode(): "+ alice3.hashCode());
        System.out.println("bob.hashCode(): "+ bob.hashCode());
        System.out.println("carl.hashCode(): " + carl.hashCode());


    }
}
