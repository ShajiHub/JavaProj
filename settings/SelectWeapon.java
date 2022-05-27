package settings;
import java.util.Random;

public class SelectWeapon {
    private Random randNum = new Random();

    private String[] weaponTypes = {"Axe","Shield", "Spear", "Sword", "TalonBow"};

   public SelectWeapon(){};

    public String GetWeapon() {
        
        String getWeapon = weaponTypes[randNum.nextInt(weaponTypes.length)];
     
        return getWeapon;
    }
    
    public String GetAtreusWeapon() {
        
        String getWeapon = "TalonBow";
     
        return getWeapon;
    }
}
