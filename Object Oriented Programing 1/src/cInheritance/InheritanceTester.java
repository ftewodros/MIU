package cInheritance;

public class InheritanceTester {

        public static void main(String[] args) {
            Car myCar = new Car();
            GasCar gc = new GasCar("Ford", "F-150", 1989, 60);
            Electric c = new Electric("Tesla", "Model 3", 1988, 400);
            //System.out.println(c.make);
            //System.out.println(gc);
            //System.out.println(c);

            Car[] cars = {gc, c};

            for(Car i : cars) {
                System.out.println(i.fillCost(2.99));
            }
        }
    }


