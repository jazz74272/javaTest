package readFile.File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderExample {

    public static void main(String args[]) {
        try {
            //opening file for reading in Java
            FileInputStream file = new FileInputStream("/home/consultadd/work/myfile.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
          
            //reading file content line by line
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
                  
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
        	 System.out.println(ex);        }
    }
}
