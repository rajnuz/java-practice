/**
 * @author rajnuz
 * @date 2021/9/29 15:13
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
            System.out.println(a[i]);
        }
        System.out.println(a.length);

    }
}
