package barrayList;

public class CollectionTester {

        public static void main(String[] args) {
            StringCollection collection = new StringCollection();
            collection.add("Pizza");
            collection.printArray();
            collection.add("Burger");
            collection.printArray();
            collection.add("Noodles");
            collection.printArray();
            collection.add("Pasta");
            collection.printArray();
            collection.add("Chicken");
            collection.printArray();
            collection.add("Sushi");
            collection.printArray();
            collection.add("Eggs");
            collection.printArray();
            collection.add("Shiro");
            collection.printArray();
            collection.add("Bread");
            collection.printArray();
            collection.add("Icecream");
            collection.printArray();
            collection.add("Rice");




            System.out.println("GET ELEMENT AT INDEX 8: " + collection.get(8));

        }
    }


