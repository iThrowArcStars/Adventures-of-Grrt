import java.util.Scanner;

public class Invalid {

    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    private static int playerHealth = 100;
    public Invalid() {
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
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    private static int readInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }
    public static void invalidPhase() {
       // System.out.println(phaseCheck());
        
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
            if(answer.equalsIgnoreCase("F")){
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
            } else if 
             (answer.equalsIgnoreCase("Y")) {
                System.out.println();
                System.out.println("You have successfully escaped the skeleton.");
                System.out.println("You have found an exit.");
                System.out.println("You leave the cave and begin a new adventure!");
                phase = 1;
            }
        } 
    }
}