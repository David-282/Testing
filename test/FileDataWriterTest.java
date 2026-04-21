import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class FileDataWriterTest {

    @Test
    void writeFile() {

        try{
            String fileLocation = "/home/semi/IdeaProjects/Testing/src/output/1/number.txt";
            Path path = Paths.get(fileLocation);
            String text = "Hello Worldddd";
            FileDataWriter.writeFile(text,path);
            String dataReadFromFile = Files.readString(path);
            assertEquals(text,dataReadFromFile);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Test
    void readFile() {
        String fileLocation = "/home/semi/IdeaProjects/Testing/src/output/1/number.txt";
        Path path = Paths.get(fileLocation);

        String data = FileDataWriter.readFile(path);

        assertEquals(data,"Hello World");

}

    @Test
    void delete(){
        String fileLocation = "/home/semi/IdeaProjects/Testing/src/output/1/password.txt";
        Path path = Paths.get(fileLocation);

        FileDataWriter.deleteFile(path);

        assertFalse(Files.exists(path));
    }

    @Test
    void update(){
        String newText = " We go again";
        String fileLocation = "/home/semi/IdeaProjects/Testing/src/output/1/number.txt";
        Path path = Paths.get(fileLocation);
//        String oldFile = FileDataWriter.readFile(path);
        String updatedFile = FileDataWriter.update(newText,path);
        String newFile = FileDataWriter.readFile(path);

        assertEquals(updatedFile,newFile);

    }

    @Test
    void countWords(){
        String fileLocation = "/home/semi/Downloads/document.txt";
        Path path = Paths.get(fileLocation);

        int number = FileDataWriter.wordCounter(path);

        assertEquals(6770,number);



    }
}