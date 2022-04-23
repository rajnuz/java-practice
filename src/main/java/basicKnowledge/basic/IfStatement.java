package basicKnowledge.basic;

/**
 * @author rajnuz
 * @date 2021/9/27 13:25
 */
public class IfStatement {
    public static void main(String[] args) {
        int age = 30;

        if (age>0 && age <12){
            System.out.println("child");
        }
        else if (age >12 && age <18){
            System.out.println("youth");
        }
        else{
            System.out.println("mature");
        };

    }
}
