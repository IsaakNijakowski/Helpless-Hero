public class Weapon {
    String name;
    int damage;
    int magicDamage;
    int delay;

    public Weapon(String name, int damage, int magicDamage, int delay) {
        this.name = name;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.delay = delay;
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
}