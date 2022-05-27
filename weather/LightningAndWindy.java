package weather;

public class LightningAndWindy extends Weather {
    String weather = "HeavyThunderStorm";
    double temperature = super.randNum.nextInt(22) + 10; 
    int humidity = super.randNum.nextInt(100) + 80; 
    public LightningAndWindy() {
        super.SetWeather(weather);
        super.SetTemperature(temperature);
        super.SetHumidity(humidity);
}
}




    
    