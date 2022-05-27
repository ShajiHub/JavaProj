package weapons;

public class Axe extends Weapon {
    
    private int minDamage = 50;
    private int basicHit = 80;
    private int weight = 50;
    
    public Axe() {
        super();
        super.SetBasicDamage(minDamage);
        super.SetBaseHitChance(basicHit);
        super.SetWeight(weight);
    } // constructor
}

