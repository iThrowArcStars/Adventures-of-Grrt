public class Dungeon {
    public static void dungeonPhase() {
        roomGen.roomGenerator();
        if(mobStatus == false) {
            phase = 2;
        }
    }
}
