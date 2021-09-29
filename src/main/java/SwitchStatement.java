import java.util.Scanner;

/**
 * @author rajnuz
 * @date 2021/9/27 21:04
 */
public class SwitchStatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an option (1,2,3,4)");
        int choice = in.nextInt();
        switch (choice){
            case    1:
                System.out.println("case 1");
                break;
            case    2:
                System.out.println("case 2");
                break;
            case    3:
                System.out.println("case 3");
                break;
            case    4:
                System.out.println("case 4");
                break;
            default:
                break;
        }
    }
}
