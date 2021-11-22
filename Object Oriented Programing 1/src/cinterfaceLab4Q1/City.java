package cinterfaceLab4Q1;

public class City implements Comparable<City>{
    private String cityName;
    private double temperature;

    public City() {
        this.cityName= "denver";
        this.temperature= 90;
    }
    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City city) {
        if(temperature==city.temperature) {
            return 0;
        }
        else if(temperature<city.temperature){
            return 1;
        }
        else {
            return -1;
        }

    }

}
