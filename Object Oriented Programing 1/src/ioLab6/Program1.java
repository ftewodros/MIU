package ioLab6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Program1 {

        public static void main(String[] args) {

            Person[] boys = people(new File("C:\\Users\\611041\\Desktop\\boynames.txt"));
            Person[] girls = people(new File("C:\\Users\\611041\\Desktop\\girlnames.txt"));

            Arrays.sort(boys);
            Arrays.sort(girls);


            int ranking = findRanking("Gabriel", boys);
            System.out.println(ranking);
        }


        public static int findRanking(String name, Person[] peeps) {
            for(int i = 0; i < peeps.length; i++) {
                if(peeps[i].getName().equals(name))
                    return i;
            }
            return -1;
        }

        public static Person[] people(File f) {
            Person[] boys = {};
            if(f.exists() && f.canRead()) {
                try {
                    FileReader reader = new FileReader(f);
                    BufferedReader br = new BufferedReader(reader);

                    Object[] o = br.lines().toArray();
                    boys = new Person[o.length];

                    for(int i = 0; i < o.length; i++) {
                        String s = (String) o[i];
                        String[] split = s.split("Luna");
                        Person p = new Person(split[0], Integer.parseInt(split[1]));
                        boys[i] = p;
                    }
                    br.close();
                    reader.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return boys;

        }

    }


