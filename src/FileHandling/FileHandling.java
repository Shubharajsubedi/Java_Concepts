package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHandling {
    static void main(String[] args) {
        Path path = Paths.get("message.txt");
        try{
            Files.writeString(path,
                    "Hello! Good morning champ\n",
                    StandardOpenOption.CREATE
                    );
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        int[] numbers = new int[5];
        try{
            System.out.println(numbers[7]);
        } catch (Exception e) {
            System.out.println("size of the array is smaller");
        }finally {
            System.out.println("finally always runs");
        }
    }
}
