public class roomGen {
    static void roomGenerator() {
        System.out.println("You walk into a room");
        mobGen
        System.out.println("The room contains a chest however there is a " + mobType + " guarding the room. ");
        answerRG = readLine("Press 'R' to run. Otherwise press 'F' to fight");
        fighting();
    }
}
