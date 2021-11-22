package fInheritanceAndInterface;

public interface printName {

        public default String myName() {
            return "this is my name";
        }
        public static String myString(String name) {
            return "This is a static interface string and its name is: " + name;
        }
        public String name();
    }


