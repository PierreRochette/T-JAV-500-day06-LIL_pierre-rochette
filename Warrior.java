public class Warrior extends Character {

    public Warrior(String name) {
        super(name, "Warrior");
        this.life = 100;
        this.agility = 8;
        this.strength = 10;
        this.wit = 3;
        System.out.println(name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        super.attack(weapon);
        if(!weapon.equalsIgnoreCase("hammer") &&
        !weapon.equalsIgnoreCase("sword")) {
        } else {
            System.out.println(name + ": I'll crush you with my " + weapon + "!");
        }
    }
}
