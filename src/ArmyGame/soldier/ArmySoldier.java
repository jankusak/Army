package ArmyGame.soldier;

public abstract class ArmySoldier {

    private final int damage;
    private final SoldierType soldierType;
    private final String name;


    public ArmySoldier(int damage, SoldierType soldierType, String name, String quote) {
        this.damage = damage;
        this.soldierType = soldierType;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void soldierReport();
}
