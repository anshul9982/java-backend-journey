package chapter8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadMyStory {
    public static void main(String[] args) {
        String fileName = "myStory.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from " + fileName +" :");
            while ((line = reader.readLine())!= null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            System.out.println("error reading the file : " + fileName + " " + e.getMessage());

            // TODO: handle exception
        }
    }
}
