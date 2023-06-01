public class Town {
    public static void townPhase() {
        System.out.println("Town Phase");
        
        // Example of different actions in the town
        visitShop();
        interactWithNPC();
        rest();
        takeQuest();
        
        // Other town phase functionality
        // ...
    }
    
    private static void visitShop() {
        System.out.println("You enter a shop. What would you like to buy?");
        // Implement shop functionality
        // ...
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
