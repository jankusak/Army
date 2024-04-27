package ArmyGame.soldier;

import ArmyGame.order.Deffensive;

public class ElvenArcher extends ArmySoldier implements Deffensive {
    private static final int damage = 4;
    private static final SoldierType soldierType = SoldierType.DEFENDER;
    private  static  final  String quote = "Let the arrow find its target.";

    public ElvenArcher(String name) {
        super(damage, soldierType, name, quote);

    }

    public static  void getStormOfArrow() {
        System.out.println("Special ability: Volley of arrows (+4 damage)");
    }


    @Override
    public void soldierReport() {

        System.out.println("Soldier " + super.getName() + " type: " + ElvenArcher.soldierType + " is here. --- Quote: " + ElvenArcher.quote);
    }

    @Override
    public void defend() {
        if (soldierType == SoldierType.DEFENDER){
            System.out.println( "ElvenArcher " + super.getName() + " deals " + damage + " damage.");
            getStormOfArrow();
            System.out.println();
        }
    }
}
