import java.util.Scanner;

public class roomGen {
    private static Scanner scanner = new Scanner(System.in);
    private static String readLine(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
    static void randomRoom() {
        System.out.println("You walk into a room, there is an enemy ahead.");
        mobGen.randomMob();
        System.out.println("You can choose to fight this foe or flee.");
        String answerStr = readLine("Press 'Y' to fight. Press 'N' to run.");
        switch (answerStr) {
            case "Y":
            case "y":
                fighting.result();
                break;
            case "N":
            case "n":
                System.out.println("You successfully escape the dungeon.");
                System.out.println();
                adv.lifeStatusAdv();
                break;
        }
        
    }
}