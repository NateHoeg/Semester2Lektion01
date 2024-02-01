import Models.*;

public class Tests {
    public static void main(String[] args) {
        Barbarian fofstelr = new Barbarian("Fofstelr", 5);
        Weapon longsword = new Weapon("Longsword");
        fofstelr.addWeapon(longsword);
        Ranged shortbow = new Ranged("Shortbow", 80);
        fofstelr.addWeapon(shortbow);

        Wizard orlamaex = new Wizard("Orlamaex", 5);
        Spell fireball = new Spell(150, Duration.INSTANTANEOUS);
        orlamaex.addSpell(fireball);


    }
}
