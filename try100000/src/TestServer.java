import java.util.Scanner;

public class TestServer {

    private static Scanner scanner = new Scanner(System.in);
    public static int playerHealth = 100;
    public static int gold = 0;
    public static int dmg = 20;
    public static int defense = 0;

    public static void main(String[] args) {

        while(lifeStatus() == false) {
            return;
        }
        //Introduction
        log("The Black Sun");
        log();
        log("Que credits");
        log("Creator: Austin Uhl");
        log();
        //Skeleton fight 
        log("You wake up to a skeleton unsheathing its sword");
        log("Terror comes across your face. Do you run? Do you fight?");
        log();
        String answer = readLine("Press 'Y' to run, or press 'F' to fight: ");
        //Option #1 of the first fight
        if (answer.equalsIgnoreCase("F")) {
            log();
            log("There is a sword on the far side of the room.");
            System.out.println("There is also a wine bottle next to you.");
            int ansr = readInt("Press '1' to grab the sword.\nPress '2' to grab the wine bottle: ");
            switch (ansr) { 
                case 1:
                    log("");
                    log("You get the sword and kill the already dead skeleton.");
                    log("However, you are injured and lose 25 HP");
                    playerHealth -= 25;
                    break;
                case 2:
                    log();
                    log("You shatter the skeleton.");
                    log("Your health remains the same.");
                    break;
            }
            //Leaving the first dungeon
            log("You see an exit that opens up.");
            log("You leave the cave and begin a new adventure!");
            //Option #2 of the first fight
        }else if (answer.equalsIgnoreCase("Y")) {
            log();
            log("You have successfully escaped the skeleton.");
            log("You have found an exit.");
            log("You leave the cave and begin a new adventure!");
        }
        adventurePhase();
    }

    public static void log(String text) {
        System.out.println(text);
    }

    public static void log() {
        System.out.println();
    }

    public static String readLine(String question) {
        log(question);
        return scanner.nextLine();
    }

    public static int readInt(String question) {
        log(question);
        return scanner.nextInt();
    }

       //Calamity phase for the players that ran
    public static String calamityPhase()
    {
        // Using a randomizer of 20+ generates calamities after players run
        // Most are not to damaging 
        //Some can destroy armor and weapons or take gold 
        int calamityPhase = (int) (Math.random() * 3) + 1;
        switch(calamityPhase) {
            case 1:
                playerHealth = -25;
                return "you tripped on a log and you took minor damage.";
            case 2: 
                playerHealth = 1;
                return "you found an assasin on your way out and are now at 1HP. ";
            case 3:
                playerHealth -=1;
                return "you slipped on a banana and took 1 damage.";
            default:
                return null;
        }
    }

    public static void adventurePhase() {
        int roll = 1; //(int) (Math.random() * 2) + 1;
        switch (roll) {
            case 1:
                log("You are wandering the lands and see a caveman.");
                log("Would you like to talk to him?");
                log();
                String ansr1 = readLine("Press 'Y' to talk to the caveman. Otherwise, press 'N': ");
                if (ansr1.equalsIgnoreCase("Y")) {
                    log("Grrt no understand. You make my life hard, in return I'll make yours Legendary.");
                } else {
                    log("You successfully avoided Grrt, however " + calamityPhase());
                    System.out.println(playerHealth);
                }
                break;
            case 2:
                log("You're exploring and see a group of bandits. Would you like to attack?");
                String ansr2 = readLine("Press 'Y' to attack. Otherwise, press 'N': ");
                if(ansr2.equalsIgnoreCase("Y")) {
                    log("You do significant damage to the bandits, what would you like to do?");
                    String ansr21 = readLine("To plunder them press 'Y'. To capture them press 'N'. ");
                    if(ansr21.equalsIgnoreCase("Y")) {
                        log("You looted a sword and some gold. ");
                        log(" + 15 gold ");
                    }
                } else {
                    log("You made it! However"/**Insert calamity*/);
                }
                
                break;
            case 3:
                log("There is a river in your travels. What would you do about it?");
                String ansr3 = readLine("Press 'Y' to go around the river: ");
                break;
            case 4:
                log("There is a Giant and a Dragon fighting, and there also seems to be a group of mercenaries. Do you join and help?");
                break;
            case 5:
                log("You see a town in the distance that wasn't on your map. Would you like to go?");
                break;
        }
    }
    public void statsUI() {
        // Builds a image of user stats 
        // Add a random encounter with a lost Caveman named Grrt
    }
    public void buildRoomEasy() {
        // The random room builder 
    }
    public void buildRoomMed() {
        //Formula: 1-2 monsters + 50% chance for a chest + Random Items
    }
    public void buildRoomHard() {
        
    }
    public void buildRoomLGND() {
        // Talking to Grrt will make your game settings 'Legendary'
        // Items recieved will have special effects, stats, names, etc.
    }
    public static boolean lifeStatus() {
        while(playerHealth > 0) {
            return true;
        }
        return false;
    }
}
