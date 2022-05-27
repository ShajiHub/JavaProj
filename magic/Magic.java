package magic;

public class Magic extends MagicMain{
    private String[] magicTypes = {"FireOfAres","IceOfPoseidon", "LightningOfZeus", "SoulOfHades"};
    
    
    int min = -40;  
    int max = -3; 
   
   
    public Magic() {
        String MagicType = magicTypes[randNum.nextInt(magicTypes.length)];
        super.SetMagic(MagicType);
        super.SetMagicEffect(MagicType);

  
}
}


