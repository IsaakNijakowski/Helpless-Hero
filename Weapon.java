import javax.swing.*;
public class Weapon {
    int index;
    String name;
    int damage;
    int magicDamage;
    int delay;
    ImageIcon icon;
    String description;
    Player player;
    int kills;
    

    public Weapon(int index, String name, int damage, int magicDamage, int delay, String iconLocation, String description) {
        this.index = index;
        this.name = name;
        this.damage = damage;
        this.magicDamage = magicDamage;
        this.delay = delay;
        icon = new ImageIcon(iconLocation);
        this.description = description;
    }
    public int damageBoost() {
        int boost = 0;
        for (Weapon weapon : player.getPlayerWeapons()) {
            switch (weapon.getIndex()) {
                case(2):
                boost += 15;
                break;
            }
        }
        for (Shield shield : player.getPlayerShields()) {
            switch (shield.getIndex()) {
                case(2):
                boost += 5;
                break;
                case(3):
                int rand = (int) Math.floor(Math.random()*10);
                if (rand == 0);
                boost += damage;
                break;
                case(11):
                boost += Math.floor(player.getMaxArmor()/10)*5;
                break;
            }
        }
        return boost;
    }
    public int magicBoost() {
        int boost = 0;
        for (Shield shield : player.getPlayerShields()) {
            switch(shield.getIndex()) {
                case(4): 
                boost += 10;
                break;
                case(6):
                boolean valid = false;
                for (Weapon weapon : player.getPlayerWeapons()) {
                    if (weapon.getMagicDamage() == 0) {
                        valid = false;
                        break;
                    }
                }
                if (boost != 0) {
                    valid = true;
                }
                if (valid) {
                    boost += 5;
                }
                break;
            }
        }
        return boost;
    }
    public int delayBoost() {
        int boost = 0;
        for (Weapon weapon : player.getPlayerWeapons()) {
            switch (weapon.getIndex()) {
                case(1):
                boost += 15;
                break;
            }
        }
        for (Shield shield : player.getPlayerShields()) {
            switch (shield.getIndex()) {
                case(0):
                boost += 5*player.getPlayerWeapons().size();
                break;
                case(1):
                boost += 10;
                break;
                case(8):
                boost -= 15;
                break;
            }
        }
        return boost;
    }
    public int attackValueDamage() {
        int value = damage;
        switch (index) {
            case(0):
            boolean valid = true;
            for (Weapon weapon: player.getPlayerWeapons()) {
                if (weapon.getMagicDamage() >= 5) {
                    valid = false;
                    break;
                }
            }
            if (magicBoost() >= 5) {
                valid = false;
            }
            if (valid) {
                value = damage*2;
            }
            break;
            case(4):
            value = 0;
            break;
            case(8):
            if (player.getPlayerWeapons().size() == 3) {
                if (player.getPlayerWeapons().get(2).index == 8) {
                    value = (damage*5)+(25*kills);
                }
            } else {
                value = damage+(5*kills);
            }
            break;
            case(9):
            value = damage+((int) Math.floor(delay/50))*5;
            break;
            case(11):
            if (player.getMaxArmor() >= 30) {
                value = damage+15;
            }
            break;
        }
        return value + damageBoost();
    }
    public int getIndex() {
        return index;
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
    public String getHTMLDescription() {
        String string = new String(description);
        return string.replaceAll("\n", "<br>");
    }
}