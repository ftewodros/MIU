package ioLab6;

import java.io.*;
import java.util.Scanner;

public class Q4 {

        public static void main(String[] args) throws IOException {
            Scanner s = new Scanner(System.in);

            String adviceString = "";

            File f = new File("C:\\Users\\611041\\Desktop\\advice.txt");
            if(f.exists() && f.canRead()) {
                FileReader reader = new FileReader(f);
                BufferedReader br = new BufferedReader(reader);

                String temp;
                while((temp = br.readLine()) != null) {
                    adviceString += "\n" + temp;
                }
                br.close();
                reader.close();
            }

            System.out.println("Programming advice of the day: \n" + adviceString + "\n" + "Enter your own advice: ");

            int blanks = 0;
            String res = "";
            String in = s.nextLine();

            FileWriter writer = new FileWriter(f);
            BufferedWriter buff = new BufferedWriter(writer);

            buff.write(in);

            buff.close();
            writer.close();
        }
    }


