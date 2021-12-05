package abstractClasses;

/**
 * @date 12/5/2021 10:10 PM
 */
public class PersonTest {
    public static void main(String[] args) {
        Person[] people = new Person[2];

        people[0] = new Employee("Tom",50000,1990,10,1);//抽象类不能被 new实例化
        people[1] = new Student("Maria","Computer Science");

        for (Person p: people
             ) {
            System.out.println(p.getName() + ", " + p.getDescription());
        }
    }
}
