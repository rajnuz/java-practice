package basicKnowledge.customizedCLassPractise;

/**
 * @author rajnuz
 * @date 2021/11/22 22:01
 */
public class CallByTest {

    public static void tripleValue(int x){
        x = x*3;
    }

    public static int AnotherTripleValue(int y){
        y =  y*3;
        return y;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 3;
        tripleValue(x);//x 没有改变
        y = AnotherTripleValue(y);
        System.out.println("x=" + x );
        System.out.println("y=" + y);
    }
}
