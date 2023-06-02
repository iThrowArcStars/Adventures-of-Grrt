import java.util.Scanner;

public class adv {
    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    public static String ansr1;
    public static String ansr2;
    public static String ansr21;
    public static String ansr3;
    public static String ansr4;
    public static String ansr41;
    public static String ansr5;

    public adv() {
    }

    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public static void adventurePhase() {
        ansr1 = "";
        ansr2 = "";
        ansr21 = "";
        ansr3 = "";
        ansr4 = "";
        ansr41 = "";
        ansr5 = "";

        boolean adventureComplete = false;
        while (!adventureComplete) {
            System.out.println("Adventure Phase");
            System.out.println();
            int roll =  (int) (Math.random() * 5) + 1;
            switch (roll) {
                case 1:
                    System.out.println("You are wandering the lands and see a caveman.");
                    ansr1 = readLine("Press 'Y' to talk to the caveman. Otherwise, press 'N': ");
                    System.out.println("Would you like to talk to him?");
                    System.out.println();
                    switch (ansr1) {
                        case "Y":
                        case "y":
                            System.out.println("Grrt no understand. You make my life hard, in return I'll make yours Legendary.");
                            adventureComplete = true;
                            break;
                        case "N":
                        case "n":
                            System.out.println("You successfully avoided Grrt, however ");
                            break;
                        default:
                            System.out.println("Error something went wrong... Please report this if you see it E#adv.aPC1: ");
                    }
                    break;
                case 2:
                    System.out.println("You're exploring and see a group of bandits. Would you like to attack?");
                    ansr2 = readLine("Press 'Y' to attack. Otherwise, press 'N': ");
                    if (ansr2.equalsIgnoreCase("Y")) {
                        System.out.println("You do significant damage to the bandits, what would you like to do?");
                        ansr21 = readLine("To plunder them press 'Y'. To capture them press 'N'. ");
                        if (ansr21.equalsIgnoreCase("Y")) {
                            System.out.println("You looted a sword and some gold. ");
                            System.out.println(" + 15 gold ");
                            adventureComplete = true;
                        }
                    } else {
                        System.out.println("You made it! However" + Calamity.calamityCard());
                    }
                    break;
                case 3:
                    System.out.println("There is a river in your travels. What would you do about it?");
                    ansr3 = readLine("Press 'Y' to go through the river, otherwise press 'N': ");
                    switch (ansr3) {
                        case "Y":
                        case "y":
                            System.out.println("You take some damage");
                            powershell.playerHealth -= 15;
                            System.out.println("Player HP: " + powershell.playerHealth);
                            adventureComplete = true;
                            break;
                        case "N":
                        case "n":
                            System.out.println("You have opted to go around the river, you wonder what endeavor you may encounter. ");
                            Calamity.calamityCard();
                            Calamity.calamityPhase();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("There is a Giant and a Dragon fighting, and there also seems to be a group of mercenaries. Do you join and help?");
                    ansr4 = readLine("Press 'Y' to assist the mercenaries, otherwise press 'N': ");
                    switch (ansr4) {
                        case "Y":
                        case "y":
                            System.out.println("The Giant was fairly weak; you also got a Giant's Toe. However the Dragon is still at full health. Do you run? Or will you, a warrior stay and fight");
                            ansr41 = readLine("Press 'Y' to further assist the mercenaries, otherwise press 'N' to run.: ");
                            switch (ansr41) {
                                case "Y":
                                case "y":
                                    if (powershell.playerHealth >= 25) {
                                        System.out.println("You have lived to tell the tale! However you're almost dead. ");
                                        powershell.playerHealth = 15;
                                        System.out.println("Player HP: " + powershell.playerHealth);
                                        adventureComplete = true;
                                    }
                                    break;
                                case "N":
                                case "n":
                                    System.out.println("You escape to find a nearby town. ");
                                    town.townPhase();
                                    break;
                            }
                            break;
                        case "N":
                        case "n":
                            System.out.println("You have successfully avoided the fight, yet you know you're still in danger. ");
                            Calamity.calamityCard();
                            Calamity.calamityPhase();
                            break;
                    }
                    break;
                case 5:
                    System.out.println("You see a town in the distance that wasn't on your map. Would you like to go?");
                    ansr5 = readLine("Press 'Y' to go to this mysterious town, otherwise press 'N': ");
                    switch (ansr5) {
                        case "Y":
                        case "y":
                            town.townPhase();
                            adventureComplete = true; // Set the flag to exit the loop
                            break;
                        case "N":
                        case "n":
                            // Repeat the entire loop
                            break;
                        default:
                            System.out.println("Invalid input. Please try again. ");
                            break;
                    }
                    break;
                default:
                    System.out.println("Invalid scenario. Please try again. ");
                    break;
            }
        }
        if(adventureComplete == true) {
            town.townPhase();
        }
    }
}
