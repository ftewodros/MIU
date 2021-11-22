package training4;

import java.util.Arrays;

public class CityTester {
    public static void main(String[] args) {
        City city1 = new City();
        City city2= new City();
        City city3 = new City();

        City [] cityList= {city1, city2,city3};
        Arrays.sort(cityList);

        for(City value: cityList) {
            System.out.println(value);
        }
    }
}
