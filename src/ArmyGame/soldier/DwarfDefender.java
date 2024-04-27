package ArmyGame.soldier;

import ArmyGame.order.Deffensive;
import ArmyGame.order.SpecialAttackAbility;

public class DwarfDefender extends ArmySoldier implements Deffensive, SpecialAttackAbility {

    private static final int damage = 4;
    private static final SoldierType soldierType = SoldierType.DEFENDER;
    private static final String quote = "I swear to you I will not let my brothers die.";

    public DwarfDefender(String name) {
        super(damage, soldierType, name, quote);
    }

    @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + DwarfDefender.soldierType + " is here. --- Quote: " + DwarfDefender.quote);
    }

    @Override
    public void defend() {
        System.out.println("DwarfDefender " + super.getName() + " deals " + damage + " damage.");
        System.out.println();
    }

    @Override
    public void powerAttack() {
        System.out.println("DwarfDefender " + super.getName() + " Special ability: Baruk Khazâd! Khazâd ai-mênu! (+8 morale to all soldiers)");
        System.out.println();
    }
}
