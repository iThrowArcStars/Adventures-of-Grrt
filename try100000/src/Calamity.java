import java.util.Scanner;

public class Calamity {
    private static Scanner scanner = new Scanner(System.in);
    public static int phase = 0;
    static int roll = (int) (Math.random() * 1) + 1;
    public static char[] calamityPhase;
    public Calamity() {
    }
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }

    private static int readInt(String question) {
        System.out.println(question);
        return scanner.nextInt();
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
