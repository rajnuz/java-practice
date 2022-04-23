package basicKnowledge.basic;

/**
 * @author rajnuz
 * @date 2021/9/29 15:17
 */
public class ForEachTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }

        for (int n:a
             ) {
            n ++;
            System.out.println(n);
        }
    }
}
