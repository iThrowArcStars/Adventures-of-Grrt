import java.util.Scanner;


public class powershell {

    private static Scanner scanner = new Scanner(System.in);
    public static int playerHealth = 100;
    public static int gold = 0;
    public static int dmg = 20;
    public static int defense = 0;
    public enum PHASE {
        INVALID,
        ADVENTURE,
        CALAMITY,
        TOWN,
        DUNGEON
    }

    public static void main(String[] args) {
        Invalid.invalidPhase();
        adv.adventurePhase();
    }
}
