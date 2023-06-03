public class fighting {
    public static int remainingMobHP;
    static void result() {
        remainingMobHP = mobGen.mobHP[mobGen.roll] - powershell.playerDamage; 
        powershell.playerHealth = powershell.playerHealth - mobGen.mobDMG[mobGen.roll];
        System.out.println("You have " + powershell.playerHealth + "health left. ");
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
