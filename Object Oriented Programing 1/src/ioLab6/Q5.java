package ioLab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {

        public static void main(String[] args) throws IOException {
            File f = new File("C:\\Users\\611041\\Desktop\\WordBuff.txt");
            if(f.exists() && f.canRead()) {
                FileReader reader = new FileReader(f);
                BufferedReader br = new BufferedReader(reader);

                String[] arr = br.readLine().split(", ");

                br.close();
                reader.close();

                int res = 0;
                for(String s : arr) {
                    res += isPalindrome(s);
                }
                System.out.println(res);
            }
        }


        public static int isPalindrome(String s) {
            String rev = new StringBuffer().append(s).reverse().toString();
            if(s.equals(rev)) return 1;
            return 0;
        }
    }


