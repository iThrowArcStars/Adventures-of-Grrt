

public class Calamity {
    public static int phase = 0;
    static int roll = (int) (Math.random() * 1) + 1;
    public static char[] calamityPhase;
    public Calamity() {
    }
    public static String calamityCard() {
        switch(roll) {
            case 1:
                System.out.println("You have been bit by a non-venomous snake. Good Luck.");
                break;
        }
        return null;
    }
    public static void calamityPhase() {
        switch(roll) {
            case 1:
                System.out.println("You take damage. ");
                powershell.playerHealth -= 15;
        }
    }
}
