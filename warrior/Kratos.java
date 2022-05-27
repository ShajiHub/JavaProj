
package warrior;

public class Kratos extends Warrior {
    
    private int InitHealth = 100;    // charater initial health
    private int InitStrength = 100;  // charater Initial strength

    private int MaxHealth = 100;      // charater max health
    private int MinHealth = 15;       // charater min health

    private int MaxStrength = 100;      // charater max health
    private int MinStrength = 20;       // charater min health
    
  
    private int GetHealth = 25;       // Increasing health by searching health points.
    private int GetStrength = 25;       // Increasing Strength 
    private int minDexterity = 80; //Dexterity
    private String ability = "HitStrong"; 
  
    int HealthFromEnemy = super.randNum.nextInt(40) + 10; 
    int healEffect = super.randNum.nextInt(GetHealth) + 10; 


    public Kratos(String sparton) {
        super(sparton);
        // Health range 
        super.SetInitialHealth(InitHealth);
         // Strength range 
        super.SetInitialStrength(InitStrength);
        super.SetAbility(ability);
        
        super.SetKratosBattleHealth(super.randNum.nextInt(MaxHealth) + MinHealth);// Health range
        super.SetKratosBattleStrength(super.randNum.nextInt(MaxStrength) + MinStrength);// Strength range
        super.SetDexterity(super.randNum.nextInt(super.statBonus) + minDexterity);
    } // constructor

    @Override 
    
    public void HealWarriors() {
       
        super.BalanceHealth(healEffect); // after getting health how much to heal.
   
        System.out.println( healEffect + " Percent Healed!!!");
    }//HealKratos()

    public void GetStrength() {
        this.GetStrength += healEffect;
    }

    public void IncreaseHealth() {// after killing warrior how much health get from them
        this.GetHealth += HealthFromEnemy;
    }

} // class
