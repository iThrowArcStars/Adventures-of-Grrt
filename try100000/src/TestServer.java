import java.util.Scanner;

public class TestServer {

    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    private static int playerHealth = 100;
    private static int goblinHP = 25;

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
            }
            // Option #2 of the first fight
            } else {
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
        int roll = (int) (Math.random() * 5) + 1;
        switch (roll) {
            case 1:
                System.out.println("You are wandering the lands and see a caveman.");
                System.out.println("Would you like to talk to him?");
                System.out.println();
                String ansr1 = readLine("Press 'Y' to talk to the caveman. Otherwise, press 'N': ");
                if (ansr1.equalsIgnoreCase("Y")) {
                    System.out.println("Grrt no understand. You make my life hard, in return I'll make yours Legendary.");
                } else {
                    System.out.println("You successfully avoided Grrt, however /**Call a calam card */");
                    System.out.println(playerHealth);
                }
                break;
            case 2:
                System.out.println("You're exploring and see a group of bandits. Would you like to attack?");
                String ansr2 = readLine("Press 'Y' to attack. Otherwise, press 'N': ");
                if(ansr2.equalsIgnoreCase("Y")) {
                    System.out.println("You do significant damage to the bandits, what would you like to do?");
                    String ansr21 = readLine("To plunder them press 'Y'. To capture them press 'N'. ");
                    if(ansr21.equalsIgnoreCase("Y")) {
                        System.out.println("You looted a sword and some gold. ");
                        System.out.println(" + 15 gold ");
                    }
                } else {
                    System.out.println("You made it! However /**Insert calamity*/");
                }
                
                break;
            case 3:
                System.out.println("There is a river in your travels. What would you do about it?");
                String ansr3 = readLine("Press 'Y' to go around the river: ");
                break;
            case 4:
                System.out.println("There is a Giant and a Dragon fighting, and there also seems to be a group of mercenaries. Do you join and help?");
                break;
            case 5:
                System.out.println("You see a town in the distance that wasn't on your map. Would you like to go?");
                break;
        }
    }
    
    public static void calamityPhase() {
        // Code for the calamity phase
        System.out.println("Calamity Phase");
    }
    
    public static void townPhase() {
        // Code for the town phase
        System.out.println("Town Phase");
    }
}
