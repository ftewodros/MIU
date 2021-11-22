package training4;

public class City implements Comparable<City>{
    private String cityName;
    private double temperature;

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

    public City() {
        this.cityName = "bolder";
        this.temperature = 78;
    }
    public City(String cityName, double temperature) {
        this.cityName = cityName;
        this.temperature = temperature;
    }

    @Override
    public int compareTo(City other) {
        if(this.temperature>other.temperature) {
            return 1;
        }
            if(this.temperature<other.temperature){
                return -1;
            }
            else {
                return 0;
            }
    }
}
