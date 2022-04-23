package basicKnowledge.basic;

/**
 * @date 8/4/2021 10:36 PM
 */
public class DataType {

    public static void printInMain(double x, int z){
        int y =(int)x;
        System.out.println(y);

        z += 3.5;
        System.out.println(z);
    }

    public static void printString(String s){
        String subS = s.substring(1,3);
        System.out.println(subS);
    }

    public static boolean verifyString (String s1 ){
        String s2 = s1;
        System.out.println(s2.substring(1)==s1.substring(1));
        System.out.println("\uffff");
        return s2 == s1;

    }

}
