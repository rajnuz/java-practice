package basicKnowledge.basic;

import java.io.UnsupportedEncodingException;

/**
 * @date 8/19/2021 4:54 PM
 */
public class CharacterSetTest {


   private static byte[] gbkBytes= new byte[]{
            (byte)0x31,(byte)0x23,(byte)0xc0,(byte)0xe4,(byte)0xb6,(byte)0xb3,(byte)0xbb,(byte)0xfa,(byte)0xd7,(byte)0xe9,(byte)0xd6,(byte)0xc6,(byte)0xb1,(byte)0xf9
    };


   private static String UTF8decode(final byte[] bytes) throws UnsupportedEncodingException {
       return new String(bytes,"UTF-8");
   }

   private static String GBKdecode(final byte[] bytes) throws UnsupportedEncodingException{
       return new String(bytes,"GBK");
   }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String errorString = CharacterSetTest.UTF8decode(gbkBytes);
        System.out.println("GBK format but using UTF-8 decode will be:" + errorString);

        String trueString = CharacterSetTest.GBKdecode(gbkBytes);
        System.out.println("GBK format using GBK decode will be:" + trueString);

        String revertString =new String(errorString.getBytes("UTF-8"),"GBK");
        System.out.println("The revert String is: " + revertString);

//        byte[] truebs = new byte[14];
//        for (int i = 0; i <gbkBytes.length ; i++) {
//            truebs[i] = trueString.getBytes("GBK")[i];
//            System.out.println("truebs"+i+":" + truebs[i]);
//        }
//
//        byte[] errorbs = new byte[14];
//        for (int i = 0; i <gbkBytes.length ; i++) {
//            errorbs[i] = errorString.getBytes("UTF-8")[i];
//            System.out.println("errorbs"+i+":" + truebs[i]);
//        }

        StringBuffer solution =new StringBuffer();
        solution.append("Use UTF-8:" + errorString);
        solution.append(";");
        solution.append("Use GBK:" + trueString);
        String aggregateString = solution.toString();
        System.out.println("the aggregate string is:" + aggregateString);

//        System.out.println(errorString.getBytes(StandardCharsets.UTF_8));
    }


}
