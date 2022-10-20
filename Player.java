import java.util.ArrayList;

public class Player {
    int health;
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
    public int getHealth() {
        return health;
    }
    public ArrayList<Weapon> getPlayerWeapons() {
        return playerWeapons;
    }
    public ArrayList<Shield> getPlayerShields() {
        return playerShields;
    }
}
