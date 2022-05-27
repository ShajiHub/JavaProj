

import java.util.Scanner;





import scenes.*;
import settings.*;
import warrior.*;
import weather.*;
import enemies.*;
import weapons.*;
import magic.*;
 

public class GodOfWarMain {
    private static Scanner input = new Scanner(System.in);
    private static Warrior role1;
    private static Warrior role2;
    private static Scenes scene;
    private static Enemy enemy;
    private static Weather climate;
    private static Weapon weapon;
    private static MagicMain mag;
    
    private static SelectWeapon weaponName = new SelectWeapon();
    private static Message msg = new Message();
    
    //colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
   
   
    private static String getWeather;
    private static String getScene;
    private static String getEnemy;
    private static String getSnowPack;
    private static double getTemperature;
    private static double getHumidity;


    private static boolean turn = true;
    private static int damage = 0 ;
    private static int damage1 = 0;
    private static boolean endOfGame = false;
    private static String winner = "";
    private static int player = 0;
    private static int weight = 0;


    
    public static boolean Age = false;
    public static int GetAge;
   

    public static void main(String[] args) {

       
        while(!Age){
            try
            {
            System.out.print ("Enter your Age: (Age must be above 19) ");
            GetAge = input.nextInt ();
            if(GetAge>=20)
            Age = true;
            
            }
            catch (Exception e)
            {
               System.out.println ("Error : " + e );
               System.out.println("Enter valid input!!!");
               break;
            }
            
        }  

        msg.Welcome_Msg(); // Welcome message
     
        int choice = input.nextInt();//Choose Warrior
       
        input.nextLine(); 

        WarriorSettings(choice);// chosen Warrior
      
        msg.Select_Journey();//Select the Scenes
        
        int journey = input.nextInt();//choose scene

        input.nextLine(); 

        JourneySettings(journey);//chosen level or scene
        
    
        //Battle

        Battle_Starts_Here(choice, journey);//battle
        
        
    } // main

