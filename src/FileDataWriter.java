import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileDataWriter {


    public static void writeFile(String text, Path filePath) {
        try {
            Files.write(filePath,text.getBytes());
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static String readFile(Path filePath) {
        try{
            if (!Files.exists(filePath)) return "File does not exist.";

           return  Files.readString(filePath);

        } catch (IOException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

        return null;
    }

    public static void deleteFile (Path filePath) {
        try{
            Files.deleteIfExists(filePath);
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static String update(String text, Path filePath) {
        String data = FileDataWriter.readFile(filePath) +" " +text;

        FileDataWriter.writeFile(data, filePath);

        return FileDataWriter.readFile(filePath);

    }

    public static int wordCounter(Path filePath) {

        if (!Files.exists(filePath)) return 0;

        String data = FileDataWriter.readFile(filePath).trim();


            String[] words = data.split("\\W+");
      return words.length;
    }



}
