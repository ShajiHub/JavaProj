package weapons;

public class Shield extends Weapon{
    private int minDamage = 20;
    private int basicHit = 30;
    private int weight = 20;
    
    public Shield() {
        super();
        super.SetBasicDamage(minDamage);
        super.SetBaseHitChance(basicHit);
        super.SetWeight(weight);
    } // constructor
}

