public class fighting {
    public static int remainingMobHP;
    public static void result() {
        remainingMobHP = mobGen.mobHP[mobGen.roll] - powershell.playerDamage; 
        powershell.playerHealth = powershell.playerHealth - mobGen.mobDMG[mobGen.roll];
        System.out.println("You have " + powershell.playerHealth + " health left. ");
        if(powershell.playerHealth == 0) {
            System.out.println("You Have Died. You're Returning To The Start Screen. Good Luck Next Time. ");
            Invalid.invalidPhase();
        }
        if(remainingMobHP >= 1) {
            System.out.println("Mobs remaining health: "+ mobGen.mobHP);
        }
        if(remainingMobHP == 0) {
            System.out.println("The monster has been slain! ");
            System.out.println("You have gained 15 gold. ");
            powershell.gold += 15;
        }
    }
}
