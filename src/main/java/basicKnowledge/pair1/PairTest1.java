package basicKnowledge.pair1;

/**
 * @author rajnuz
 * @date 2022/2/13 17:19
 */
public class PairTest1 {
    public static void main(String[] args) {
        String[] words = {"Mary","had","lamb"};
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }
}
