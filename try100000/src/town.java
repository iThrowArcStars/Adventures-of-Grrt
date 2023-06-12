import java.util.Scanner;
public class town {
    private static Scanner scanner = new Scanner(System.in);
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    private static int readInt(String question) {
        System.out.println(question);
        try {
        return scanner.nextInt();
        } catch (Exception e)
        {
            return -1;
        }
    }
    public static void townPhase() {
        System.out.println("Town Phase");
        inventoryPrompt();
        visitShop();
        Dungeon.dungeonPhase();
    }
    private static void inventoryPrompt() {
        String invPrompt;

        System.out.println("You enter the town, would you like to check your weapon and stats? ");
        invPrompt = readLine("Press 'Y' to check your status, otherwise press 'N': ");
        switch(invPrompt) {
            case "Y":
            case "y":
            //call stats and gold 
            System.out.println();
            System.out.println("Stats -- ");
            System.out.println("Player Health: " + powershell.playerHealth);
            System.out.println("Player Damage: " + powershell.playerDamage);
            System.out.println("Player Defense: " + powershell.playerDefense);
            System.out.println();
            System.out.println("Items -- ");
            System.out.println("Gold: " + powershell.gold);
            break;
            case "N":
            case "n":
            break;
            default: break;
        }
    }


    static int rollItemIntPrices;
    static String[] weaponString = {"Sword", "Mace", "Bow"};
    static int[] weaponPrice = {70, 90, 40};
    static int[] weaponDMG = {25, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100};


    private static void visitShop() {
        System.out.println("You see a shop.");
        String answerString = readLine("Press 'Y' to go inside. Otherwise prress 'N' ");
        switch(answerString) {
            case "Y":
            case "y":
                System.out.println("This is what's for sale:");
                for(int i = 0; i < 3; i++) {
                    int roll = (int) (Math.random() * 3);
                    System.out.println("("+ i +")" + weaponString[roll]);
                    System.out.println("    Weapon Damage: " + weaponDMG[roll]);
                    System.out.println("    Price: " + weaponPrice[roll]);
                }
                
                int keeperQuestionString;
                while(true)
                {
                    keeperQuestionString = readInt("Which weapon would you like? If none press '-1' ");

                    if ((keeperQuestionString >= 0) && (keeperQuestionString <=2))
                    {
                        break;
                    }
                    if(keeperQuestionString == -1) {
                        break;
                    }
                }

                switch(keeperQuestionString) {
                    case 0:
                        if(powershell.gold >= weaponPrice[0]) {
                            powershell.playerDamage = powershell.playerDamage + weaponDMG[0];
                        } else {
                            System.out.println("You do not have the money for this weapon. ");
                        }
                        break;
                    case 1:
                        if(powershell.gold >= weaponPrice[1]) {
                            powershell.playerDamage = powershell.playerDamage + weaponDMG[1];
                        } else {
                            System.out.println("You do not have the money for this weapon. ");
                        }
                        break;
                    case 2:
                        if(powershell.gold >= weaponPrice[2]) {
                            powershell.playerDamage = powershell.playerDamage + weaponDMG[2];
                        } else {
                            System.out.println("You do not have the money for this weapon. ");
                        }
                    default: break;
                    case -1: break;
                }
                System.out.println("Player Damage: " + powershell.playerDamage);
        }
    }
    
    private static void interactWithNPC() {
        System.out.println("You see an NPC. What would you like to do?");
        // Implement NPC interaction functionality
        // ...
    }
    
    private static void rest() {
        System.out.println("You find an inn and decide to rest for a while.");
        // Implement rest functionality
        // ...
    }
    
    private static void takeQuest() {
        System.out.println("You come across a quest board. Which quest do you want to take?");
        // Implement quest functionality
        // ...
    }
}
