package lab5One;

import lab5One.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetTest {

        static List<Pet> pets = new ArrayList<Pet>();

        public static void main(String[] args) {
            Pet p1 = new Pet("asdfa", 'c');
            Pet p2 = new Pet("podfi", 'd');
            Pet p3 = new Pet("xcvio", 'c');
            Pet p4 = new Pet("efbv", 'c');
            Pet p5 = new Pet("efv", 'd');

            pets.add(p1);
            pets.add(p2);
            pets.add(p3);
            pets.add(p4);
            pets.add(p5);

            for(Pet p : pets) {
                System.out.println(p);;
            }
        }
    }

