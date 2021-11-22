package ioLab6;

import java.io.*;
import java.util.ArrayList;

import java.util.List;

public class Q3 {

    public static void main(String[] args)  throws FileNotFoundException{

        File f = new File("/Users/ftewodros/Desktop/Desktop/School/MIU Documents/CS 203/Q3.rtf");
        if (f.isFile() && f.canRead()) {
            try {
                FileReader re = new FileReader(f);
                BufferedReader br = new BufferedReader(re);
                List<Double> values = new ArrayList<>();
                while (br.read() != -1) {
                    values.add(Double.valueOf(br.readLine()));
                }
                Double sum = 0.0;
                for(Double s: values)
                    sum += s;
                System.out.println(sum/values.size());
                br.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

//package Problem3;
//
//        import java.io.BufferedReader;
//        import java.io.File;
//        import java.io.FileNotFoundException;
//        import java.io.FileReader;
//        import java.io.IOException;
//        import java.util.*;
//
//public class Program3 {
//    public static void main(String[] args) throws IOException {
//        File f = new File("C:\\Users\\611041\\Desktop\\doubles.txt");
//
//        if(f.exists() && f.canRead()) {
//            FileReader reader = new FileReader(f);
//            BufferedReader br = new BufferedReader(reader);
//
//            List<Double> doubles = new ArrayList<Double>();
//
//            String s = "";
//
//            while((s = br.readLine()) != null) {
//                doubles.add(Double.parseDouble(s));
//            }
//
//            br.close();
//            reader.close();
//
//            double result = 0;
//
//            for(double d : doubles) {
//                result += d;
//            }
//
//            result /= doubles.size();
//
//            System.out.println(result);
//        }
//    }
//}
