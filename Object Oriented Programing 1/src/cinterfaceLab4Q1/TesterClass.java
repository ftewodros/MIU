package cinterfaceLab4Q1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TesterClass {
    public static void main(String[] args) {

        City city = new City();
        City city2= new City();
        City city3=new City();

      City [] cities= {city,city2,city3};

       Arrays.sort(cities);
       for(City value: cities)
        System.out.println(value);
    }
}
