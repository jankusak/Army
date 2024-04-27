package ArmyGame.soldier;

import ArmyGame.order.Deffensive;
import ArmyGame.order.SpecialAttackAbility;

public class ElvenArcher extends ArmySoldier implements Deffensive, SpecialAttackAbility {
    private static final int damage = 4;
    private static final SoldierType soldierType = SoldierType.DEFENDER;
    private static final String quote = "Let the arrow find its target.";

    public ElvenArcher(String name) {
        super(damage, soldierType, name, quote);

    }

    @Override
    public void soldierReport() {

        System.out.println("Soldier " + super.getName() + " type: " + ElvenArcher.soldierType + " is here. --- Quote: " + ElvenArcher.quote);
    }

    @Override
    public void defend() {
        System.out.println("ElvenArcher " + super.getName() + " deals " + damage + " damage.");
        System.out.println();
    }

    @Override
    public void powerAttack() {
        System.out.println("ElvenArcher " + super.getName() + " Special Show them no mercy! For you shall receive none! (+7 damage)");
        System.out.println();

    }
}
