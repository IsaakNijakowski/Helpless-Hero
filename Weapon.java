import javax.swing.*;
public class Weapon {
    String name;
    int damage;
    int magicDamage;
    int delay;
    ImageIcon icon;
    String description;
    //Player
    

    public Weapon(String name, int damage, int magicDamage, int delay, String iconLocation, String description) {
        this.name = name;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.delay = delay;
        icon = new ImageIcon(iconLocation);
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public int getDamage() {
        return damage;
    }
    public int getMagicDamage() {
        return magicDamage;
    }
    public int getDelay() {
        return delay;
    }
    public String toString() {
        return name;
    }
    public ImageIcon getIcon() {
        return icon;
    }
    public String getDescription() {
        return description;
    }
}