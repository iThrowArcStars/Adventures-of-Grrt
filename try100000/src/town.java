import java.util.Scanner;
public class town {
    private static Scanner scanner = new Scanner(System.in);
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    private static int readInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
    }
    public static void townPhase() {
        System.out.println("Town Phase");
        inventoryPrompt();
        Dungeon.dungeonPhase();
    }
    private static void inventoryPrompt() {
        System.out.println("You enter the town, would you like to check your weapon and stats? ");
        String invPrompt = readLine("Press 'Y' to check your status, otherwise press 'N': ");
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
    static String[] itemStrings = {"Sword", "Chestplate", "Guantlet"};
    static int[] itemIntPrices = {70, 90, 40}
    private static void visitShop() {
        String answerString = readLine("Press 'Y' to go inside. Otherwise prress 'N' ");
        switch(answerString) {
            case "Y":
            case "y":
            System.out.println("You enter the shop. What would you like to buy?");
            for(int i = 0; i < 3; i++) {
                int roll = (int) (Math.random() * 3);
                String rollItemString = itemStrings[roll];
                rollItemIntPrices = itemIntPrices[roll];
                System.out.println("(" + i + ") " + rollItemString + "Cost: ");
                System.out.println("    Price: " + rollItemIntPrices);
            }
            int answerInt = readInt("Press the corresponding number to identify which item you want to buy. ");
            switch(answerInt) {
                case 1:
                    if(powershell.gold >= rollItemIntPrices) {
                        System.out.println("The item has been added to your inventory. ");
                        powershell.gold = powershell.gold - rollItemIntPrices;
                    }
                case 2:

                case 3:
                default: System.out.print("ERROR: Wrong Number/Character inputed");
            }
            break;
            default: break;
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
