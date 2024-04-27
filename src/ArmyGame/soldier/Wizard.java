package ArmyGame.soldier;

import ArmyGame.order.Magical;

public class Wizard extends ArmySoldier implements Magical {

    private static final int magicalDamage = 10;
    private static final SoldierType soldierType = SoldierType.WIZARD;
    private static final String quote = "You shall not pass!";


    public Wizard(String name) {

        super(magicalDamage, soldierType, name, quote);
    }

    public void getSpell() {
        System.out.println("Special ability: Run You Fools! (+8 speed)");
    }

      @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + Wizard.soldierType + " is here. --- Quote: " + Wizard.quote);
    }

    @Override
    public void spell() {
        if (soldierType == SoldierType.WIZARD) {
            System.out.println("Wizard " + super.getName() + " deals " + magicalDamage + " magical damage.");
            getSpell();
            System.out.println();
        }
    }
}
