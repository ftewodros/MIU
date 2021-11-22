package ioReview;

import lab3.Contact;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReader {


        public static void write(List<Contact> contacts) {

            try {

                FileOutputStream f = new FileOutputStream(new File("contacts.txt"));
                ObjectOutputStream o = new ObjectOutputStream(f);

                for (Contact contactObj : contacts) {
                    // Write objects to file
                    o.writeObject(contactObj);
                }

                o.close();
                f.close();

            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("Error initializing stream");
            }
        }

        public static List<Contact> read() {
            List<Contact> objectsList = new ArrayList<>();

            try {
                FileInputStream fis = new FileInputStream("contacts.txt");
                ObjectInputStream objinput = new ObjectInputStream(fis);

                while (fis.available() != 0) {
                    Contact obj = (Contact) objinput.readObject();
                    if (obj != null) {
                        objectsList.add(obj);
                    }

                }
            } catch (Exception e) {
                System.out.println(e.toString());

            }
            return objectsList;

        }

        public static void main(String[] args) {
            write(null);
            read();
        }

    }


