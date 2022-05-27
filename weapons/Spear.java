package weapons;

public class Spear extends Weapon {
    
    private int minDamage = 40;
    private int basicHit = 50;
    private int weight = 30;
    public Spear() {
        super();
        super.SetBasicDamage(minDamage);
        super.SetBaseHitChance(basicHit);
        super.SetWeight(weight);
    } // constructor
}
