package ioReview;

import java.io.*;

public class Review {

        public static void main(String[] args) throws IOException, ClassNotFoundException {

            FileWriter w = new FileWriter("/Users/newuser/Desktop/review.text", true);
            BufferedWriter bw = new BufferedWriter(w);
            bw.write("Object oriented programming!");
            bw.close();
            w.close();

            File f = new File("/Users/newuser/Desktop/review.text");

            if(f.exists() && f.canRead()) {
                FileReader r = new FileReader(f);
                BufferedReader b = new BufferedReader(r);
                System.out.println(b.readLine());

                b.close();
                r.close();
            }

            MyObject oo = new MyObject();

            FileOutputStream is = new FileOutputStream("/Users/newuser/Desktop/objects.text");
            ObjectOutputStream outStream = new ObjectOutputStream(is);
            outStream.writeObject(oo);

            outStream.close();
            is.close();


            File f2 = new File("/Users/newuser/Desktop/objects.text");

            MyObject mine = null;

            if(f2.exists() && f2.canRead()) {
                FileInputStream fis = new FileInputStream(f2);
                ObjectInputStream ois = new ObjectInputStream(fis);

                mine = (MyObject) ois.readObject();

                ois.close();
                fis.close();
            }
        }
    }


