package com.finfout;

import java.io.*;

public class FileInputandOutput {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream("D:/Proiecte/Google Atelierul Digital/Exceptions & IO/src/com/finfout/input.txt"));
            outputStream =new BufferedOutputStream(new FileOutputStream("D:/Proiecte/Google Atelierul Digital/Exceptions & IO/src/com/finfout/output.txt"));

            int c = inputStream.read();
            while (c != -1) {
                outputStream.write(c);
                c = inputStream.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                inputStream.close();
            outputStream.close();

        }
    }
}
