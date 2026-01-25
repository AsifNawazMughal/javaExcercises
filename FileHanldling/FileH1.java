package FileHanldling;

import java.io.*;
class FileH1 {
    public static void main(String[] args) throws IOException {
        System.out.println("File Handling Example");
        File f1 = new File("a.txt");
            //   
        f1.createNewFile();


        System.out.println(f1.exists());
        System.out.println(f1.canWrite());
        System.out.println(f1.length());  

        

    }=
}