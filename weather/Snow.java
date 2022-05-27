package weather;

public class Snow extends Weather{
    private String[] weatherTypes = {"Heavy snow","Snow flurry", "snow squall", "snow burst", "blowing snow"};
    private String[] snowpack = {"New snow", "firn", "old snow", "powder snow"};
    int min = -40;  
    int max = -3; 
  
   double temperature = Math.random()*(max-min+1)+min;  
 int humidity = super.randNum.nextInt(40) + 30;
    public Snow() {
        String weather = weatherTypes[randNum.nextInt(weatherTypes.length)];
        super.SetWeather(weather);

        super.SetTemperature(temperature);

        String snow = snowpack[randNum.nextInt(snowpack.length)];
        super.SetSnowPack(snow);

        super.SetHumidity(humidity);
}
}


    
       

       
        