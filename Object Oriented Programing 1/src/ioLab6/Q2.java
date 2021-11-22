package ioLab6;

import java.io.*;
import java.util.Arrays;

public class Q2 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("/Users/ftewodros/Desktop/Desktop/School/MIU Documents/CS 203/My files/feviNumbers.rtf");
        if (f.canRead() && f.isFile()) {
            try {
                int count = 0;
                FileReader pr = new FileReader(f);
                BufferedReader bf = new BufferedReader(pr);
                while (bf.read() != -1) {
                    String[] list = bf.readLine().split(" ");
                    for(int i=0;i< list.length; i++){
                        if(list[i].equals("10")){
                            count++;
                        }
                    }
                }
                System.out.println(count);
                bf.close();
                pr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
//package Problem2;
//
//        import java.io.BufferedReader;
//        import java.io.File;
//        import java.io.FileNotFoundException;
//        import java.io.FileReader;
//        import java.io.IOException;
//
//public class Program2 {
//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\611041\\Desktop\\tens.txt");
//        if(f.exists() && f.canRead()) {
//            FileReader reader = new FileReader(f);
//            BufferedReader br = new BufferedReader(reader);
//
//            String[] res = br.readLine().split(" ");
//
//            br.close();
//            reader.close();
//
//            int result = 0;
//
//            for(String s : res) {
//                if(s.equals("10")) result++;
//            }
//
//            System.out.println(result);
//        }
//    }
//}
