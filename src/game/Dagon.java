package game;

public class Dagon extends Monster {

    public Dagon() {
        super("Dagon", 100, 220);
    }

    void monsterFightChallenge() {
        areMissionsCompleted();
    }
    public void fightWithDagon () {
        fightWithMonster();
    }
}
