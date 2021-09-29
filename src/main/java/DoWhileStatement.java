/**
 * @author rajnuz
 * @date 2021/9/27 13:37
 */
public class DoWhileStatement {
    public static void main(String[] args) {
        int age =0;
        do {
            age++;
            System.out.println("in do statement: " + age );
        }
        while (age<5);
        System.out.println(age);
    }
}
