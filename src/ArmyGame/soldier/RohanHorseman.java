package ArmyGame.soldier;

import ArmyGame.order.Offensive;

public class RohanHorseman extends ArmySoldier implements Offensive {

    private static final int damage = 6;
    private static final SoldierType soldierType = SoldierType.ATTACKER;
    private static final String quote = "Ride now, ride now, ride! Ride for ruin, and the world’s ending!";

    public RohanHorseman(String name) {
        super(damage, soldierType, name, quote);

    }


    public void getCharge() {
        System.out.println("Special ability: Arise, arise, riders of Théoden! (+8 morale, + 6 damage)");
    }

    @Override
    public void soldierReport() {
        System.out.println("Soldier " + super.getName() + " type: " + RohanHorseman.soldierType + " is here. --- Quote: " + RohanHorseman.quote);
    }

    @Override
    public void attack() {
        if (soldierType == SoldierType.ATTACKER) {
            System.out.println("RohanHorseman " + super.getName() + " deals " + damage + " damage.");
            getCharge();
            System.out.println();
        }
    }
}
