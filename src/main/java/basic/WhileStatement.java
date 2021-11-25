package basic;

/**
 * @author rajnuz
 * @date 2021/9/27 13:31
 */
public class WhileStatement {
    public static void main(String[] args) {
        int age =0;
        int currentAge = 0;
        while(age <= 12){
             currentAge = age;
             age ++;
        }

        System.out.println("finally u are " + currentAge + " now");
    }
}
