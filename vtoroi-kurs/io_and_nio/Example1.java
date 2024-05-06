package io_and_nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\Wind\\Desktop\\Новая папка (2)\\My photo - Дата (2).jpg");
             FileOutputStream outputStream = new FileOutputStream("Дата (2).jpg");)
        { int i;
            while ((i=inputStream.read())!=-1){
                outputStream.write(i);
            }
            System.out.println("Done!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
