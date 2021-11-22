package io;

import java.io.*;

public class FevenBufferWriter {


    public static void main(String[] args) throws IOException {
        String[] names= {"john, jill, james"};
        FileWriter fos = new  FileWriter("sam.txt");
       // PrintWriter my= new PrintWriter(fos);
        BufferedWriter me = new BufferedWriter(fos);

        me.write("whats my name");
        me.write("\nits inevitable");
        for(String value: names)
        me.write("\n"+ value);

        me.close();
        names.clone();

    }
}
