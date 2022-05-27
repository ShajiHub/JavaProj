package weather;

public class Sunny extends Weather{
    String weather = "Sunny";
    double temperature = super.randNum.nextInt(45) + 30; 
    int humidity = super.randNum.nextInt(55) + 40; 
    public Sunny() {
        super.SetWeather(weather);
        super.SetTemperature(temperature);
        super.SetHumidity(humidity);
    }
}
