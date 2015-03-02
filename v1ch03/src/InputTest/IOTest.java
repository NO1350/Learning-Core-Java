package InputTest;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * User: Magnus
 * Date: 2015/3/2
 * Time: 18:03
 * To change this template use File | Settings | Editor |File and Code Templates.
 */
public class IOTest {
    public static void main(String[] args){
        try {
            //TODO debug NoSuchFileException
            Scanner in = new Scanner(Paths.get("myfile.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
