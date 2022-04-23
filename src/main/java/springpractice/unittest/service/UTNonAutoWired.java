package springpractice.unittest.service;

/**
 * @date 4/23/2022 4:00 PM
 */
public class UTNonAutoWired {

    private Integer a;

    private Integer b;

    public UTNonAutoWired(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public int minus() {
        return a - b;
    }
}