    public static void Battle_Starts_Here(int choice, int journey) {
        while(!endOfGame) {

            if(turn) {
                  

                    if ( choice == 1){// warrior goes to battle

                        System.out.println(ANSI_CYAN + "____________________________________________" + ANSI_RESET);    
                        System.out.println("Let's begin the battle "+ role1.GetSpartonName() +"!!!");
                        System.out.println(ANSI_CYAN + "********************************************" + ANSI_RESET);    
                        System.out.println("Health of  "+ role1.GetSpartonName() +"  :" + role1.GetKratosBattleHealth());
                        System.out.println("Health of  "+ enemy.GetEnemyName() +"  :" + enemy.GetEnemyBattleHealth());
                        mag = new Magic();
                        System.out.println("Enemy Magic  :" + mag.GetMagic());
                        System.out.println("Weapon weight  :" + GetWeight());
                        System.out.println(ANSI_CYAN + "______________________________________________" + ANSI_RESET);    
                        damage = weapon.Battle(role1.GetKratosBattleStrength(), role1.GetDexterity(), GetWeight(), role1.GetDamageMultiplier());
                        damage1 = weapon.Battle(enemy.GetEnemyBattleStrength(), enemy.GetDexterity(), GetWeight(), enemy.GetDamageMultiplier());  
                        damage1 += mag.GetMagicEffect();

                        if(damage > damage1)
                        {//if warrior hits
                            System.out.println("Warrior hits!!!");  

                            enemy.InflictDamage(damage);
                            role1.HealWarriors();
                            role1.GetStrength();
                            role1.IncreaseHealth();
                        }
                        else
                        {// if enemy hits
                            System.out.println("Enemy hits!!!"); 
                            role1.InflictDamage(damage);
                            enemy.HealEnemy();
                            enemy.GetStrength();
                            enemy.IncreaseHealth();
                            mag.GetMagicEffect();
                        }

                        if(role1.GetKratosBattleHealth()<0){//warrior dies
                        endOfGame = role1.IsDead();
                       }

                        if(endOfGame) {// enemy wins
                            winner = enemy.GetEnemyName();
                            System.out.println("Enemy " + winner + " is a winner!!!");
                            System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);   
                            System.out.println("Do you want to play again? : 1) Yes  2) No  ");
                             
                            int option = input.nextInt();
                            if(option ==1){// choose to play again if enemy wins
                                msg.Welcome_Msg(); // Welcome message
                                choice = input.nextInt();//Choose Warrior
                                Battle_Starts_Here(choice, journey);
                            }//play level again
                            else {// warrior wins and opt to exit game
                                if(option ==2)
                                System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                                System.out.println("Well done!!!");
                                System.out.println("Exiting Game!!!");
                                System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                                System.exit(0);
                               }
                       } else{// warrior wins
                        winner = role1.GetSpartonName();
                        System.out.println("Warrior Hits back!!!");
                        System.out.println("Warrior " + winner + " is a winner!!!");
                        System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);   
                        System.out.println("Do you want to play another level? : 1) Yes  2) No  ");
                         
                        int option = input.nextInt();

                        if(option ==1){//like to play other levels or scenes
                            msg.Select_Journey();// Select level or scene
                            journey = input.nextInt();
                            JourneySettings(journey);//chosen level or scene
                            Battle_Starts_Here(choice, journey);
                        }// game play continues
                        else {// exit game
                            if(option ==2)
                            System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                            System.out.println("Level completed!!!");
                            System.out.println("Exiting Game!!!");
                            System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                            System.exit(0);
                           }//exit game
                       }
        
                   }
                   else if ( choice == 2){// if warrior and son goes to battle

                    System.out.println(ANSI_CYAN + "________________________________________________________" + ANSI_RESET);    
                    System.out.println("Let's begin the battle "+ role1.GetSpartonName() + "and" + role2.GetSonName() + "!!!");
                    System.out.println(ANSI_CYAN + "********************************************************" + ANSI_RESET);    
                    System.out.println("Health of  "+ role1.GetSpartonName() +"  :" + role1.GetKratosBattleHealth());
                    System.out.println("Health of  "+ role2.GetSonName() +"  :" + role2.GetAtreusBattleHealth());
                    System.out.println("Health of  "+ enemy.GetEnemyName() +"  :" + enemy.GetEnemyBattleHealth());
                    mag = new Magic();
                    System.out.println("Enemy Magic  :" +mag.GetMagic());
                    System.out.println("Weapon weight  :" +GetWeight());
                    System.out.println(ANSI_CYAN + "__________________________________________________________" + ANSI_RESET);    

                       damage = weapon.Battle(role1.GetKratosBattleStrength(),role1.GetDexterity(),GetWeight(),role1.GetDamageMultiplier());//Kratos

                       if(role1.GetKratosBattleHealth() >= 5 && role1.GetKratosBattleHealth() <= 15){//Atreus
                       damage = weapon.Battle(role2.GetAtreusBattleStrength(),role2.GetDexterity(),GetSonWeaponWeight(),role2.GetDamageMultiplier());
                       }
                       damage1 = weapon.Battle(enemy.GetEnemyBattleStrength(),enemy.GetDexterity(),GetWeight(),enemy.GetDamageMultiplier());  //enemy
                       damage1 += mag.GetMagicEffect();
                       if(damage > damage1)
                       {// if warrior hits
                           System.out.println("Warrior hits!!!");  
                          
                           enemy.InflictDamage(damage);
                           role1.HealWarriors();
                           role1.GetStrength();
                           role1.IncreaseHealth();
                       }
                       else
                       {//if enemy hits
                           System.out.println("Enemy hits!!!"); 
                          
                           enemy.HealEnemy();
                           enemy.GetStrength();
                           enemy.IncreaseHealth();
                           
                           
                       }
                       if(role1.GetKratosBattleHealth()<0){
                        endOfGame = role1.IsDead();
                       }

                        if(endOfGame) {//enemy wins
                            
                            winner = enemy.GetEnemyName();
                            
                            System.out.println("Enemy " + winner + " is a winner!!!");

                            System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                            System.out.println("Do you want to play again? : 1) Yes  2) No  ");
                            int option = input.nextInt();

                            if(option ==1){//option to play again if enemy wins
                                msg.Welcome_Msg(); // Welcome message
                                choice = input.nextInt();//Choose Warrior
                                Battle_Starts_Here(choice, journey);
                            }//play level continues
                           else {
                                if(option ==2)
                                System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                                System.out.println("Well done!!!");
                                System.out.println("Exiting Game!!!");
                                System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                                System.exit(0);
                               }//exit game
                           }
                            
                       } else{//warrior wins
                        winner = role1.GetSpartonName();
                        System.out.println("Warrior and son Hits back!!!");
                        System.out.println("Warrior " +  winner + " and " + role2.GetSonName() + " are winners!!!");
                        System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);   
                        System.out.println("Do you want to play another level? : 1) Yes  2) No  ");
                          
                        int option = input.nextInt();

                        if(option ==1){
                            msg.Select_Journey();// Select level or scene
                            journey = input.nextInt();
                            JourneySettings(journey);//chosen level or scene
                            Battle_Starts_Here(choice, journey);
                        }//continue journey(Playing Levels)
                       else {
                        if(option ==2)
                        System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                        System.out.println("Level completed!!!");
                        System.out.println("Exiting Game!!!");
                        System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
                        System.exit(0);
                       }//Exit game
                     

                   }
        
                   
               }//turn
              
              
              turn = false;

            }//While
    }
    
    public static void JourneySettings(int journey) {

         switch(journey){
          case 1://1)Tartarus
          {
             scene = new Tartarus();
             getScene = scene.GetSceneName();

             
             EnemySettings(journey);
        
             climate = new Rain();

             getWeather = climate.GetWeather();
             getTemperature = climate.GetTemperature();
             getHumidity = climate.GetHumidity();

             System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
             System.out.println("Scene  :" + getScene);
             System.out.println("Climate  :" + getWeather);
             System.out.println("Temperature  :" + getTemperature);
             System.out.println("Humidity  :" + getHumidity);
             System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    

             WarriorInitialHealthAndStrength(journey);
             EnemyInitialHealthAndStrength(journey);

             break;   
            }//case 1
          case 2://2)Desert of lost souls
             {
               scene = new DesertOfLostSouls();
               getScene = scene.GetSceneName();

            
               EnemySettings(journey);

               climate = new Sunny();

               getWeather = climate.GetWeather();
               getTemperature = climate.GetTemperature();
               getHumidity = climate.GetHumidity();

               System.out.println("");
               System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
               System.out.println("Scene  :" + getScene);
               System.out.println("Climate  :" + getWeather);
               System.out.println("Temperature  :" + getTemperature);
               System.out.println("Humidity  :" + getHumidity);
               System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
               System.out.println("");
               break;  
             }//case 2
            case 3://3)The Village Of Kirra 
             {
              scene = new TheVillageOfKirra();
              getScene = scene.GetSceneName();

              
              EnemySettings(journey);

              climate = new LightningAndWindy();

              getWeather = climate.GetWeather();
              getTemperature = climate.GetTemperature();
              getHumidity = climate.GetHumidity();

              System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
              System.out.println("Scene  :" + getScene);
              System.out.println("Climate  :" + getWeather);
              System.out.println("Temperature  :" + getTemperature);
              System.out.println("Humidity  :" + getHumidity);
              
              System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    

              break;  
            }//case 3
            case 4://4)The Magic Chisel
             {
              scene = new TheMagicChisel();
              getScene = scene.GetSceneName();

              EnemySettings(journey);

              climate = new Snow();

              getWeather = climate.GetWeather();
              getSnowPack = climate.GetSnowPack();
              getTemperature = climate.GetTemperature();
              getHumidity = climate.GetHumidity();

              System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    
              System.out.println("Scene  :" + getScene);
              System.out.println("Climate  :" + getWeather);
              System.out.println("SnowPack  :" + getSnowPack);
              System.out.println("Temperature  :" + getTemperature);
              System.out.println("Humidity  :" + getHumidity);
              
              System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);    

              break;  
            }//case 4
            default: {
              System.out.println("Type right Scene options...");
            }//default
        }//case

    }//JourneySettings()
 


    public static void WarriorInitialHealthAndStrength(int choice) {
        if(choice == 1){
            System.out.println("Warrior name : ");
            System.out.println(role1.GetSpartonName() + " : ");
            System.out.println("  Warrior Health Point : " + role1.GetInitialHealth());
            System.out.println("  Warrior strength : " + role1.GetInitialStrength());
                 
        }
        else{
            System.out.println("Warrior names : ");
            System.out.println(role1.GetSpartonName() + " : ");
            System.out.println("  Warrior1 Health Point  : " + role1.GetInitialHealth());
            System.out.println("  Warrior1 strength : " + role1.GetInitialStrength());
            System.out.println(role2.GetSonName() + " : ");
            System.out.println("  Warrior2 Health Point  : " + role2.GetInitialHealth());
            System.out.println("  Warrior2 strength  : " + role2.GetInitialStrength());
      }
    }//WarriorInitialHealthAndStrength()




    public static void EnemyInitialHealthAndStrength(int journey) {
        
            System.out.println("Enemy name : ");
            System.out.println( enemy.GetEnemyName() + " :");
            System.out.println("  Enemy Health Point : " + enemy.GetEnemyInitialHealth());
            System.out.println("  Enemy Strength : " + enemy.GetEnemyInitialStrength());
                 
            
    }//EnemyInitialHealthAndStrength()





    public static void WarriorSettings(int choice) {
        
        switch(choice) {
            case 1: { // Kratos
                System.out.println("Enter the Name of Sparton : ");
                String sparton = input.nextLine();
                role1 = new Kratos(sparton);
                System.out.println("Let's begin the battle "+ role1.GetSpartonName() +"!!!");
                break;
            }// case 1
            case 2: { // Kratos and Atreus
                
                System.out.println("Enter the Name of Sparton : ");
                String sparton = input.nextLine();
                role1 = new Kratos(sparton);
                System.out.println("Enter Sparton's Son name : ");
                String son = input.nextLine();
                role2 = new Atreus(son);
                System.out.println( "Let's begin the battle " + 
                role1.GetSpartonName() + " and " + role2.GetSonName() + "!!!" );
                break;
            }//case 2
        } // Switch
    } // WarriorSettings()
    




    public static void EnemySettings(int journey) {
        
      switch(journey) {
          case 1: { // Enemy : Centaur / Scene: Tartarus 
             
              enemy = new Centaur();
              System.out.println("Your Enemy is "+ enemy.GetEnemyName() +"!!!");
              break;
          }
         case 2: { // Enemy: FeralHound / Scene: Desert of lost souls  
             
            enemy = new FeralHound();
            System.out.println("Your Enemy is  "+ enemy.GetEnemyName() +"!!!");
            break;
        }
        case 3: { // Enemy : Chimera / Scene: The Village Of Kirra 
             
            enemy = new Chimera();
            System.out.println("Your Enemy is  "+ enemy.GetEnemyName() +"!!!");
            break;
        }
        case 4: { // Enemy : StonebeardKing / Scene: The Magic Chisel
             
            enemy = new StonebeardKing();
            System.out.println("Your Enemy is  "+ enemy.GetEnemyName() +"!!!");
            break;
        }
        default: {
            System.out.println("Type right Scene options...");
          }//default
          
      } // Switch
   } // EnemySettings()




  
   public static int GetWeight() {

        if(weaponName.GetWeapon() == "Axe"){
              weapon = new Axe();  
        }
        else if(weaponName.GetWeapon() ==   "Shield"){
              weapon = new Shield();  
        }
        else if(weaponName.GetWeapon() ==  "Spear"){
              weapon = new Spear();  
        }
        else if(weaponName.GetWeapon() == "Sword"){
              weapon = new Sword();  
        }
        else if(weaponName.GetAtreusWeapon() == "TalonBow"){
              weapon = new TalonBow();  
        }
        return weight = weapon.GetWeight();  
   }//GetWeight()



   public static int GetSonWeaponWeight() {

        if(weaponName.GetAtreusWeapon() == "TalonBow"){
          weapon = new TalonBow();  
        }
        return weight = weapon.GetWeight();  
   }//GetSonWeaponWeight()



} // class








  
