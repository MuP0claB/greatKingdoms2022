package game;

public class Sasquatch extends Monster {

    public Sasquatch() {
        super("Sasquatch", 100, 220);
    }

    @Override
    void monsterFightChallenge() {
     areMissionsCompleted();
    }
}
