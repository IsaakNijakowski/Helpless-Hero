import java.util.ArrayList;

public class Player {
    int maxHealth = 20;
    int health = 20;
    int maxArmor = 0;
    int armor;
    
    ArrayList<Weapon> playerWeapons = new ArrayList<>();
    ArrayList<Shield> playerShields = new ArrayList<>();
    public Player() {}
    //Set
    public void setHealth(int health) {
        this.health = health;
    }
    public void giveWeapon(Weapon weapon) {
        playerWeapons.add(weapon);
    }
    //Get
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getMaxArmor() {
        return maxArmor;
    }
    public ArrayList<Weapon> getPlayerWeapons() {
        return playerWeapons;
    }
    public ArrayList<Shield> getPlayerShields() {
        return playerShields;
    }
}
