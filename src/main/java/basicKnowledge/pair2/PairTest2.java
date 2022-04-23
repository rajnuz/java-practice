package basicKnowledge.pair2;

import basicKnowledge.pair1.Pair;

import java.time.LocalDate;

/**
 * @author rajnuz
 * @date 2022/2/13 18:00
 */
public class PairTest2 {
    public static void main(String[] args) {
        LocalDate[] birthdays = {LocalDate.of(1991,12,13),LocalDate.of(1991,10,13)};
        Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
        System.out.println("min = " +mm.getFirst());
        System.out.println("max = " + mm.getSecond());
    }

}
