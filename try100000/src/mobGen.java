public class mobGen {
    //set array
    //Pull from array 
    //return mob 
    static int[] mobDMG = {25, 35, 45};
    static String[] mobType = {"Skele", "Zombie", "Wizzard"};
    static int[] mobHP = {25, 35, 45};
    public static void damage() {
        int roll =  (int) (Math.random() * 3) + 1;
        System.out.println(mobDMG[roll]);
        System.out.println(mobType[roll]);
        System.out.println(mobHP[roll]);
    }
}

        
        

