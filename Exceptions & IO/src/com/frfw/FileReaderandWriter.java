package com.frfw;
import java.io.*;

public class FileReaderandWriter {
    public static void main(String args[]) {
        try
        {
           BufferedReader fr = new BufferedReader(new FileReader("original.txt"));
            BufferedWriter fw = new BufferedWriter(new FileWriter("copie.txt"));

            String k;
            while( ( k = fr.readLine())!=null )
            {
                fw.write(k);
                System.out.print(k);
            }
            fw.close();
            fr.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File does not exist. " + e);
        }
        catch(IOException e)
        {
            System.out.println("Some I/O problem. " + e);
        }
    }
    }


