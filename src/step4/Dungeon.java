package step4;

public class Dungeon {

    // player
    public static int maxHP = 100; // we imply, 0 HP is min
    public static int currentHP = 100; // static class variable
    public static int maxItemCount = 3;
    public static int currentItemCount = 0;

    // healing potion
    public static int smallPotionHP = 10;
    public static int bigPotionHP = 30;

    public static void main(String[] args) {

        // on adventure
        // TODO damage

        boolean canChestBeLooted = false;
        canChestBeLooted = openChest(canChestBeLooted);

        /*
        // test run of our potion implementation
        currentHP = 50;
        useHealingPotion(smallPotionHP);
        useHealingPotion(bigPotionHP);
        useHealingPotion(bigPotionHP);
        if (currentHP != 100) System.err.println("Something's wrong with the healing implementation!!!");
        */
    }

    /*
     @return the new value of chest lootable
     */
    public static boolean openChest(boolean canChestBeLooted) {
        if (canChestBeLooted && currentItemCount < maxItemCount) {
            currentItemCount++;
            return false;
        } else {
            return canChestBeLooted;
        }
    }

    public static void useHealingPotion(int potionHP) {
        if (currentHP < maxHP) {
            currentHP += potionHP;
            if (currentHP > maxHP) currentHP = maxHP;
        }
    }
}
