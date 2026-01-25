package FileHanldling;

import java.io.*;

public class FileOutH1 {
    
    public static void main(String[] args) throws IOException {

        String s = "I am Asif Nawaz";

        // File h1 = new File("./FileHanldling/a.txt");
        // FileOutputStream f1 = new FileOutputStream(h1);


        FileOutputStream f1 = new FileOutputStream("./FileHanldling/a.txt",true);

        char c1[] = s.toCharArray();

        for (char c : c1) {
            f1.write(c);
        }
        
        f1.close();
    }



}
