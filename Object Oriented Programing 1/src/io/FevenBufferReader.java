package io;

import java.io.*;
import java.nio.CharBuffer;

public class FevenBufferReader {


    public static void main(String[] args) {
        String[] names= {"sam, cam, jef"};
        try {
            File f = new File("/Users/ftewodros/Desktop/Desktop/School/MIU Documents/CS 203/CS 203/sam.txt");
            FileReader read = new FileReader(f);
            BufferedReader bf = new BufferedReader(read);
            String foo = bf.readLine();
            while(bf.read() != -1){
                System.out.println(bf.readLine());
            }

            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
