package weapons;

public class TalonBow extends Weapon{
    
    private int minDamage = 50;
    private int basicHit = 40;
    private int weight = 15;
    
    public TalonBow() {
        super();
        super.SetBasicDamage(minDamage);
        super.SetBaseHitChance(basicHit);
        super.SetWeight(weight);
    } // constructor
}
