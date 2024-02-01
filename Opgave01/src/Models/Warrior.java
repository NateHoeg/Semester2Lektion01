package Models;

import java.util.ArrayList;

public class Warrior extends Character {
    private ArrayList<Weapon> weapons = new ArrayList<>();

    public Warrior(String name, int level) {
        super(name, level);
    }

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }
}
