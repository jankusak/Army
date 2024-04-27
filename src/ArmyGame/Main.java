package ArmyGame;


import ArmyGame.soldier.*;

public class Main {
    public static void main(String[] args) {

        final ElvenArcher elvenArchers1 = new ElvenArcher("Haldir");
        final ElvenArcher elvenArchers2 = new ElvenArcher("Legolas");
        final DwarfPaladin dwarfPaladin1 = new DwarfPaladin("Gimli");
        final RohanHorseman rohanHorseman1 = new RohanHorseman("Theoden");
        final RohanHorseman rohanHorseman2 = new RohanHorseman("Eomer");
        final GondorHealer gondorHealer1 = new GondorHealer("Faramir");
        final Wizard wizard1 = new Wizard("Gandalf the White");
        final MightyElf mightyElf1 = new MightyElf("Galadriel");

        final Army army = new Army();
        army.addSoldier(elvenArchers1);
        army.addSoldier(elvenArchers2);
        army.addSoldier(dwarfPaladin1);
        army.addSoldier(rohanHorseman1);
        army.addSoldier(rohanHorseman2);
        army.addSoldier(gondorHealer1);
        army.addSoldier(wizard1);
        army.addSoldier(mightyElf1);


        army.displaySoldierReport();
        army.displayDefense();
        army.displayAttack();
        army.displaySpell();
        army.displayHealing();


    }
}