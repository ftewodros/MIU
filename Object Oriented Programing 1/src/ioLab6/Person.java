package ioLab6;

public class Person  implements Comparable<Person>{

        private String name;
        private int number;

        public String getName() {
            return name;
        }
        public int getNumber() {
            return number;
        }

        public Person(String name, int number) {
            super();
            this.name = name;
            this.number = number;
        }


        @Override
        public int compareTo(Person o) {
            return (number - o.getNumber())*-1;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", Number: " + number;
        }

    }


