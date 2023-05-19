import java.util.Scanner;

public class TestServer3 {

    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    private static int playerHealth = 100;
    private String goblin = "Goblin";
    private static int goblinHP = 25;
    private static int monsterDMG = 0;

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
            // Leaving the first dungeon
            System.out.println("You see an exit that opens up.");
            System.out.println("You leave the cave and begin a new adventure!");
            phase = 1;
            
            // Option #2 of the first fight
        } else {
            String answer = readLine("Press 'Y' to run, or press 'F' to fight: ");
            if (answer.equalsIgnoreCase("Y")) {
                System.out.println();
                System.out.println("You have successfully escaped the skeleton.");
                System.out.println("You have found an exit.");
                System.out.println("You leave the cave and begin a new adventure!");
                phase = 1;
            }
        }
        
        if (phaseCheck().equals("Adventure Phase")) {
            // Call the adventure phase method
            adventurePhase();
        }
        if (phaseCheck().equals("Calamity Phase")) {
            // Call the calamity phase method
            calamityPhase();
        }
        if (phaseCheck().equals("Town Phase")) {
            // Call the town phase method
            townPhase();
        }
    }

    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    private static int readInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
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
    
    public static void adventurePhase() {
        // Code for the adventure phase
        System.out.println("Adventure Phase");
        System.out.println();
    }
    
    public static void calamityPhase() {
        // Code for the calamity phase
        System.out.println("Calamity Phase");
    }
    
    public static void townPhase() {
        // Code for the town phase
        System.out.println("Town Phase");
    }

    private void roomGenerator() {
        switch(monsterDMG) {
            
        }
    }
}
