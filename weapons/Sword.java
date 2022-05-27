package weapons;

public class Sword extends Weapon{
    
    private int minDamage = 50;
    private int basicHit = 60;
    private int weight = 20;
    
    public Sword() {
        super();
        super.SetBasicDamage(minDamage);
        super.SetBaseHitChance(basicHit);
        super.SetWeight(weight);
    } // constructor
}

