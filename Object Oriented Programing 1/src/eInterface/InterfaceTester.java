package eInterface;

public class InterfaceTester {

        public static void main(String[] args) {
            ElectricCar c = new ElectricCar();
            GasCar c2 = new GasCar();

            CruiseControl[] ccs = {c, c2};

            for(CruiseControl cc : ccs) {
                System.out.println(cc.ccOn());
            }
        }
    }


