package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
    public static void main(String[] args) {
        String myImage = "myImage.png";
        String copiedImage = "copiedImage.png";

        try (FileInputStream in = new FileInputStream(myImage); FileOutputStream out = new FileOutputStream(copiedImage)) {

            byte buffer[] = new byte[8192];
            int bytesRead;
            System.out.println("copying image from :" + myImage + " to : " + copiedImage);
            while ((bytesRead = in.read(buffer))!=-1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("file copied successfully!");
            
        } catch (IOException e) {
            System.err.println("error reading the file : " + e.getMessage());
        }
    }

}
