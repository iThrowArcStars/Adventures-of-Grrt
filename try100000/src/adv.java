import java.util.Scanner;

public class adv {
    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    
    public adv() {
    }
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    public static void adventurePhase() {
        System.out.println("Adventure Phase");
        System.out.println();
        int roll = (int) (Math.random() * 5) + 1;
        switch (roll) {
            case 1:
                System.out.println("You are wandering the lands and see a caveman.");
                String ansr1 = readLine("Press 'Y' to talk to the caveman. Otherwise, press 'N': ");
                System.out.println("Would you like to talk to him?");
                System.out.println();
                switch(ansr1) {
                    case "Y":
                    case "y":
                        System.out.println("Grrt no understand. You make my life hard, in return I'll make yours Legendary.");
                        break;
                    case "N":
                    case "n":
                        System.out.println("You successfully avoided Grrt, however " );
                        break;
                    default: System.out.println("Error something went wrong... Please report this if you see it E#adv.aPC1: ");
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
                    System.out.println("You made it! However" + Calamity.calamityCard());
                }
                break;
            case 3:
                System.out.println("There is a river in your travels. What would you do about it?");
                String ansr3 = readLine("Press 'Y' to through the river, otherwise press 'N': ");
                switch(ansr3) {
                    case "Y":
                    case "y":
                    System.out.println("You take some damage");
                    powershell.playerHealth -= 15;
                    System.out.println("Player HP: " + powershell.playerHealth);
                    break;
                    case "N":
                    case "n":
                    System.out.println("You have opted to go around the river, you wonder what endevor you may encounter. ");
                    Calamity.calamityCard();
                    Calamity.calamityPhase();
                }
                break;
            case 4:
                System.out.println("There is a Giant and a Dragon fighting, and there also seems to be a group of mercenaries. Do you join and help?");
                String ansr4 = readLine("Press 'Y' to assist the mercenaries, otherwise press 'N': ");
                switch(ansr4) {
                    case "Y":
                    case "y":
                    System.out.println("The Giant was fairly weak; you also got a Giant's Toe. However the Dragon is still at full health. Do you run? Or will you, a warrior stay and fight");
                    String ansr41 = readLine("Press 'Y' to further assist the mercenaries, otherwise press 'N' to run.: ");
                    switch(ansr41) {
                        case "Y":
                        case "y":
                            if(powershell.playerHealth >= 25) {
                                System.out.println("You have lived to tell the tale! However you're almost dead. ");
                                powershell.playerHealth = 15;
                                System.out.println("Player HP: " + powershell.playerHealth);
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
                String ansr5 = readLine("Press 'Y' to go to this mysterious town, otherwise press 'N': ");
                switch(ansr5) {
                    case "Y":
                    case "y":
                        town.townPhase();
                    break;
                    case "N":
                    case "n":
                        GameReset.resetAdventurePhase();
                    break;
                }
                break;
        }
    }
}
