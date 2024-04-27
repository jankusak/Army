package ArmyGame.soldier;

import ArmyGame.order.Deffensive;

public class DwarfPaladin extends ArmySoldier implements Deffensive {

    private static final int damage = 4;
    private static final SoldierType soldierType = SoldierType.DEFENDER;
    private static final String quote = "I swear to you I will not let my brothers die.";

    public DwarfPaladin(String name) {
        super(damage, soldierType, name, quote);
    }

    public void getDwarfFury() {
        System.out.println("Special ability: Baruk Khazâd! Khazâd ai-mênu! (+8 morale to all soldiers)");
        ;
    }

    @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + DwarfPaladin.soldierType + " is here. --- Quote: " + DwarfPaladin.quote);
    }

    @Override
    public void defend() {

        if (soldierType == SoldierType.DEFENDER) {
            System.out.println("DwarfPaladin " + super.getName() + " deals " + damage + " damage.");
            getDwarfFury();
            System.out.println();

        }
    }
}
