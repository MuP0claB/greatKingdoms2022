package game.monsters;

import game.GameData;

public class Sasquatch extends Monster {

    public Sasquatch() {
        super("Sasquatch", 100, 170);
    }

    public void fightWithSasquatch() {
        if(GameData.currentHero.healthPoints >=1 && GameData.currentHero.location.getMonster().getMonsterPoints() >=1){
            System.out.println("Welcome to the battle with Sasquatch!");
            System.out.println("Fight !");
            super.fightWithMonster();
        }
    }
}
