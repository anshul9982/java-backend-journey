package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteMyThoughts {
    public static void main(String[] args) {
        String fileName = "myThoughts.txt";
        String thoughts = "hey everyone! \n just testing out writer in java \n I hope it works fine.";
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))) {
            writer.println(thoughts);
            System.out.println("content successfully written to :" + fileName);
        } catch (IOException e) {
            System.out.println("error writing into file : " + e.getMessage());
            // TODO: handle exception
        }
        String line;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while ((line = reader.readLine())!=null) {
                System.out.println(line);
            }
            
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("error reading the file : " + fileName);
        }
    }

}
