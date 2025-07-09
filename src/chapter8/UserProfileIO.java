package chapter8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserProfileIO {
    public static void main(String[] args) {
        String username = "javamaster";
        int age = 18;
        double height = 178.5;
        boolean isOnline = true;

        String fileName = "user_profile.dat";
        
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {

            dos.writeUTF(username);
            dos.writeInt(age);
            dos.writeDouble(height);
            dos.writeBoolean(isOnline);

            System.out.println("data successfully written into the file : " + fileName);

            
        } catch (IOException e) {
            System.out.println("error writting data : " + e.getMessage());
            e.printStackTrace();
        }

        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            System.out.println("username : " + in.readUTF());
            System.out.println("age : " +in.readInt());
            System.out.println("height : " +in.readDouble());
            System.out.println("online : " +in.readBoolean());
            
        } catch (IOException e) {
            System.err.println("error reading from the file: " + e.getMessage() );
            e.printStackTrace();
        }
    }

}
