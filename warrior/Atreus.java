package warrior;

public class Atreus extends Warrior {

 
    private int InitHealth = 100;    // charater initial health
    private int InitStrength = 100;  // charater Initial strength

    private int MaxHealth = 100;      // charater max health
    private int MinHealth = 5;       // charater min health

    private int MaxStrength = 100;      // charater max health
    private int MinStrength = 5;       // charater min health
  
    private int GetHealth = 15;       // Increasing health by searching health points.
    private int GetStrength = 15;       // Increasing Strength 
    private int minDexterity = 70;

    int HealthFromEnemy = super.randNum.nextInt(25) + 10; 
    int healEffect = super.randNum.nextInt(GetHealth) + 10; 
  
    private String ability = "Escape";

   

    public Atreus(String son) {
        super(son);
        super.SetAbility(ability);

        // Health range 
        super.SetInitialHealth(InitHealth);
        // Strength range 
        super.SetInitialStrength(InitStrength);

        super.SetAtreusBattleHealth(super.randNum.nextInt(MaxHealth) + MinHealth);// Health range 
        super.SetAtreusBattleStrength(super.randNum.nextInt(MaxStrength) + MinStrength);// Strength range 
        super.SetDexterity(super.randNum.nextInt(super.statBonus) + minDexterity);
    } // contructor
    
    @Override // all about specialization!
    
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
