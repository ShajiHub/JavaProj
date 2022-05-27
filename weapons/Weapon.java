
package weapons;
import java.util.Random;

public abstract class Weapon {
  
   private Random randNum = new Random();
    private int basicDamage;
    private int basicHit;
   
    protected int dexterity; // increase hit chance
   
    protected int damageMultiplier = 1;
    
  
   
    
    private int weight;
 

    public Weapon() { }

    // setters
    
    public void SetBasicDamage(int basicDamage) {
        this.basicDamage = basicDamage;
    }

   

    public void SetBaseHitChance(int basicHit) {
        this.basicHit = basicHit;
    }
    
    
    //dexterity
   
    public void SetDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
//weapon weight

    public void SetWeight(int weight) {
            this.weight = weight;

    }

    // getters
    public int GetBasicDamage() {
        return this.basicDamage;
    }

  

    public int GetBaseHitChance() {
        return this.basicHit;
    }
    
    public int GetDexterity() {
        return this.dexterity;
    }
   
    public int GetDamageMultiplier() {
        return this.damageMultiplier;
    }

    public int GetWeight() {

        
        return this.weight;
    }



   

    //fight()

    public int Battle(int strength, int dexterity, int weight, int damageMulitplier) {
            int currentDamage = 0;
            
                    basicDamage += 20;
                    basicHit += 10;
                
                int roll = randNum.nextInt(100) + 1; // base dice roll
                dexterity -= weight; // first reduce dex based on armour weight
                
                // add char dex to increase chances of hit!
                int chance = roll + dexterity / 10;
                
                if(chance >= basicHit) { // Hit warrior or enemy
                    currentDamage = (randNum.nextInt(strength / 10) + 
                        basicDamage) * damageMulitplier;
                }
            
            return currentDamage;

    } // Fight()

   
} // class

       