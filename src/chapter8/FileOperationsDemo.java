package chapter8;

import java.io.File;
import java.io.IOException;

public class FileOperationsDemo {
    public static void main(String[] args) throws IOException {
        String fileDemo = "myFile.txt";
        String directoryDemo = "myDirectory";
        File myFile = new File(fileDemo);
        File myDirectory = new File(directoryDemo);

        if (!myFile.exists()) {
            myFile.createNewFile();
            System.out.println("New File with name : " + myFile.getName()+ " created");
        }
        else{
            System.out.println("File with name: " + myFile.getName() + " already exists! at" + myFile.getAbsolutePath());
        }

        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println(myFile.length());

        if (!myDirectory.exists()) {
            myDirectory.mkdir();
            System.out.println("New Directory with name : "+ myDirectory.getName() + " created");
            
        }
        else{
            System.out.println("Directory with name : " + myDirectory.getName() + " already exists or could not be created! ");
        }

        System.out.println(myDirectory.getAbsolutePath());
        File myParentDirectory = new File(".");
        String[] files = myParentDirectory.list();
        if (files != null) {
            for (String file : files) {
                System.out.println("--" + file);
                
            }
            
        }

        myFile.delete();
        myDirectory.delete();
    }

}
