package weather;

public class Rain extends Weather{
    private String[] rainTypes = {"Light rain","Moderate Rain", "Heavy rain", "Violent Rain"};
    double temperature = super.randNum.nextInt(25) + 10; 
    int humidity = super.randNum.nextInt(100) + 70; 
    double  precipitation;

    public Rain() {
        String weather = rainTypes[randNum.nextInt(rainTypes.length)];
        super.SetWeather(weather);
        super.SetTemperature(temperature);
        super.SetPrecipitation(weather);
        super.SetHumidity(humidity);
    }
}





    