package lab5Two;

import lab5Three.Manager;

public class CompositionTest {

        public static void main(String[] args) {
            Manager m = new Manager(34, "Jovo", "IT", 50, "Manager");
            Manager m2 = new Manager(34, "Jovo", "IT", 50, "Manager");
            System.out.println(m.equals(m2));
        }
    }


