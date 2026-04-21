import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCreator {

    static void main(String []args){
       try{
        String directory = "/home/semi/IdeaProjects/Testing/src/output";
//       1.

        Path path = Path.of(directory, "1","number.txt");
           System.out.println("FilePath:: "+path);

//        2.

//        Files.createDirectories(path);
           if(Files.notExists(path)) {
               Files.createFile(path);
           }
       } catch (IOException e){
           System.err.println(e.getMessage());
           e.printStackTrace();
       }

    }
}
