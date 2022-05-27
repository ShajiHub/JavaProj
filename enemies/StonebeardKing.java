package enemies;

public class StonebeardKing extends Enemy {

    private String enemyName = "StonebeardKing";

   
    

        private int InitHealth = 100;    // charater initial health
        private int InitStrength = 100;  // charater Initial strength
      
        private int MaxHealth = 150;      // charater max health
        private int MinHealth = 15;       // charater min health
      
        private int MaxStrength = 100;      // charater max health
        private int MinStrength = 20;       // charater min health
      
        private int GetHealth = 80;       // Increasing health by searching health points.
        private int GetStrength = 25;       // Increasing Strength 
        private int minDexterity = 80;
      
        int HealthFromWarrior = super.randNum.nextInt(40) + 10; 
        int healEffect = super.randNum.nextInt(GetHealth) + 10; 
      
      
      
        public StonebeardKing(){
          super.SetEnemyName(enemyName);
              // Health range : 15 to 100 
              super.SetEnemyInitialHealth(InitHealth);
               // Strength range : 10 to 100 
              super.SetEnemyInitialStrength(InitStrength);
              
              super.SetEnemyBattleHealth(super.randNum.nextInt(MaxHealth) + MinHealth);
              super.SetEnemyBattleStrength(super.randNum.nextInt(MaxStrength) + MinStrength);
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