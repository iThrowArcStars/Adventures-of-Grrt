import java.util.Scanner;

public class TestServer2 {

    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    private static int playerHealth = 100;

    public static void main(String[] args) {
        System.out.println(phaseCheck());
        
        if (phaseCheck().equals("Invalid Phase")) {
        System.out.println("The Black Sun");
        System.out.println();
        System.out.println("Que credits");
        System.out.println("Creator: Austin Uhl");
        System.out.println();
        System.out.println("You wake up to a skeleton unsheathing its sword");
        System.out.println("Terror comes across your face. Do you run? Do you fight?");
        System.out.println();
        String answer = readLine("Press 'Y' to run, or press 'F' to fight: ");
        
        System.out.println();
        System.out.println("There is a sword on the far side of the room.");
        System.out.println("There is also a wine bottle next to you.");
        int ansr = readInt("Press '1' to grab the sword.\nPress '2' to grab the wine bottle: ");
        switch (ansr) { 
            case 1:
                System.out.println("");
                System.out.println("You get the sword and kill the already dead skeleton.");
                System.out.println("However, you are injured and lose 25 HP");
                playerHealth -= 25;
                break;
            case 2:
                System.out.println();
                System.out.println("You shatter the skeleton.");
                System.out.println("Your health remains the same.");
                break;
        }
        //Leaving the first dungeon
        System.out.println("You see an exit that opens up.");
        System.out.println("You leave the cave and begin a new adventure!");
        //Option #2 of the first fight
    }
        }
        if (private static int readInt(String string) {
        return 0;
    }
        phaseCheck().equals("Adventure Phase")) {
            phase = 2;
        }
        if (phaseCheck().equals("Calamity Phase")) {
            phase = 3;
        }
        if (phaseCheck().equals("Town Phase")) {
            phase = 1;
        }
    }

    private static String readLine(String string) {
        return null;
    }

    public static String phaseCheck() {
        switch (phase) {
            case 1:
                return "Adventure Phase";
            case 2:
                return "Calamity Phase";
            case 3:
                return "Town Phase";
            default:
                return "Invalid Phase";
        }
    }
}