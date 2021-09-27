import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author rajnuz
 * @date 2021/9/26 22:35
 */
public class FileReader {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("E:\\project\\java-practice\\read this file.txt"),"UTF-8");
        Path currentDir = Paths.get(".");
        System.out.println(currentDir);
        System.out.println(in);
    }
}
