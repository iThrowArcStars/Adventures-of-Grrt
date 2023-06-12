public class fighting {
    public static int remainingMobHP;
    public static void result() {
        remainingMobHP = mobGen.mobHP[mobGen.roll] - powershell.playerDamage; 
        powershell.playerHealth = powershell.playerHealth - mobGen.mobDMG[mobGen.roll];
        if(powershell.playerHealth <= 0) {
            System.out.println("You Have Died. You're Returning To The Start Screen. Better Luck Next Time. ");
            Invalid.invalidPhase();
        } else {
            System.out.println("You have " + powershell.playerHealth + " health left. ");
        }
        if(remainingMobHP >= 1) {
            System.out.println("Mobs remaining health: " + remainingMobHP);
        }
        if(remainingMobHP == 0) {
            System.out.println("The monster has been slain! ");
            System.out.println("You have gained 15 gold. ");
            powershell.gold += 15;
        }
    }
}
