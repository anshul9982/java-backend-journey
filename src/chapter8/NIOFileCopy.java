package chapter8;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOFileCopy {
    public static void main(String[] args) {

        String sourceFilePath = "myImage.png";
        String destinationFilePath = "myImageNIO.png";

        Path sourcePath = Paths.get(sourceFilePath);
        Path destinatinPath = Paths.get(destinationFilePath);

        try (FileChannel sourceChannel = FileChannel.open(sourcePath, StandardOpenOption.CREATE);
                FileChannel destinationChannel = FileChannel.open(destinatinPath, StandardOpenOption.CREATE,
                        StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {

            ByteBuffer buffer = ByteBuffer.allocate(8192);

            int bytesRead;

            while ((bytesRead = sourceChannel.read(buffer)) != -1) {
                buffer.flip();

            

            while (buffer.hasRemaining()) {
                destinationChannel.write(buffer);

            }

            buffer.clear();
        }
        }catch(IOException e){
            System.err.println("error occured : " + e.getMessage());
            e.printStackTrace();
        }
    }

}
