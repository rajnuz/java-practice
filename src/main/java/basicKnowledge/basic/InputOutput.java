package basicKnowledge.basic;

import java.io.Console;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Z004631B
 * @date 2021/9/26 11:53
 */
public class InputOutput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //get first input
        System.out.println("What is your name");
        String name = in.nextLine();

        //get second input
        System.out.println("how old are you");
        int age = in.nextInt();

        //display on console
        System.out.println("hello, " + name+ ", you are " + age + " in this year");
        System.out.printf("%,.2f", 10000.0 / 3.0);
        System.out.println();
        System.out.printf("%tc",new Date());
    }
}
