package ArmyGame.soldier;

import ArmyGame.order.Healing;
import ArmyGame.order.SpecialHealingAbility;
import ArmyGame.order.SpecialMagicAbility;

public class GondorHealer extends ArmySoldier implements Healing, SpecialHealingAbility {
    private static final int healingPoint = 5;
    private static final SoldierType soldierType = SoldierType.HEALER;
    private static final String quote = "Cross over into the light.";

    public GondorHealer(String name) {
        super(healingPoint, soldierType, name, quote);

    }

    @Override
    public void soldierReport() {

        System.out.println("Soldier " + super.getName() + " type: " + GondorHealer.soldierType + " is here. --- Quote: " + GondorHealer.quote);
    }

    @Override
    public void heal() {

        if (soldierType == SoldierType.HEALER) {
            System.out.println("GondorHealer " + super.getName() + " heals " + healingPoint + " hit points to our wounded soldier.");
            System.out.println();
        }
    }

    @Override
    public void powerHealing() {
        System.out.println("GondorHealer " + super.getName() + " Special ability: The world is indeed full of peril, and in it there are many dark places; but still there is much that is fair. (+8 hit points)");
        System.out.println();

    }

}
