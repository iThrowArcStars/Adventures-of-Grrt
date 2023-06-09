public class mobGen {
    //set array
    //Pull from array 
    //return mob 
    static int roll =  (int) (Math.random() * 3);
    static int[] mobDMG = {25, 35, 45};
    static String[] mobType = {"Skele", "Zombie", "Wizzard"};
    static int[] mobHP = {25, 35, 45};
    
    public static void randomMob() {
        System.out.println();
        System.out.println("The mob is a: " + mobType[roll]);
        System.out.println("The mobs damage is: " + mobDMG[roll]);
        System.out.println("The mobs health is: " + mobHP[roll]);
        System.out.println();
    }
}

        
        

