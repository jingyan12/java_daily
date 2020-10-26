package day07;

import java.io.*;

/**
 * @ClassName FileCopyDemo
 * @Description TODO
 * @Author lenovo
 * @Date 2020/10/26
 **/

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        File inputFile =new File("/E:/logo1.png");
        InputStream is =new FileInputStream(inputFile);
        byte[]b =new byte[(int) inputFile.length()];
        is.read(b);
        File outputFile =new File("/E:/logo2.png");
        OutputStream os=new FileOutputStream(outputFile);
        os.write(b);
        is.close();
        os.close();
    }
}
