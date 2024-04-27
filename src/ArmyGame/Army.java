package ArmyGame;

import ArmyGame.order.Deffensive;
import ArmyGame.order.Healing;
import ArmyGame.order.Magical;
import ArmyGame.order.Offensive;
import ArmyGame.soldier.ArmySoldier;
import ArmyGame.soldier.SoldierType;
import ArmyGame.soldier.Wizard;

import java.util.ArrayList;
import java.util.List;

public class Army {
    private final List<ArmySoldier> soldiers;

    public Army() {

        this.soldiers = new ArrayList<>();
    }

    public void addSoldier(ArmySoldier soldier) {

        this.soldiers.add(soldier);
    }

    public void displaySoldierReport() {
        System.out.println("-------REPORT--------");
        for (ArmySoldier soldier : soldiers) {
            soldier.soldierReport();
        }
        System.out.println();
    }


    public void displaySpell() {
        System.out.println("-------SPELL--------");

        for (ArmySoldier soldier : soldiers) {
            if (soldier instanceof Magical) {
                ((Magical) soldier).spell();
            }
        }
    }

    public void displayHealing() {
        System.out.println("-------HEALING--------");

        for (ArmySoldier soldier : soldiers) {
            if (soldier instanceof Healing) {
                ((Healing) soldier).heal();
            }
        }
    }

    public void displayDefense() {
        System.out.println("-------DEFENSE--------");

        for (ArmySoldier soldier : soldiers) {
            if (soldier instanceof Deffensive) {
                ((Deffensive) soldier).defend();
            }
        }
    }

    public void displayAttack() {
        System.out.println("-------ATTACK--------");

        for (ArmySoldier soldier : soldiers) {
            if (soldier instanceof Offensive) {
                ((Offensive) soldier).attack();
            }
        }
    }

}
