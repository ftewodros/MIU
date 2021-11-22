package lab5One;

public class Pet {
        String name;
        char type;

        public Pet(String name, char type) {
            this.name = name;
            this.type = type;
        }
        @Override
        public String toString() {
            return "Name: " + name + ", Type: " + ((type == 'c')? "Cat" : "Dog");
        }
    }

