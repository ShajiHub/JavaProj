package magic;


import java.util.Random;


public abstract class MagicMain {
    protected Random randNum = new Random();

    private String magic;
    private double magicEffect;


// constructor
    public MagicMain() {
    }// constructor 


//getters

    public String GetMagic() {
        return this.magic;
    }//GetWeather() 


    public double GetMagicEffect() {
        return this.magicEffect;
    }//GetWeather() 

 //setters        

 public void SetMagic(String magicType) {
        this.magic = magicType;
    }//SetMagic() 


    public void SetMagicEffect(String magic){
        if (magic== "FireOfAres"){
            this.magicEffect  = randNum.nextInt(5) + 1;  // upto 5 hits
            }
            else if (magic== "IceOfPoseidon"){
              this.magicEffect = randNum.nextInt(15) + 5;  // upto 19 hits
                }
                else if (magic== "LightningOfZeus"){
                    this.magicEffect  = randNum.nextInt(20) + 15;  // upto 50 mm
                     }
                    else if (magic== "SoulOfHades"){
                       this.magicEffect  = randNum.nextInt(40) + 30;  // more than 50 mm
                     }
        
    }//SetMagic()

} // class