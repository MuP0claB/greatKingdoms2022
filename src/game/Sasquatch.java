package game;

import java.util.Random;

public class Sasquatch extends Monster {

    public Sasquatch() {
        super("Sasquatch", 100, 170);
    }

    @Override
    void monsterFightChallenge() {
        System.out.println(areMissionsCompleted());
        System.out.println(monsterDamage());
        //TODO while hero HP>0 repeat until smn die.(
        //TODO build logic for the fight
    }

    @Override
    int monsterDamage() {
        Random rand = new Random();
        int monsterDamage = 0;

        switch(GameData.currentHero.defense) {
            case 0:
                 monsterDamage = rand.nextInt(50,60);
                 break;
            case 10:
                monsterDamage = rand.nextInt(40,50);
                break;
            case 20:
                monsterDamage= rand.nextInt(30,40);
                break;
            case 30:
                monsterDamage= rand.nextInt(20,30);
                break;
            case 40:
            monsterDamage= rand.nextInt(10,20);
            break;
            default:
                monsterDamage = rand.nextInt(1,10);
        }

        return monsterDamage;
    }
}
