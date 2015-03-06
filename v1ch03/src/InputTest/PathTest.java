package InputTest;

import java.nio.file.FileSystems;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Intellij IDEA.
 * User: Magnus
 * Date: 2015/3/3
 * Time: 16:01
 * To change this template use File | Settings | Editor |File and Code Templates.
 */
public class PathTest {
    public static void main(String[] args){
        Path path = FileSystems.getDefault().getPath("ddd.txt");
        System.out.println();
        System.out.println("toString: " + path.toString());
        System.out.printf("getFileName: %s\n", path.getFileName());
        System.out.printf("getRoot: %s\n", path.getRoot());
        System.out.printf("getNameCount: %d\n", path.getNameCount());

        for (int index = 0; index < path.getNameCount(); index++) {
            System.out.printf("getName(%d): %s\n", index, path.getName(index));
        }

        //System.out.printf("subpath(0,2): %s\n", path.subpath(0, 2));
        System.out.printf("getParent: %s\n", path.getParent());
        System.out.println(path.isAbsolute());

        try {
            path = Paths.get("Home", "projects", "users.txt");
            System.out.printf("Absolute path: %s", path.toAbsolutePath());
        } catch (InvalidPathException ex) {
            System.out.printf("Bad path: [%s] at position %s", ex.getInput(), ex.getIndex());
        }
    }
}
