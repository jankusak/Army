package ArmyGame.soldier;

import ArmyGame.order.Magical;
import ArmyGame.order.SpecialMagicAbility;

public class Wizard extends ArmySoldier implements Magical, SpecialMagicAbility {

    private static final int magicalDamage = 10;
    private static final SoldierType soldierType = SoldierType.WIZARD;
    private static final String quote = "You shall not pass!";


    public Wizard(String name) {

        super(magicalDamage, soldierType, name, quote);
    }

    @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + Wizard.soldierType + " is here. --- Quote: " + Wizard.quote);
    }

    @Override
    public void spell() {

        System.out.println("Wizard " + super.getName() + " deals " + magicalDamage + " magical damage.");
        System.out.println();

    }

    @Override
    public void powerMagic() {
        System.out.println("Wizard " + super.getName() + " Special ability: Run You Fools! (+8 speed)");
        System.out.println();
    }

}

