package settings;
import java.util.Random;
import java.awt.Color;

public class Message {


//Colors- Letters

public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";
//Colors- Background

public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


//Welcome Message
    public void Welcome_Msg(){
        System.out.println(ANSI_CYAN + "_________________________________" + ANSI_RESET);     
        System.out.println(ANSI_CYAN + " God Of war - A New Beginning!!!"  + ANSI_RESET);
        System.out.println(ANSI_CYAN + "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + ANSI_RESET + "\n"); 


        System.out.println(ANSI_GREEN + ANSI_BLUE_BACKGROUND + "Choose your warrior?" + ANSI_RESET);
        System.out.println("1) the Ghost of sparta 2) Sparton and son ");// Choose charaters

    }

    public void Select_Journey(){
        System.out.println("Select your Journey  :");
        System.out.println(" 1)Tartarus 2)Desert of lost souls  3)The Village Of Kirra  4)The Magic Chisel ");//choose scene or journey
    }



    
}