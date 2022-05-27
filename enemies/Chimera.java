package enemies;

public class Chimera extends Enemy {
    

  private String enemyName = "Chimera";


      private int InitHealth = 100;    // charater initial health
      private int InitStrength = 100;  // charater Initial strength
    
      private int MaxHealth = 100;      // charater max health
      private int MinHealth = 15;       // charater min health
    
      private int MaxStrength = 100;      // charater max health
      private int MinStrength = 20;       // charater min health
    
      private int GetHealth = 35;       // Increasing health by searching health points.
      private int GetStrength = 25;       // Increasing Strength 
      private int minDexterity = 50;
     
    
      int HealthFromWarrior = super.randNum.nextInt(40) + 10; 
      int healEffect = super.randNum.nextInt(GetHealth) + 10; 
    
    
      public Chimera(){
        super.SetEnemyName(enemyName);
            // Health range 
            super.SetEnemyInitialHealth(InitHealth);
             // Strength range 
            super.SetEnemyInitialStrength(InitStrength);
            
            super.SetEnemyBattleHealth(super.randNum.nextInt(MaxHealth) + MinHealth);// Health range 
            super.SetEnemyBattleStrength(super.randNum.nextInt(MaxStrength) + MinStrength);// Strength range 
            super.SetDexterity(super.randNum.nextInt(super.statBonus) + minDexterity);
        } // constructor
    
        @Override 
        
        public void HealEnemy() {
           
            super.BalanceHealth(healEffect); // after getting health how much to heal.
       
            System.out.println( healEffect + " Percent Healed!!!");
        }//HealEnemy()
    
        public void GetStrength() {
            this.GetStrength += healEffect;
        }
    
        public void IncreaseHealth() {// after killing warrior how much health get from them
            this.GetHealth += HealthFromWarrior;
        }
      }
