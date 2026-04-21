import java.nio.file.Path;
import java.nio.file.Paths;

public class Pathfinder {

    static void main(String...args){

        String fileLocation = "a/b/c";
        String file = "a/b/c/../e/f/ ";
        Path path1 = Paths.get(fileLocation);
        path1.normalize();
//        a => root directory, c => file
//        executors

        System.out.println(path1);
    }
}
