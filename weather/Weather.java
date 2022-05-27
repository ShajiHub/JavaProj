package weather;

import java.util.Random;

public abstract class Weather {
    protected Random randNum = new Random();
    private String weather;
    private double temperature;
    private double precipitation;
    private int humidity;
    private String snowPack;


// constructor
    public Weather() {
    }// constructor 


//getters

    public String GetWeather() {
        return this.weather;
    }//GetWeather() 

    public double GetTemperature(){
        return this.temperature;
    }//GetTemperature()

    public String GetSnowPack(){
        return this.snowPack;
    }//GetSnowPack()

    public double GetHumidity(){
        return this.humidity;
    }//GetHumidity()

    public double GetPrecipitation(){
        return this.precipitation;
    }//GetPrecipitation()

    

 //setters        

    public void SetWeather(String weather) {
        this.weather =weather;
    } // SetWeather()

    public void SetTemperature(double temperature){
        this.temperature = Math.round(temperature);
    }//SetTemperature()

    public void SetSnowPack(String snow){
        this.snowPack = snow;
    }//SetSnowPack()

    public void SetHumidity(int humidity){
       this.humidity = humidity;
    }//SetHumidity()

    public void SetPrecipitation(String weather){
        if (weather== "Light rain"){
            this.precipitation  = randNum.nextInt(3);  // upto 3 mm
            }
            else if (weather== "Moderate Rain"){
              this.precipitation  = randNum.nextInt(7) + 3;  // upto 10 mm
                }
                else if (weather== "Heavy rain"){
                    this.precipitation  = randNum.nextInt(50) + 7;  // upto 50 mm
                     }
                    else if (weather== "Violent Rain"){
                       this.precipitation  = randNum.nextInt(80) + 50;  // more than 50 mm
                     }
        
    }//SetPrecipitation()

} // class