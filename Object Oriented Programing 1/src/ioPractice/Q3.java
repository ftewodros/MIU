package ioPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        File f = new File("/Users/ftewodros/Desktop/Desktop/School/MIU Documents/CS 203/Q3.rtf");
        if(f.isFile()&& f.canRead()){
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                List<Double> str = new ArrayList<>();
                String s= null;
                //br.readLine();
                while((s=br.readLine())!=null){
                    str.add(Double.parseDouble(s));
                }
                br.close();
                fr.close();

                double sum= 0;
                double ave= 0;

                for (int i = 0; i < s.length(); i++) {
                    sum+=str.get(i);
                }
                ave= sum/s.length();

            }catch (Exception E){

            }
        }

    }
}
