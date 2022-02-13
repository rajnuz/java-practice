package pair2;

import pair1.Pair;

/**
 * @author rajnuz
 * @date 2022/2/13 17:57
 */
public class ArrayAlg {
    public static <T extends Comparable>Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T min = a[0];
        T max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }
            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }

        }
        return new Pair<>(min, max);
    }
}
