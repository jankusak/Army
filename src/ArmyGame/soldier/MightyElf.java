package ArmyGame.soldier;

import ArmyGame.order.Deffensive;
import ArmyGame.order.Healing;
import ArmyGame.order.Magical;
import ArmyGame.order.Offensive;

public class MightyElf extends ArmySoldier implements Healing, Magical, Offensive {
    private static final int damage = 15;
    private static final int magicalDamage = 30;
    private static final SoldierType soldierType = SoldierType.MIGHTY;
    private static final String quote = "Do not be afraid. You are not alone.";

    public MightyElf(String name) {
        super(damage, soldierType, name, quote);
        int magicalDamage = getMagicalDamage();

    }

    public int getMagicalDamage(){
        return magicalDamage;
    }
    public void getMagic() {

        System.out.println("Special ability: You have no power here, servant of Morgoth! (Destroys enemy necromancer)");
    }

    public void getPowerAttack() {
        System.out.println("Special ability: But the hearts of men are easily corrupted. (Destroys the men who serve the Dark Lord)");
    }

    public void getHealing() {
        System.out.println("Special ability: Light of Earendil - May it be a light to you in dark places, when all other lights go out. (Heals all wounds)");
    }

    @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + MightyElf.soldierType + " is here. --- Quote: " + MightyElf.quote);
    }


    @Override
    public void heal() {
        if (soldierType == SoldierType.MIGHTY) {
            System.out.println("MightyElf " + super.getName() + " is here to save you all.");
            getHealing();
            System.out.println();
        }

    }

    @Override
    public void spell() {
        if (soldierType == SoldierType.MIGHTY) {
            System.out.println("MightyElf " + super.getName() + " deals " + magicalDamage + " magical damage.");
            getMagic();
            System.out.println();
        }

    }

    @Override
    public void attack() {
        if (soldierType == SoldierType.MIGHTY) {
            System.out.println("MightyElf " + super.getName() + " deals " + damage + "  damage.");
            getPowerAttack();
            System.out.println();
        }
    }
}
