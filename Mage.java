public class Mage extends Character{

    public Mage(String name) {
        super(name, "Mage");
        this.life = 70;
        this.agility = 10;
        this.strength = 3;
        this.wit = 10;
        System.out.println(name + ": May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        super.attack(weapon);
        if(!weapon.equalsIgnoreCase("magic") &&
        !weapon.equalsIgnoreCase("wand")) {
        } else {
            System.out.println(name + ": Feel the power of my " + weapon + "!");
        }
    }

}
