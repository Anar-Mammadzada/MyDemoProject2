/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileWriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Anar
 */
public class FileWriter {
    public static void writeIntoFile(String fileName, byte[]data)throws Exception{
        File file = new File(fileName);
        try(FileOutputStream fos = new FileOutputStream(file);){
        fos.write(data);
        fos.flush();
        }
    }
    
    public static byte[] readFromFile(String fileName)throws Exception{
        File file = new File(fileName);
        try(FileInputStream fis = new FileInputStream(file);){
        byte[] bytes = new byte[(int)file.length()];
        fis.read(bytes);
        return bytes;
        }
    }
}
