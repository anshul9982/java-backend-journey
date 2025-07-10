package chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NIO20OperationsDemo {
public static void main(String[] args) {
    

    Path file1 = Paths.get("NIO2_my_notes.txt");
    Path dir = Paths.get("NIO2_reports");
    Path p1 = Paths.get("NIO2_reports", "daily_log.txt");
    Path file2 = Paths.get("NIO2_my_notes_backup.txt");

    try {
        if (Files.notExists(file1)) {
            Files.createFile(file1);
            System.out.println("file created : " + file1.getFileName());
        }
        else{
            System.out.println("the file: " + file1.getFileName() + "already exists");
        }

        Files.writeString(file1, "java backend journey");
        System.out.println("content written into : " + file1.getFileName());

        String content = Files.readString(file1);
        System.out.println(content);

        if (Files.notExists(dir)) {
            Files.createDirectories(dir);
            System.out.println("directory created: " + dir.getFileName());
        }

        else{
            System.out.println("the directory "+dir.getFileName()+ " already exists");
        }

        Files.createFile(p1);
        Files.copy(file1, file2, StandardCopyOption.REPLACE_EXISTING);

        System.out.println("File "+file2.getFileName()+" exists : "+Files.exists(file2));
        System.out.println(Files.size(file2));

        Files.delete(file1);
        Files.deleteIfExists(p1);
        Files.delete(file2);
        Files.delete(dir);


    } catch (IOException e) {
        System.err.println("error in NIO operation : " + e.getMessage());
        e.printStackTrace();
    }

    
}
}
