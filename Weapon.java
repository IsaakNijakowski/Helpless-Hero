import javax.swing.*;
public class Weapon {
    String name;
    int damage;
    int magicDamage;
    int delay;
    String description;
    ImageIcon icon;

    public Weapon(String name, int damage, int magicDamage, int delay) {
        this.name = name;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.delay = delay;
        icon = new ImageIcon("./itemIcons/twin_knives.png");
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
}