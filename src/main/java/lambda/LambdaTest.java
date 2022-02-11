package lambda;

import java.util.Arrays;

/**
 * @author rajnuz
 * @date 2022/2/11 16:09
 */
public class LambdaTest {
    public static void main(String[] args) {
        String[] planets = new String[] {"Mercury","Venus","Earth","Mars"};
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order: ");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length: ");
        Arrays.sort(planets,(first,second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
    }
}
