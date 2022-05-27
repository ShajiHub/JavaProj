
package warrior;

import java.util.Random;

public abstract class Warrior {
    protected Random randNum = new Random();
    protected int statBonus = 30;
    private String name;
    private int InitHealth;
    private int InitStrength;
    private String ability;

    private int health; // hit points
    private int strength; // damage bonus
    protected int dexterity; // increase hit chance
    protected int damageMultiplier = 1;



// constructor
    public Warrior(String name) {
        this.name = name;
    }// constructor 


//getters

//name 

    public String GetSpartonName() {
        return this.name;
    } // GetSpartonName()

    public String GetSonName() {
        return this.name;
    } // GetName()


//Health 

    public int GetKratosBattleHealth() {
        return this.health;
    }
    public int GetAtreusBattleHealth() {
        return this.health;
    }
    public int GetInitialHealth() {
        return this.InitHealth;
    }
//Strength

    public int GetKratosBattleStrength() {
      return this.strength;
    }
    public int GetAtreusBattleStrength() {
      return this.strength;
    }
   

    public int GetInitialStrength() {
        return this.InitStrength;
    }


//Ability getters


    public String GetAbility() {
        return this.ability;
    }
    
       
    public int GetDexterity() {
        return this.dexterity;
    }
   
    public int GetDamageMultiplier() {
        return this.damageMultiplier;
    }

    public boolean IsDead() {
        boolean isDead = false;
        if(this.health <= 0)
            isDead = true;
        return isDead;
    }


// setters
//Health

    public void SetInitialHealth(int InitHealth){
      this.InitHealth = InitHealth;
    }

    public void SetKratosBattleHealth(int health) {
        this.health = health;
    }
    public void SetAtreusBattleHealth(int health) {
        this.health = health;
    }

 //strength

    public void SetInitialStrength(int InitStrength){
     this.InitStrength = InitStrength;
    }

    public void SetKratosBattleStrength(int strength) {
        this.strength = strength;
    }

    public void SetAtreusBattleStrength(int strength) {
        this.strength = strength;
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
        this.health -= damage;
    }

//healhealth
    public void BalanceHealth(int healEffect) {
        this.health += healEffect;
    }
    
   

    // polymorphic method
   // public abstract void AtreusHeal(int amount);
    public abstract void GetStrength();
    public abstract void HealWarriors();
    public abstract void IncreaseHealth();
} // class