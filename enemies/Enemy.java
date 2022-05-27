package enemies;
import java.util.Random;

public abstract class Enemy {
    protected Random randNum = new Random();

    protected int statBonus = 30;
    private String enemyName;
    private int InitEnemyHealth;
    private int InitEnemyStrength;
    private String ability;
   
    
        private int Enemyhealth; // hit points
        private int Enemystrength; // damage bonus
        protected int dexterity; // increase hit chance
        protected int damageMultiplier = 1;
    
    // constructor
    public Enemy() {
      
    }// constructor 
    
 
        public Enemy(String name) {
            this.enemyName = name;
        }
    
    
    //getters
    
    //name 
    
        public String GetEnemyName() {
            return this.enemyName;
        } // GetEnemyName()
     
           
    //Health 
    
        public int GetEnemyBattleHealth() {
            return this.Enemyhealth;
        }
      
        public int GetEnemyInitialHealth() {
            return this.InitEnemyHealth;
        }
    //Strength
    
        public int GetEnemyBattleStrength() {
            return this.Enemystrength;
        }
    
        public int GetEnemyInitialStrength() {
            return this.InitEnemyStrength;
        }
    
    
    //Ability getters
    
    
        public String GetAbility() {
            return this.ability;
        }
        
        
    
    //dexterity   
    
        
       
        public int GetDexterity() {
            return this.dexterity;
        }
       
    //damage
        public int GetDamageMultiplier() {
            return this.damageMultiplier;
        }
    
        public boolean IsDead() {
            boolean isDead = false;
            if(this.Enemyhealth <= 0)
                isDead = true;
            return isDead;
        }
    
    
    // setters

    //name

    public void SetEnemyName(String enemy) {
        this.enemyName = enemy;
    } // GetEnemyName()

    //Health
    
        public void SetEnemyInitialHealth(int InitEnemyHealth){
          this.InitEnemyHealth = InitEnemyHealth;
        }
    
        public void SetEnemyBattleHealth(int Enemyhealth) {
            this.Enemyhealth = Enemyhealth;
        }
        
    
     //strength
    
        public void SetEnemyInitialStrength(int InitEnemyStrength){
         this.InitEnemyStrength = InitEnemyStrength;
        }
    
        public void SetEnemyBattleStrength(int Enemystrength) {
            this.Enemystrength = Enemystrength;
        }
    
     
    
    
     //Ability   
        public void SetAbility(String ability) {
            this.ability = ability;
        }
    
        
    //dexterity
       
        public void SetDexterity(int dexterity) {
            this.dexterity = dexterity;
        }
    
    //damage
     
        public void InflictDamage(int damage) {
            this.Enemyhealth -= damage;
        }


        //healhealth
    public void BalanceHealth(int healEffect) {
        this.Enemyhealth += healEffect;
    }

 // polymorphic method
 
   public abstract void GetStrength();
   public abstract void HealEnemy();
   public abstract void IncreaseHealth();
        
    
   
    } // class