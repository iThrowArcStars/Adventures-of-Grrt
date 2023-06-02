public class fighting {
    private static void fighting() {
        switch(answerRG) {
            case "R":
                System.out.println("You aquire a calamity card(will be added)");
                break;
            case "r":
                System.out.println("You aquire a calamity card(will be added)");
                break;
            case "F":
                mobHealth = mobHP - playerDMG;
                playerHealth = playerHealth - mobDMG;
                System.out.println("You have " + playerHealth + "health left. ");
                if(mobHealth >= 1) {
                    System.out.println("Mobs remaining health: "+ mobHealth);
                }
                if(mobHealth == 0) {
                    System.out.println("The monster has been slain! ");
                    System.out.println("You have gained 15 gold. ");
                    mobStatus = false;
                }
            case "f":
                mobHealth = mobHP - playerDMG;
                playerHealth = playerHealth - mobDMG;
                System.out.println("You have " + playerHealth + "health left. ");
                if(mobHealth >= 1) {
                    System.out.println("Mobs remaining health: "+ mobHealth);
                }
        }
    }
}
