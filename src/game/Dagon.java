package game;

public class Dagon extends Monster {

    public Dagon() {
        super("Dagon", 100, 220);
    }

    @Override
    void monsterFightChallenge() {
        areMissionsCompleted();
    }

    @Override
    int monsterDamage() {
        return 0;
    }
}
